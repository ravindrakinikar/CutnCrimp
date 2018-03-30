'use strict';

angular.module('Home')

.factory('HomeService', [ '$http', '$rootScope', function($http, $rootScope) {
	var service = {};

	service.getModels = function(callback) {
		var modelUrl = "model";
		$http({
			url : modelUrl,
			method : "GET"
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});
	};

	service.getMachines = function(callback) {
		var machineUrl = "machine";
		$http({
			url : machineUrl,
			method : "GET"
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});
	};

	service.getLeadByModel = function(modelId, callback) {
		var leadUrl = "model/" + modelId + "/lead";
		$http({
			url : leadUrl,
			method : "GET"
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});
	};

	service.saveLeadFactory = function(leadFactory, callback) {
		var url = "leadfactory";
		$http({
			url : url,
			method : "POST",
			data : leadFactory,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});

	}

	service.saveEmployeeShift = function(empShift, callback) {
		var url = "employeeshift";
		$http({
			url : url,
			method : "POST",
			data : empShift,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});

	}

	service.getAllWires = function(callback) {
		var userIdUrl = "wire";
		$http({
			url : userIdUrl,
			method : "GET",
			params : {
				token : 'testToken'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});

	}

	service.getAllShifts = function(callback) {
		var url = "shifts";
		$http({
			url : url,
			method : "GET"

		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});

	}

	service.getAllTerminals = function(callback) {
		var url = "terminal";
		$http({
			url : url,
			method : "GET"

		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		});

	}

	return service;
} ])

.factory('ActualsOneService',
		[ '$http', '$rootScope', function($http, $rootScope) {
			var service = {};

			service.saveActualsOne = function(leadactualsone, callback) {
				var url = "leadactualsone";
				$http({
					url : url,
					method : "POST",
					data : leadactualsone,
					headers : {
						'Content-Type' : 'application/json'
					}
				}).success(function(response) {
					callback(response);
				}).error(function(response) {
					callback(response, true);
				});

			}

			service.getLeadById = function(leadId, callback) {
				var url = "lead/" + leadId;
				$http({
					url : url,
					method : "GET"

				}).success(function(response) {
					callback(response);
				}).error(function(response) {
					callback(response, true);
				});

			}

			return service;
		} ])

.factory('AdminService', [ '$http', '$rootScope', function($http, $rootscope) {
	var service = {};

	service.getAllLeadFactoryAdmin = function(callback) {
		var url = "leadfactory";
		$http({
			url : url,
			method : "GET",			
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		})
	}
	
	service.getAllLeadFactory = function(machineNo, callback) {
		var url = "leadfactory/" +machineNo;
		$http({
			url : url,
			method : "GET",			
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		})
	}
	
	service.getAllLeadFactoryByStatus = function(status, callback) {
		var url = "leadfactory/status/" +status;
		$http({
			url : url,
			method : "GET",			
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		})
	}
	
	service.setStatus = function(id,status, callback) {
		var url = "leadfactory/status/" +id+"?status="+status;
		$http({
			url : url,
			method : "PUT",			
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			callback(response);
		}).error(function(response) {
			callback(response, true);
		})
	}
	return service;
} ])
