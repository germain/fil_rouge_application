angular.module('biblio').factory('serviceConnexion',function($http){
	var isConnected = false;
	return {
		connexion : function(identifiant, motdepasse){
			
			var auth = btoa(identifiant + ':' + motdepasse); 
			
			var config = {
				headers : {
					'Access-Control-Allow-Origin' : '*',
					'Authorization': 'Basic '+auth
				}	
			};			
			return $http.get('http://localhost:8080/bib/rest/adherent/2', config).then(function(){
				$http.defaults.headers.common['Authorization'] = 'Basic '+auth;
				isConnected = true
				return true;
			}, function(){
				$http.defaults.headers.common['Authorization'] = 'Basic';
				return false;
			});
		},
		isConnected: function() {
			return isConnected;
		}		
	};
});
			