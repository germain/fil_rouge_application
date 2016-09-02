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
		/*}).when('/bonjour/:name', {
			templateUrl: 'template/jeu/bonjour.html',
			controller: 'BonjourCtrl'
		}).when('/boude', {
			templateUrl: 'template/jeu/boude.html'
		}).when('/jeu', {
			templateUrl: 'template/jeu/jeu.html',
			controller: 'JeuCtrl',
		}).otherwise({
			redirectTo:'/rencontre'*/
		});
	});