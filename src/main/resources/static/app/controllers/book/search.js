(function () {

    angular.module('model-controller')
        .controller('bookSearchController', function ($scope, bookSearchService) {
            $scope.message = 'search book';

            $scope.searchBook = function searchBook() {

                bookSearchService.GetAll()
                    .success(function (response) {
                        $scope.books = response;
                    }).error(function () {
                    alert("Error occurred");
                });

            };
            
        })

})();

