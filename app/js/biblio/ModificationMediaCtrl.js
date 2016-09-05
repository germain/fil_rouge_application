angular.module('biblio').controller('ModificationMediaCtrl', function($scope, $routeParams, media){
			
			$scope.id = $routeParams.id;
			//$scope.myData = media.getMedia();
			media.getMedia($routeParams.id).then(function(data){				
				console.log(data);
				$scope.toAddMedia = {
									titre :data.titre,
									auteur :data.auteur, 
									type:data.type
									};
			});			
						
			$scope.modificationmedia = function(){
				console.log("Controleur modification du media" + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
				media.modificationmedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);				
			};
			
});