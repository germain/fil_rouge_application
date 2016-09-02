angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {

		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/html/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});
		$routeProvider.when('/recherche-adherent', {
			templateUrl: 'html/biblio/recherche-adherent.html',
			controller: 'rechercheAdherentCtrl',		
		});		
		$routeProvider.when('/modification-adherent', {
			templateUrl: 'html/biblio/modification-adherent.html'
		
		});
	});