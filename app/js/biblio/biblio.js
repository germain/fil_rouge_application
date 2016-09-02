angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {
		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/html/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});
		$routeProvider.otherwise({  
			redirectTo: '/404'			
		});
		$routeProvider.when('/modification-adherent', {
			templateUrl: 'html/biblio/modification-adherent.html'
		});
		$routeProvider.when('/modification-adherent', {
			templateUrl: 'html/biblio/modification-adherent.html'
		});
		$routeProvider.when('/creation-adherent', {
			templateUrl: 'html/biblio/creation-adherent.html'
		});
	});