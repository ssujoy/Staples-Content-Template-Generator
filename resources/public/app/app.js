$(window).load(function(){
    $('#modalAlert').modal('show');
});


var app = angular.module("MyApp", ['ngRoute','ngAnimate']);


app.controller('templateController',['$scope', function($scope) {
    $scope.test = 'Hi from Template Controller';
}]);


app.controller('testController',['$scope', function($scope) {
    $scope.test = 'Test Controller';
    //$scope.pageClass = 'page-test';
    $('#modalAlert1').modal('show');
}]);


app.controller('testController2',['$scope', function($scope) {
    $scope.pageClass = 'page-modal';
    $('#modalAlert').modal('show');
}]);



app.config(['$routeProvider',function ($routeprovider){
    $routeprovider
        .when('/generateTemplate',
        {
            templateUrl: '/generateTemplate',
            controller: 'testController',
            controllerAs: ''
        })
    .when('/generateModal',
        {
            templateUrl: '/generateModal',
            controller: 'testController2',
            controllerAs: ''
        });

}]);






