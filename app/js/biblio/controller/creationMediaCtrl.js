angular.module('biblio')
	.controller('CreationMediaCtrl', function($scope, $location){

		$scope.ajoutMedia = function(){
			if($scope.formCreationMedia.$valid){
			$location.url('/recherche-media');
		}
		}

	});