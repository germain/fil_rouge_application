angular.module('biblio')
	.controller('ModificationAdherentCtrl', function($scope, $routeParams, serviceAdherent, $timeout) {
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

		serviceAdherent.getAdherent($routeParams.id).then(function(ad) {
			var adherentTmp = angular.copy(ad); 
			adherentTmp.date_naissance = new Date(ad.date_naissance);
			adherentTmp.adresse = ad.adresse;

			$scope.adherent = adherentTmp;
		}, function(error) {
			/*console.log(error.message);*/
			$scope.error = error.data;
			console.log(error.data.message);
		});

		$scope.modifyAdherent = function(adherent) {
			serviceAdherent.modifyAdherent(adherent).then(function(response) {
				console.log(response);
				$scope.modificationSuccess = true;
				$scope.modifAdhForm.$setPristine(true);
				$timeout(function() {
					$scope.modificationSuccess = false;
				}, 2000);
			}, function(error) {
				/*console.log(error.message);*/
				console.log(error.data.message);
				$scope.error = error.data;
			});
		};

	});