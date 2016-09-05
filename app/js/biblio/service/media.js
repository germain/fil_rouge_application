// factory() / service()	=> Il y a besoin d'un autre service
//							=> Il n'y a pas besoin d'initialisation
angular.module('biblio').factory('media',function($http, $timeout){
	return {
		getRechercheMedia : function(id){		
			  console.log(id);
			  return $http.get("http://192.168.10.41:8090/resource/media.recherche?titre="+id).then(function (response) {				 
				  return response.data; 
				  //console.log(data);
			  });		 
		},
		getMedia : function(id){			
			  return $http.get("http://192.168.10.41:8090/resource/media.accession?id="+id).then(function (response) {				 
				  return response.data; 
				  //console.log(data);
			  });		 
		},
		modificationmedia : function(id, titre, auteur, type){				
			console.log("Webservice modification du media - " + id + " - "+ titre + " - " + auteur + " - " + type);
			$http.post('http://192.168.10.41:8090/resource/media.modification', { id: id, 
			 	 titre : titre,
			 	 auteur : auteur,
			 	 type : type
		 	   }).then(function (response) {				 
				  //return response.data; 
				  console.log(response);
			  });
			
		},	
		creationMedia : function(titre, auteur, type){			
			console.log("Webservice creation du media" + titre + " " + auteur + " " + type);
			var req = {
					 method: 'POST',
					 url: 'http://192.168.10.41:8090/resource/media.creation',
					 data: { titre : titre,
						 	 auteur : auteur,
						 	 type : type
					 	   }
					}			
			$http(req).then(function (response) {				 
				  //return response.data; 
				  console.log(response);
			  });
		}	
	};
});