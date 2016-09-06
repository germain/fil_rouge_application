angular.module('biblio', ['ngRoute', 'ngMessages', 'ui.bootstrap'])
	.config(function ($routeProvider) {
		
		$routeProvider.when('/creation-media', {
			templateUrl: 'view/biblio/creation-media.html',
			controller: 'CreationMediaCtrl'
		});
		$routeProvider.when('/connexion', {
			templateUrl: 'view/biblio/connexion.html',
			controller: 'ConnexionCtrl'
		});
		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/view/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});

		$routeProvider.when('/recherche-adherent', {
			templateUrl: 'view/biblio/recherche-adherent.html',
			controller: 'rechercheAdherentCtrl'		
		});	

		$routeProvider.when('/modification-adherent/:id', {
			templateUrl: 'view/biblio/modification-adherent.html',
			controller: 'ModificationAdherentCtrl'
		});
	
		$routeProvider.when('/recherche-media', {
			templateUrl: '/view/biblio/recherche-media.html',
			controller: 'RechercheMediaCtrl'	
		});
		
		$routeProvider.when('/recherche-media/:titre', {
			templateUrl: '/view/biblio/recherche-media.html',
			controller: 'RechercheMediaCtrl'	
		});

		$routeProvider.when('/creation-adherent', {
			templateUrl: '/view/biblio/creation-adherent.html',
			controller: 'CreationAdherentCtrl'
		});

		$routeProvider.otherwise({
			redirectTo:'/connexion'
		});
	});