

angular.module('biblio').controller('ModalRechercheAdherentCtrl', function($scope, $uibModal, adherent, param, $uibModalInstance){
	console.log("dd", param.id);
	
	adherent.getAdherent(param.id).then(function(data){				
		console.log(data);
		$scope.toAddAdherent = {
							id :data.id,
							nom :data.nom
							};
	});	
});

