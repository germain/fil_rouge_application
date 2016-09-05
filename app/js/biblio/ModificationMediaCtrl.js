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
						
			$scope.ajoutmedia = function(){
				media.postMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type)
//				console.log($scope.toAddMedia.titre);
//				console.log($scope.toAddMedia.auteur);
//				console.log($scope.toAddMedia.type);
			};
			
});