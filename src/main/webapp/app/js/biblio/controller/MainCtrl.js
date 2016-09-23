angular.module('biblio')
	.controller('MainCtrl', function($scope, serviceConnexion) {
		$scope.isConnected = serviceConnexion.isConnected;
	});