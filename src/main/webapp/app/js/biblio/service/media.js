// factory() / service()	=> Il y a besoin d'un autre service
//							=> Il n'y a pas besoin d'initialisation
angular.module('biblio').factory('media',function($http, $timeout){
	var serveur = 'localhost';
	var port = '8080';
	var application = 'bib/rest';
	return {
		getRechercheMedia : function(chaine){			  
			  return $http.get("http://"+serveur+":"+port+"/"+application+"/media", {params:{titre:chaine}}).then(function (response) {				 
				  return response.data; 
			  });		 
		},
		getMedia : function(id){			
			  return $http.get("http://"+serveur+":"+port+"/"+application+"/media", {params:{id:id}}).then(function (response) {				 
				  return response.data; 
			  });		 
		},
		modificationmedia : function(id, titre, auteur, type){				
			console.log("Webservice modification du media - " + id + " - "+ titre + " - " + auteur + " - " + type);
			$http.post('http://'+serveur+':'+port+'/'+application+'/media/:id', { id: id, 
			 	 titre : titre,
			 	 auteur : auteur,
			 	 type : type
		 	   }).then(function (response) {				 
				  console.log(response);
			  });
			
		},	
		creationMedia : function(titre, auteur, type){			
			console.log("Webservice creation du media" + titre + " " + auteur + " " + type);
			var req = {
					 method: 'POST',
					 url: 'http://'+serveur+':'+port+'/'+application+'/createMedia',
					 data: { titre : titre,
						 	 auteur : auteur,
						 	 type : type
					 	   }
					}
			$http(req).then(function (response) {				 
				  console.log(response);
			  });
		}	
	};
});