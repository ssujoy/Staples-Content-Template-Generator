$(window).load(function(){
    $('#modalAlert').modal('show');
});


var progressBar =angular.module('progressBar',[]);
if (!!window.EventSource) {
    var source = new EventSource("/events");

    //alert("Your browser supports Server-sent events! Please upgrade it!");

} else {
    alert("Your browser does not support Server-sent events! Please upgrade it!");
}

source.addEventListener("message", function(e) {
    console.log(e.data);
}, false);

source.addEventListener("open", function(e) {
    console.log("Connection was opened. hehe ...");
}, false);

progressBar.controller('progressBarCtrl',['$scope', function($scope) {
    $scope.pgStates =[
        {uploadState:"QUEUED", pgValue:0, pgStatus:true},
        {uploadState: "IN_PROCESS",pgValue:50, pgStatus:true},
        {uploadState: "PROCESSED",pgValue:100, pgStatus:true},
        {uploadState: "ERROR",pgValue:100, pgStatus:false}];
}]);
