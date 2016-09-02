angular.module('biblio')
	.controller('ConnexionCtrl', function($scope, $location){

		$scope.connecter = function(){
			if($scope.formConnexion.$valid){
			$location.url('/recherche-media');
		}
		}

	});