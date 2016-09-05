angular.module('biblio')
	.controller('CreationMediaCtrl', function($scope, $location){

		$scope.ajoutMedia = function(){
			if($scope.formCreationMedia.$valid){
				$location.url('/recherche-media');
			}
		}
				
		$scope.ajoutmedia = function(){
			console.log("Controlleur creation du media" + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
			media.postMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);			
		};

	});