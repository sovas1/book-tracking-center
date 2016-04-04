// customDirectives.js

(function () {

    angular.module('custom-directives', [])

    .directive('allButtons', function () {
        return {
            restrict: 'E',
            templateUrl: "pages/index_content/allButtons.html"
        };
    })

    .directive('animatedBackground', function () {
        return {
            restrict: 'E',
            templateUrl: "pages/index_content/animatedBackground.html"
        };
    });

})();