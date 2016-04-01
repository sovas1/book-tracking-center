(function () {
    
    angular.module('model-controller')
        .factory('bookAddService', function ($http) {
            return {
                AddBook : function (name) {
                    return $http.post('book/', {
                        // TODO implement post logic
                    })
                }
            }
        });

})();