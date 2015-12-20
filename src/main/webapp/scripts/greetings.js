(function() {

	'use strict';

	function greetingsCtrl($scope, $http) {
		console.log("Início controler");
		$scope.init = function() {
			$http.get('http://localhost:8080/greeting').success(function(data) {
				$scope.greeting = data.message;
			})
		};
		$scope.update = function() {
			$http({
				method : "post",
				url : "http://localhost:8080/greeting/post",
				data : {
					greeting : $scope.newGreeting
				},
				headers : {
					'Content-Type' : 'application/x-www-form-urlencoded'
				}
			}).success(function (data){
				console.log("asdfsad");
			});
		};
	}

	angular.module('app', []).controller('greetingsCtrl', greetingsCtrl);

})();