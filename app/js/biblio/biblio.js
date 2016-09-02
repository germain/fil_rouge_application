angular.module('biblio', ['ngRoute'])
	.config(function ($routeProvider) {
		$routeProvider.when('/modification-media/:id', {
			templateUrl: '/html/biblio/modification-media.html', 
			controller: 'ModificationMediaCtrl'			
		});
		$routeProvider.otherwise({ 
			redirectTo: '/404'			
		});
	});