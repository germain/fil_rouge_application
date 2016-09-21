angular.module('biblio').factory('serviceConnexion',function($http){
	var isConnected = false;
	return {
		connexion : function(identifiant, motdepasse){
			
			var auth = btoa(identifiant + ':' + motdepasse); 
			
			var config = {
				headers : {
					'Authorization': 'Basic '+auth
				}	
			};
			return $http.get('http://localhost:8090/resource/connexion.rights', config).then(function(){
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
			