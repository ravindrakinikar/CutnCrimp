'use strict';

angular.module('Authentication')

.factory('AuthenticationService',
    ['$http', '$rootScope',
    function ( $http, $rootScope) {
        var service = {};
        
        service.SetCredentials = function (empId) {
            $rootScope.currentEmp=empId;
        }

        service.Login = function (empId,password,callback) {

         
        	$http({
        	    url: '/login', 
        	    method: "POST",
        	    params: {empId:empId,emp_password:password}
        	 }).success(function (response) {
                 callback(response,false);
             }).error(function(response){
            	 callback(response,true);
            	 console.log("error true");
             });

            /* Use this for real authentication
             ----------------------------------------------*/
          /*  $http.get('/login?username=mahesh&password=kumar')
                .success(function (response) {
                    callback(response);
                });*/

        	};
        
        	return service;
     }])


