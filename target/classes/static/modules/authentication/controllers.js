'use strict';

angular.module('Authentication')

.controller(
		'LoginController',
		[
				'$scope',
				'$location',
				'AuthenticationService',
				function($scope, $location, AuthenticationService) {
					// reset login status
					// AuthenticationService.ClearCredentials();

					$scope.login = function() {
						$scope.dataLoading = true;
						
						AuthenticationService.Login($scope.username, $scope.password,function(
								response, isError) {
							if (!isError) {
								AuthenticationService
										.SetCredentials(response);
								$scope.employe = response;
								//$location.path('/home')
								if(response.role=="ADMIN"){
								 $location.path('/admin');
								}
								else{
									 $location.path('/worker');
								}
								$scope.dataLoading = false;
							} else {
								$scope.error = response.message;
								$scope.dataLoading = false;
							}
						});
					};
					
					/*$scope.submit=function(){
						 $location.path('/home');
					}*/

				} ]);