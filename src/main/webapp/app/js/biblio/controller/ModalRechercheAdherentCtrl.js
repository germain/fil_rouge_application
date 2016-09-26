angular.module('biblio')
.controller('ModalRechercheAdherentCtrl', function($scope, $uibModal, serviceAdherent, param, $uibModalInstance, serviceEmprunt){
	console.log("ModalRechercheAdherentCtrl");
	
	$scope.emprunt = {};
	
	$scope.emprunt.id_emprunteur = param.id;
	
	serviceAdherent.getAdherent(param.id).then(function(data){				
		console.log(data);
		$scope.adherentDetails = angular.copy(data);
	});	
	
	$scope.addEmprunt = function() {
		serviceEmprunt.postEmprunt($scope.emprunt.id_emprunteur, $scope.emprunt.id_media, $scope.emprunt.date_emprunt);
	}
});
