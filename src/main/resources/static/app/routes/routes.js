// routes.js

(function () {

    angular.module('routes', ['ngRoute'])

    // routes configuration
    .config(function ($routeProvider, $locationProvider) {
        $routeProvider

            // route for the home page
            .when('/', {
                templateUrl: 'pages/main_view_content/home.html',
                controller: 'mainController'
            })

            // route for the about page
            .when('/about', {
                templateUrl: 'pages/main_view_content/about.html',
                controller: 'aboutController'
            })

            // route for the contact page
            .when('/contact', {
                templateUrl: 'pages/main_view_content/contact.html',
                controller: 'contactController'
            })                

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