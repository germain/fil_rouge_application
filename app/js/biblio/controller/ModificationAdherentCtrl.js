angular.module('biblio')
	.controller('ModificationAdherentCtrl', function($scope, $routeParams, serviceAdherent){
		serviceAdherent.getById($routeParams.id).then(function(ad) {
			var adherentTmp = angular.copy(ad);
			adherentTmp.date_naissance = new Date(ad.date_naissance);
			adherentTmp.adresse = 
			$scope.adherent = adherentTmp;
		});
	});