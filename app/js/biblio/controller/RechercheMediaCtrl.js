angular.module("biblio")
   .controller('RechercheMediaCtrl', function ($scope, $location, $routeParams, $filter, $uibModal, media) {
	   
        $scope.items = "";
        $scope.titre = $routeParams.titre;
        //console.log($scope.titre);
        
        media.getRechercheMedia(" ").then(function(data){
    		$scope.list = data;
			//console.log(data);	
		});	
        
        $scope.RechercheMedia = function(){
        	//console.log("Controleur recherche du media " + $scope.toAddMedia.titre + " " + $scope.toAddMedia.auteur + " " + $scope.toAddMedia.type);
        	
        	//Appel du Service : passe une chaine de caractère comme titre
        	media.getRechercheMedia($scope.toAddMedia.titre).then(function(data){
        		$scope.list = data;
    			//console.log(data);	
    		});	
			
		};
		

        $scope.tri = function(colonne){
            $scope.maVarDeTrie = colonne;
            /*console.log("variable tri" + $scope.maVarDeTrie);*/
        }; 
		
		$scope.open = function (id) {		
			$uibModal.open({
			      templateUrl: 'view/modal/recherche-media.html',
			      controller: 'ModalRechercheMediaCtrl',
			      resolve: {
				        param: {
				        	id : id
				        }
				      }
			    });
		 };
   });

