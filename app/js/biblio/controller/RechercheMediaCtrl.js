angular.module("biblio")
   .controller('RechercheMediaCtrl', function ($scope, $location, $routeParams, $filter, $uibModal, media) {
	   
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
		
		$scope.open = function (id) {			
			
			$uibModal.open({
			      templateUrl: 'view/modal/recherche-media.html'
			    });
			return;			
			
			var item = {		      
//				      ariaLabelledBy: 'modal-title',
//				      ariaDescribedBy: 'modal-body',
				      templateUrl: './recherche-media.html',
				      //controller: 'ModalInstanceCtrl',
				      //controllerAs: '$ctrl',
//				      size: size,
				      resolve: {
				        cekjveu: {
				        	id : id
				        }
				      }
				    }
		 };
		
		 // on injecte la variable cekjveu dans le controleur, 
				
		
   });
