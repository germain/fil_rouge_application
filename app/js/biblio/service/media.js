// factory() / service()	=> Il y a besoin d'un autre service
//							=> Il n'y a pas besoin d'initialisation
angular.module('biblio').factory('media',function($http, $timeout){
	return {
		getMedia : function(id){			
			  return $http.get("http://192.168.10.41:8090/resource/media.accession?id="+id).then(function (response) {				 
				  return response.data; 
				  //console.log(data);
			  });		 
		},
		modificationmedia : function(titre, auteur, type){			
			console.log("Webservice MAJ du media" + titre + " " + auteur + " " + type);
		},	
		creationMedia : function(titre, auteur, type){			
			console.log("Webservice creation du media" + titre + " " + auteur + " " + type);
		}	
	};
});