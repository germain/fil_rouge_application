angular.module('biblio').factory('serviceEmprunt', function ($http, $q, $filter) {
	return {		
			postEmprunt : function(id_adherent, id_media, depart){				
				var myDate = $filter('date')(depart, "yyyy-MM-dd");
				console.log("Webservice serviceEmprunt - " + id_adherent + " - "+ id_media + " - " + myDate + " - ");
				$http.post('http://192.168.10.41:8090/resource/emprunt.ajout', { 
				 	 id_adherent : id_adherent,
				 	 id_media : id_media,
				 	 depart : myDate
			 	   }).then(function (response) {				 
					  return response.data; 
					  //console.log(response);
				  });				
			}
	}
});
