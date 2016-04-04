(function () {
    
    angular.module('model-controller')
        .factory('bookAddService', function ($http) {
            return {
                AddBook : function (aut, tit, pag, pagR) {
                    return $http.post('book/', {
                        author    : aut,
                        title     : tit,
                        pages     : pag,
                        pagesRead : pagR
                    })
                }
            }
        });

})();