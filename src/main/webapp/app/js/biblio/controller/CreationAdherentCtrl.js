angular.module('biblio').controller('CreationAdherentCtrl',	function($scope, $routeParams, serviceAdherent) {
			$scope.id = $routeParams.id;

			$scope.validAdherent = function() {
				if ($scope.formAdh.$valid) {
					serviceAdherent.createAdherent($scope.toAddAdherent.nom,
							$scope.toAddAdherent.prenom,
							$scope.toAddAdherent.dateNat,
							$scope.toAddAdherent.email,
							$scope.toAddAdherent.adresse,
							$scope.toAddAdherent.codePost,
							$scope.toAddAdherent.ville,
							$scope.toAddAdherent.datePaie,
							$scope.toAddAdherent.montant);
				};
			}

});