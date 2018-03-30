'use strict';

angular
		.module('Home')

		.controller(
				'HomeController',
				[
						'$scope',
						'$location',
						'HomeService',
						'$rootScope',
						function($scope, $location, HomeService, $rootScope) {
							$rootScope.date = new Date();
							HomeService.getAllShifts(function(response, isErr) {
								if (!isErr) {
									$scope.shifts = response;
								}
							});

							HomeService
									.getMachines(function(response, isError) {
										if (!isError) {
											$scope.machines = response;
										} else {
											alert("cannot delete messages");
										}
									});

							HomeService.getModels(function(response, isError) {
								if (!isError) {
									$scope.models = response;
								} else {
									alert("cannot delete messages");
								}

							});

							HomeService.getAllTerminals(function(response,
									isError) {
								if (!isError) {
									$scope.terminals = response;
								} else {
									alert("cannot delete messages");
								}

							});

							$scope.getLead = function(selected) {
								console.log(selected);
								HomeService
										.getLeadByModel(
												selected.id,
												function(response, isError) {
													if (!isError) {
														$scope.leads = response;
													} else {
														alert("cannot delete messages");
													}

												})
							}

							$scope.saveLeadFactory = function() {
								/*
								 * var shiftData = {}; shiftData.empNo =
								 * $rootScope.currentEmp.id; shiftData.shiftNo =
								 * $scope.selectedShift.shiftNo;
								 * HomeService.saveEmployeeShift(shiftData,
								 * function(response, isError) {
								 * console.log(response); })
								 */
								var data = {};
								data.machineNo = $scope.machine.machineNo;
								// data.model=$scope.model.id;
								data.leadNo = $scope.lead.id;
								data.foNo = $scope.foNo;
								data.cutQuantity = $scope.qty;
								data.batchNo = $scope.batchNumber;
								data.terminalNumber = $scope.terminalNumber;
								data.status = "CREATED";

								$rootScope.formData = {};
								$rootScope.formData.lead = $scope.lead.id;
								$rootScope.formData.machine = $scope.machine.machineName;
								$rootScope.formData.model = $scope.model.name;
								$rootScope.formData.quantity = $scope.qty;
								$rootScope.formData.batchNumber = $scope.batchNumber;
								$rootScope.formData.terminalNumber = $scope.terminalNumber;
								// $rootScope.formData.shiftNo =
								// $scope.selectedShift.shiftNo;
								HomeService.saveLeadFactory(data, function(
										response, isError) {
									console.log(response);
									$rootScope.formData.lfNo = response.lfNo;
								})
								$location.path('/admin');
							}

						}])

		.controller(
				'ActualsOne',
				[
						'$scope',
						'$location',
						'AdminService',
						'ActualsOneService',
						'$rootScope',
						function($scope, $location,AdminService, ActualsOneService,
								$rootScope) {
							$scope.leadActualsArray = [];
							$scope.actual1 = {};
							$scope.actual2 = {};
							$scope.actual3 = {};
							$scope.color = 'true';
							// $scope.shiftNo = $rootScope.formData.shiftNo;
							$scope.machine = $rootScope.formData.machine;
							$scope.leadActuals = {};
							ActualsOneService
									.getLeadById(
											$rootScope.selectedLead.leadNo,
											function(response, isError) {
												console.log(response);
												$scope.leadActualsArray
														.push(response);
												console
														.log($scope.leadActualsArray);
												// $scope.actual1={};
												$scope.leadActuals.lead = response.id;
												$scope.leadActuals.model = $rootScope.formData.model;
												$scope.leadActuals.color = response.color;
												$scope.leadActuals.gauge = response.gauge;
												$scope.leadActuals.batchNo = response.batchNumber;
												$scope.leadActuals.type = response.side_type;
												$scope.leadActuals.strands = response.strands;
												$scope.leadActuals.coroDia = response.coro_dia;
												$scope.leadActuals.crimpHeight = response.crimp_height;
												$scope.leadActuals.crimpWidth = response.crimp_width;
												$scope.leadActuals.factoryNumber = response.factoryNumber;
												$scope.leadActuals.pullForce = response.pull_force;
												$scope.leadActuals.stripLength = response.strip_length;
												$scope.leadActuals.wayback = response.wayback;
												$scope.leadActuals.wireLength = response.wire_length;

												// alert("successfully saved");
											})

							$scope.saveActualsOne = function() {
								AdminService.setStatus(
										$rootScope.selectedLead.lfNo,
										"COMPLETED", function(resp, isError) {
											console.log("updated status");
										})

								var data = {};

								// data.model=$scope.model.id;
								data.crimpHeight1 = $scope.actual1.wireLength1;
								data.crimpHeight2 = $scope.actual1.wireLength2;
								data.crimpHeight3 = $scope.actual1.wireLength3;
								data.crimpHeight4 = $scope.actual1.wireLength4;
								data.crimpHeight5 = $scope.actual1.wireLength5;
								data.wireLength1 = $scope.actual1.wireWidth1;
								data.wireLength2 = $scope.actual1.wireWidth2;
								data.wireLength3 = $scope.actual1.wireWidth3;
								data.wireLength4 = $scope.actual1.wireWidth4;
								data.wireLength5 = $scope.actual1.wireWidth5;
								data.lfNo = $rootScope.selectedLead.lfNo;

								ActualsOneService
										.saveActualsOne(
												data,
												function(response, isError) {
													console.log(response);
													$scope.leadActualsArray
															.push(response);
													console
															.log($scope.leadActualsArray);
													$scope.actual1 = {};
													// alert("successfully
													// saved");
												})

								var data = {};

								// data.model=$scope.model.id;
								data.crimpHeight1 = $scope.actual2.wireLength1;
								data.crimpHeight2 = $scope.actual2.wireLength2;
								data.crimpHeight3 = $scope.actual2.wireLength3;
								data.crimpHeight4 = $scope.actual2.wireLength4;
								data.crimpHeight5 = $scope.actual2.wireLength5;
								data.wireLength1 = $scope.actual2.wireWidth1;
								data.wireLength2 = $scope.actual2.wireWidth2;
								data.wireLength3 = $scope.actual2.wireWidth3;
								data.wireLength4 = $scope.actual2.wireWidth4;
								data.wireLength5 = $scope.actual2.wireWidth5;
								data.lfNo = $rootScope.selectedLead.lfNo;

								ActualsOneService
										.saveActualsOne(
												data,
												function(response, isError) {
													console.log(response);
													$scope.leadActualsArray
															.push(response);
													console
															.log($scope.leadActualsArray);
													$scope.actual2 = {};
													// alert("successfully
													// saved");
												});

								if ($rootScope.selectedLead.cutQuantity >= 3000) {

									var data = {};

									// data.model=$scope.model.id;
									data.crimpHeight1 = $scope.actual3.wireLength1;
									data.crimpHeight2 = $scope.actual3.wireLength2;
									data.crimpHeight3 = $scope.actual3.wireLength3;
									data.crimpHeight4 = $scope.actual3.wireLength4;
									data.crimpHeight5 = $scope.actual3.wireLength5;
									data.wireLength1 = $scope.actual3.wireWidth1;
									data.wireLength2 = $scope.actual3.wireWidth2;
									data.wireLength3 = $scope.actual3.wireWidth3;
									data.wireLength4 = $scope.actual3.wireWidth4;
									data.wireLength5 = $scope.actual3.wireWidth5;
									data.lfNo = $rootScope.selectedLead.lfNo;

									ActualsOneService
											.saveActualsOne(
													data,
													function(response, isError) {
														console.log(response);
														$scope.leadActualsArray
																.push(response);
														console
																.log($scope.leadActualsArray);
														$scope.actual3 = {};
														// alert("successfully
														// saved");
													});

								}
								$location.path('/worker');
							}
							
						}])

		.controller(
				'AdminController',
				[
						'$scope',
						'$location',
						'AdminService',
						'HomeService',
						'$rootScope',
						function($scope, $location, AdminService, HomeService,
								$rootScope) {
							$scope.sampleArray = [];
							$scope.leadActuals = [];
							$scope.status = "CREATED";

							HomeService
									.getMachines(function(response, isError) {
										if (!isError) {
											$scope.machines = response;
										} else {
											alert("cannot delete messages");
										}
									});

							$scope.redirect = function() {
								$location.path('/home');
							};

							AdminService.getAllLeadFactoryAdmin(function(
									response, isError) {

								if (!isError) {
									$scope.leadActuals = response;
								}

								$scope.leadActuals = response;
							});

						}])

		.controller(
				'WorkerController',
				[
						'$scope',
						'$location',
						'AdminService',
						'HomeService',
						'$rootScope',
						function($scope, $location, AdminService, HomeService,
								$rootScope) {
							$scope.sampleArray = [];
							$scope.leadActuals = [];

							HomeService
									.getMachines(function(response, isError) {
										if (!isError) {
											$scope.machines = response;
										} else {
											alert("cannot delete messages");
										}
									});

							$scope.redirect = function(leadActual) {
								$rootScope.formData = {};
								$rootScope.selectedLead = leadActual;
								AdminService.setStatus(leadActual.lfNo,
										"IN_PROGRESS", function(resp, isError) {
											console.log("updated status");
											//$location.path('/actualsone');
										});
								$location.path('/actualsone');
								
							};

							$scope.getMachine = function(machine) {
								AdminService.getAllLeadFactory(
										machine.machineNo, function(response,
												isError) {
											console.log(response);
											if (!isError) {
												$scope.leadActuals = response;
											}
											// console.log(sampleArray);

											$scope.leadActuals = response;
											/*
											 * $scope.leadActuals.lfNo =
											 * response.lfNo;
											 * $scope.leadActuals.stripLength =
											 * response.stripLength;
											 * $scope.leadActuals.crimpWidth =
											 * response.crimpWidth;
											 * $scope.leadActuals.pullForce =
											 * response.pullForce;
											 * $scope.leadActuals.appearance =
											 * response.appearance;
											 */

										});
							}
						}])