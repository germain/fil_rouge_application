angular.module('biblio')
.controller('ModalRechercheAdherentCtrl', function($scope, $uibModal, serviceAdherent, param, $uibModalInstance){
	console.log("ModalRechercheAdherentCtrl");
	
	serviceAdherent.getAdherent(param.id).then(function(data){				
		console.log(data);
		$scope.adherentDetails = angular.copy(data);
	});	
});
