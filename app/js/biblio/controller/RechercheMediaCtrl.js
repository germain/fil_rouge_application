angular.module("biblio")
   .controller('RechercheMediaCtrl', function ($scope, $location, $routeParams, $filter, media) {
	   
        $scope.items = "";
        $scope.titre = $routeParams.titre;
        //console.log($scope.titre);
        
        $scope.RechercheMedia = function(){
        	console.log("Controleur recherche du media " + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
        	
        	//Appel du Service : passe une chaine de caractère comme titre
        	media.getRechercheMedia($scope.toAddMedia.titre).then(function(data){
        		$scope.list = data;
    			console.log(data);	
    		});	
			
		};
		
				
		
   });
            