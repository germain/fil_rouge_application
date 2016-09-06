angular.module('biblio').controller('ConnexionCtrl',  ['$scope', '$location', 'serviceConnexion',function ($scope, $location, serviceConnexion) {
        $scope.connecter = function () {
            $scope.dataLoading = true;
            serviceConnexion.connexion($scope.email, $scope.password).then(function(response) {
                if(response) {                    
                    $scope.dataLoading = false;
                } else {
                    $scope.error = "Connexion échouée";
                    $scope.dataLoading = false;
                }
            }); 
        }; 
    }]);
		