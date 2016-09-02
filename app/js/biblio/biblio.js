angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {

		$routeProvider.when('/ajoutMedia', {
			templateUrl: 'html/biblio/creation-media.html',
			controller: 'CreationMediaCtrl'
		});

		/*$routeProvider.when('/rencontre', {
			templateUrl: 'template/jeu/rencontre.html',
			controller: 'RencontreCtrl'
		}).when('/bonjour/:name', {
			templateUrl: 'template/jeu/bonjour.html',
			controller: 'BonjourCtrl'
		}).when('/boude', {
			templateUrl: 'template/jeu/boude.html'
		}).when('/jeu', {
			templateUrl: 'template/jeu/jeu.html',
			controller: 'JeuCtrl',
		}).otherwise({
			redirectTo:'/rencontre'
		});*/
	});