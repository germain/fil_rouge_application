angular.module("biblio")
   .controller('rechercheAdherentCtrl', ['$scope', '$filter', function ($scope, $filter) {
        $scope.items = [
            { id: 2502332, name: 'Jocelyn' },
            { id: 236662, name: 'Germain' },
            { id: 2447853, name: 'Yanis' },
            { id: 565661, name: 'Nathanael' },
            { id: 5, name: 'ABCD' }];
        $scope.items2 = $scope.items;
        $scope.$watch('search', function (val) {
            $scope.items = $filter('filter')($scope.items2, val);
    });
 }]);