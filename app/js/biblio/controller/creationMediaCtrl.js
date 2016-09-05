angular.module('biblio')
	.controller('CreationMediaCtrl', function($scope, $location, $routeParams, media){

		$scope.ajoutMedia = function(){
			if($scope.formCreationMedia.$valid){
				//$location.url('/recherche-media');
			}
		}
				
		$scope.ajoutmedia = function(){
			console.log("Controleur creation du media " + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
			//media.postMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);	
			media.creationMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);
		};

	});