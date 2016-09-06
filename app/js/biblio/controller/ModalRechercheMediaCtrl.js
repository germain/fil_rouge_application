angular.module('biblio').controller('ModalRechercheMediaCtrl', function($scope, $uibModal, media, param, $uibModalInstance, serviceEmprunt){
			
			console.log("dd", param.id);
			
			media.getMedia(param.id).then(function(data){				
				console.log(data);
				$scope.toAddMedia = {
									id :data.id,
									titre :data.titre,
									auteur :data.auteur, 
									type:data.type
									};
			});	
			
			
			
			$scope.ok = function () {
				console.log('fds');
				$uibModalInstance.close();
			};
			
//			serviceEmprunt.postEmprunt(nom, date_retour, date_emprunt).then(function(data){				
//				console.log(data);
//				$scope.toAddMedia = {
//									id :data.id,
//									titre :data.titre,
//									auteur :data.auteur, 
//									type:data.type
//									};
//			});	
			
});