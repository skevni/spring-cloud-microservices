(function () {
    angular.module("cloud-app", ['ngRoute'])
        .config(config)
        .run(run)

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: "start/start.html",
                controller: "startController"
            })
            .when('/products', {
                templateUrl: "products/products.html",
                controller: "productsController"
            })
            .otherwise({
                redirectTo: "/"
            });
    }

    function run($rootScope, $http) {

    }
})();
