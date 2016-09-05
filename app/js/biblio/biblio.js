angular.module('biblio', ['ngRoute', 'ngMessages'])
	.config(function ($routeProvider) {		
		$routeProvider.when('/creation-media', {
			templateUrl: 'html/biblio/creation-media.html',
			controller: 'CreationMediaCtrl'
		});
		$routeProvider.when('/connexion', {
			templateUrl: 'html/biblio/connexion.html',
			controller: 'ConnexionCtrl'
		});
		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/html/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});

		$routeProvider.when('/recherche-adherent', {
			templateUrl: 'html/biblio/recherche-adherent.html',
			controller: 'rechercheAdherentCtrl'	
		});	

		$routeProvider.when('/modification-adherent/:id', {
			templateUrl: 'html/biblio/modification-adherent.html',
			controller: 'ModificationAdherentCtrl'
		});
	
		$routeProvider.when('/recherche-media', {
			templateUrl: 'html/biblio/recherche-media.html',
			controller: 'RechercheMediaCtrl'	
		});
		
		$routeProvider.when('/recherche-media/:titre', {
			templateUrl: 'html/biblio/recherche-media.html',
			controller: 'RechercheMediaCtrl'	
		});

		$routeProvider.when('/creation-adherent', {
			templateUrl: 'html/biblio/creation-adherent.html',
			controller: 'CreationAdherentCtrl'
		});
	});