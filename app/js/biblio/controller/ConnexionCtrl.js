angular.module('biblio').controller('ConnexionCtrl',  ['$scope', '$location', 'serviceConnexion',function ($scope, $location, serviceConnexion) {
        $scope.connecter = function () {
            $scope.dataLoading = true;
            serviceConnexion.connexion($scope.email, $scope.password).then(function(response) {
                if(response) {                    
                    $location.path('/recherche-media');
                } else {
                    $scope.error = "Connexion échouée";
                    $scope.dataLoading = false;
                }
            }); 
        }; 
    }]);
		