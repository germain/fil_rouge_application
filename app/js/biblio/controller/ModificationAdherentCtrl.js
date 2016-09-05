angular.module('biblio')
	.controller('ModificationAdherentCtrl', function($scope, $routeParams, serviceAdherent){
		var handleAdress = function(adress) {
			var adressInfoName1 = "ligne1";
			var adressInfoName2 = "ligne2";
			var adressStr = "";

			if (adress != undefined && adress != null) {
				adressStr += (adress[adressInfoName1] || "") + " " + (adress[adressInfoName2] || "");
			}

			return adressStr;
		};

		var handleCity = function(adress) {
			adressInfoNeeded = "ville";
			var adressStr = "";
			if (adress != undefined && adress != null) {
				adressStr += (adress[adressInfoNeeded] || "");
			}
			return adressStr;
		};

		serviceAdherent.searchAdherent($routeParams).then(function(ad) {
			var adherentFound = ad[0]; //In this case only one adherent
			
			var adherentTmp = angular.copy(adherentFound); 
			adherentTmp.date_naissance = new Date(adherentFound.date_naissance);
			adherentTmp.adresse = adherentFound.adresse;

			$scope.adherent = adherentTmp;
		});
	});