angular.module("biblio").controller('rechercheAdherentCtrl',
		function($scope, $location, $routeParams, $filter, $uibModal, serviceAdherent) {
	
		$scope.RechercheAhderent = function() {
			console.log("Controleur recherche adherent " + $scope.Adherent.id + " nom: " + $scope.Adherent.nom);

			if ($scope.Adherent.id != null) {
				var param = {
					"id" : $scope.Adherent.id
				};
			} else if ($scope.Adherent.nom != null) {
				var param = {
					"nom" : $scope.Adherent.nom
				};
			} else {
				var param = {
					"id" : $scope.Adherent.id,
					"nom" : $scope.Adherent.nom
				};
			}			
			serviceAdherent.searchAdherent(param).then(function(data) {
				$scope.list = data;
				console.log(data);
			}
		 )};
		 
         $scope.tri = function(colonne){
                 $scope.maVarDeTrie = colonne;
                 /*console.log("variable tri" + $scope.maVarDeTrie);*/
          };    

			$scope.orderByName = function() {
			};

//			$scope.open = function() {
//				$uibModal.open({
//					templateUrl : 'view/modal/recherche-adherent.html',
//					controller : 'ModalRechercheAdherentCtrl',
//					resolve : {
//						param : {
//							id : '5'
//						}
//					}
//				});
//			}
			
			$scope.open = function () {		
				$uibModal.open({
				      templateUrl: 'view/modal/recherche-adherent.html',
				      controller: 'ModalRechercheAdherentCtrl',
				      resolve: {
					        param: {
					        	id : '5'
					        }
					      }
				    });
			 };
		});
       