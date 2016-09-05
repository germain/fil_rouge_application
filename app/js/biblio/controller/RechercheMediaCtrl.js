angular.module("biblio")
   .controller('RechercheMediaCtrl', function ($scope, $location, $routeParams, $filter, media) {
        $scope.items = "";
        
        $scope.RechercheMedia = function(){
			//console.log("Controleur creation du media " + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
			//media.postMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);	
			//media.getRechercheMedia($scope.toAddMedia.titre, $scope.toAddMedia.auteur, $scope.toAddMedia.type);
		};
		
		
   }]);
            