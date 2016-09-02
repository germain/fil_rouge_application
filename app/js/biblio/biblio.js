angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {


		$routeProvider.when('/ajoutMedia', {
			templateUrl: 'html/biblio/creation-media.html',
			controller: 'CreationMediaCtrl'
		});


		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/html/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});
		$routeProvider.when('/recherche-adherent', {
			templateUrl: 'html/biblio/recherche-adherant.html',
			controller: 'rechercheAdherantCtrl',		
		});		
		$routeProvider.when('/modification-adherent', {
			templateUrl: 'html/biblio/modification-adherent.html'
		
		});
		$routeProvider.when('/modification-adherent', {
			templateUrl: 'html/biblio/modification-adherent.html'
		});
		$routeProvider.when('/creation-adherent', {
			templateUrl: 'html/biblio/creation-adherent.html',
			controller: 'CreationMediaCtrl'
		});
	});