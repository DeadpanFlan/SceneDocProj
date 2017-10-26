'use strict'

var app = angular.module('UserTableApp', ['ui.bootstrap']);

app.controller('userCtrl',  function($scope,$http, $uibModal){
	$scope.gender = {
		0: "Unknown",
		1: "Male",
		2: "Female",
		9: "Not Applicable"
	};

	$http.get("/users")
	.then(function(res){
		$scope.users = res.data;
	})
	
	$scope.open = function(id){
		var modalInstance = $uibModal.open({
			templateUrl: "templates/editUser.html",
			controller: "modalCtrl",
			resolve: {
				user: function(){
					return $scope.users.find(x => x.id === id);
				}
			}
		});
		
		modalInstance.result.then(function(user){
			$http.put("/users/"+user.id, user)
			.then(function(){
				$scope.refresh();
			})
		});
	}
	
	$scope.newUser = function(){
		var modalInstance = $uibModal.open({
			templateUrl: "templates/newUser.html",
			controller: "modalCtrl",
			resolve: {
				user: function(){
					return {};
				}
			}
		});
		
		modalInstance.result.then(function(user){
			$http.post("/users", user)
			.then(function(){
				$scope.refresh();
			})
		});
	}
	
	$scope.del = function(id){
		$http.delete("/users/"+id)
		.then(function(){
			$scope.refresh();
		});
	}
	
	$scope.refresh = function(){
		$http.get("/users")
		.then(function(res){
			$scope.users = res.data;
		});
	}
	
})

app.controller('modalCtrl', function($uibModalInstance, $scope,$http, user){
	$scope.gender = [
		{id: 0, name: "Unknown"},
		{id: 1, name: "Male"},
		{id: 2, name: "Female"},
		{id: 9, name: "Not Applicable"},
		
	];
	$scope.user = JSON.parse(JSON.stringify(user));
	
	$scope.submit = function (){
		$uibModalInstance.close($scope.user);
	}
	
	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
})