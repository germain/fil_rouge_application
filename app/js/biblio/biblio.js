angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {
		$routeProvider.when('/biblio', {
			templateUrl: 'html/biblio/recherche-adherant.html',
			controller: 'rechercheAdherantCtrl',
		});
	});