'use strict';

// declare modules
angular.module('Authentication', []);
angular.module('Home', []);

angular.module('BasicHttpAuthExample', [
    'Authentication',
    'Home',
    'ngMaterial',
    'ngRoute',
   'xeditable',
   'ui.bootstrap'
   
]).run(function(editableOptions) {
  editableOptions.theme = 'bs3'; // bootstrap3 theme. Can be also 'bs2', 'default'
})

.config(['$routeProvider', function ($routeProvider) {

    $routeProvider
        .when('/login', {
            controller: 'LoginController',
            templateUrl: 'modules/authentication/views/login.html'
        })

        .when('/home', {
            controller: 'HomeController',
            templateUrl: 'modules/home/views/home.html'
        })
        
        .when('/actualstwo', {
            controller: 'ActualsTwo',
            templateUrl: 'modules/home/views/actualsTwo.html'
        })
        
        .when('/actualsone', {
            controller: 'ActualsOne',
            templateUrl: 'modules/home/views/actualsOne.html'
        })
        
        .when('/admin', {
            controller: 'AdminController',
            templateUrl: 'modules/home/views/admin.html'
        })
        
        .when('/worker', {
            controller: 'WorkerController',
            templateUrl: 'modules/home/views/worker.html'
        })

        .otherwise({ redirectTo: '/login' });
}])

/*.run(['$rootScope', '$location', '$cookieStore', '$http',
    function ($rootScope, $location, $cookieStore, $http) {
        // keep user logged in after page refresh
        $rootScope.globals = $cookieStore.get('globals') || {};
        if ($rootScope.globals.currentUser) {
            $http.defaults.headers.common['Authorization'] = 'Basic ' + $rootScope.globals.currentUser.authdata; // jshint ignore:line
        }

        $rootScope.$on('$locationChangeStart', function (event, next, current) {
            // redirect to login page if not logged in
            if ($location.path() !== '/login' && !$rootScope.globals.currentUser) {
                $location.path('/login');
            }
        });
    }]);
*/