(function () {
    
    angular.module('models-controller')
        .factory('bookSearchService', function ($http) {
            return {
                SearchCompany : function (id, name) {
                    return $http.get('book/', {
                        // TODO implement search logic
                    })
                }
            }
        });

})();