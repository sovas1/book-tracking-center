(function () {
    
    angular.module('model-controller')
        .factory('bookSearchService', function ($http) {
            return {
                GetAll : function () {
                    return $http.get('book/');
                }
            }
        });

})();