(function () {

    angular.module('model-controller')
        .controller('bookAddController', function ($scope, bookAddService) {
            $scope.message = 'post book';

            $scope.addBook = function addBook() {
                
                var aut  = $scope.author;
                var tit  = $scope.title;
                var pag  = $scope.pages;
                var pagR = $scope.pagesRead;

                bookAddService.AddBook(aut,tit,pag,pagR)
                    .success(function() {
                        alert("Book added");
                    })
                    .error(function() {
                    alert("Error occurred");
                });

            };
        })

})();

