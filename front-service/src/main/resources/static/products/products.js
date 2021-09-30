angular.module('cloud-app').controller('productsController', function ($scope, $http) {
    const applicationPath = 'http://localhost:8802/';

    $scope.getAllProducts = function (){
        $http.get(applicationPath + 'products')
            .then(function successCallback(response){
                $scope.products = response.data;
            }, function failureCallback(response){
                alert(response.data);
            });
    };
    $scope.getAllProducts();
});