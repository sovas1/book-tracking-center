(function () {

    angular.module('model-controller')
        .controller('bookSearchController', function ($scope, bookSearchService) {
            $scope.message = 'search book';

            $scope.searchBook = function searchBook() {

                // TODO make request to service

            };
            
        })

})();

