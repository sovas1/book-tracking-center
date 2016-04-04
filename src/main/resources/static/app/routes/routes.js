// routes.js

(function () {

    angular.module('routes', ['ngRoute'])

    // routes configuration
    .config(function ($routeProvider, $locationProvider) {
        $routeProvider

            // ROUTES FOR BOOK
            .when('/book/add', {
                templateUrl: 'pages/book/add.html',
                controller: 'bookAddController'
            })
            .when('/book/search', {
                templateUrl: 'pages/book/search.html',
                controller: 'bookSearchController'
            });
        
        // use the HTML5 History API for no # addressing
        $locationProvider.html5Mode(true);
    });

})();