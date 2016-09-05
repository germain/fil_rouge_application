angular.module('biblio').controller('CreationAdherentCtrl', function($scope, $routeParams){
			$scope.id = $routeParams.id;
			
			$scope.validAdherent = function(){
				console.log("Controleur creation d'adherent "
						+ $scope.toAddAdherent.nom + " " + $scope.toAddAdherent.prenom + " " + $scope.toAddAdherent.date);
			};
});