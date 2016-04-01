(function () {

    angular.module('models-controller')
        .controller('bookAddService', function ($scope, bookAddService) {
            $scope.message = 'post book';

            $scope.addBook = function addBook() {
                
                // TODO make request to service

            };
        })

})();

