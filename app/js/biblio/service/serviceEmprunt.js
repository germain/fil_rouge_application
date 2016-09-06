angular.module('biblio').factory('serviceEmprunt', function ($http, $q) {
	return {		
			postEmprunt : function(id_adh, date_retour, date_emprunt){				
			//console.log("Webservice modification du media - " + id + " - "+ titre + " - " + auteur + " - " + type);
			$http.post('http://192.168.10.41:8090/resource/emprunt.ajout', { id: id, 
			 	 id_adherent : id_adh,
			 	 id_media : auteur,
			 	 depart : type
		 	   }).then(function (response) {				 
				  //return response.data; 
				  console.log(response);
			  });
			
		}
	}
});
