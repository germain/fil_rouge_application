angular.module('biblio').controller('ModalRechercheMediaCtrl', function($scope, $uibModal, media, param, $uibModalInstance, serviceEmprunt, $filter){
			
			//console.log("dd", param.id);
			
			media.getMedia(param.id).then(function(data){				
				console.log("recup info livre ",data);
				
				// on récup les infos du media
				$scope.toAddMedia = {
									id :data.id,
									titre :data.titre,
									auteur :data.auteur, 
									type:data.type
									};
				
				//On récupère les emprunteurs				
	        		$scope.list_emprunt = data.emprunteurs;
	    			console.log("adh",data);				
				
			});	
									
			$scope.ok = function () {				
				$uibModalInstance.close();
			};					
			
			$scope.AjoutEmprunt = function () {
				
				//$scope.toAddEmprunt.date_retour = $filter('date')($scope.toAddEmprunt.date_retour, "yyyy-MM-dd"); 
				
				$scope.toAddEmprunt.date_emprunt_format = new Date($scope.toAddEmprunt.date_emprunt);
				//$scope.toAddEmprunt.date_retour = $filter('date')($scope.toAddEmprunt.date_retour, "yyyy-MM-dd");
				
				//$scope.toAddEmprunt.date_retour = $scope.toAddEmprunt.date_retour | date: "yyyy-MM-dd;
				console.log($scope.toAddEmprunt.id + "-" + $scope.toAddMedia.id + "-" + $scope.toAddEmprunt.date_emprunt_format);
				
				serviceEmprunt.postEmprunt($scope.toAddEmprunt.id, $scope.toAddMedia.id, $scope.toAddEmprunt.date_emprunt_format);				
				
				
			};
			

			
});