angular.module('biblio').factory('serviceEmprunt', function ($http, $q, $filter) {
	var serveur = 'localhost';
	var port = '8080';
	var application = 'bib/rest';
	return {		
			postEmprunt : function(id_adherent, id_media, depart){
				var myDate = new Date(depart);
				myDate = $filter('date')(depart, "yyyy-MM-dd");
				$http.post('http://'+serveur+':'+port+'/'+application+'/emprunt', { 
				 	 id_adherent : id_adherent,
				 	 id_media : id_media,
				 	 depart : myDate
			 	   }).then(function (response) {				 
					  return response.data; 
				  });				
			}
	}
});
