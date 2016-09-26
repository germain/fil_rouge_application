angular.module('biblio')
	.factory('serviceAdherent', function ($http, $q) {
		var HOST = "http://localhost:8090/";
		var PATH_NAME_ACCESSION = "resource/adherent.accession";
		var PATH_NAME_MODIFY = "resource/adherent.modification";
		var PATH_NAME_SEARCH_NAME = "resource/adherent.recherche";
		var METHOD_POST = "POST";

		var serveur = 'localhost';
		var port = '8080';
		var application = 'bib/rest';
		
		return {

			searchAdherent : function(val){	
				var searchUrlNom=	'http://localhost:8080/bib/rest/adherent'; 	  
			  	return $http.get(searchUrlNom).then(function (response) {
//				var searchUrlNom=	HOST + PATH_NAME_SEARCH_NAME; 	  
//			  	return $http.get(searchUrlNom, {params : val}).then(function (response) {
				  return response.data;
			  	});		 
			},

			getAdherent: function(id) {
				var searchUrlNom=	'http://localhost:8080/bib/rest/adherent/'+id; 	  
			  	return $http.get(searchUrlNom).then(function (response) {
//				var completeUrl = HOST + PATH_NAME_ACCESSION;
//				return $http.get(completeUrl, {params : {"id":id}}).then(function(response) {
					console.log(response);
					return response.data;
				}, function(error) {
					return $q.reject(error);
				});
			},
			modifyAdherent: function(adherent) {				
				var req = {
					method: METHOD_POST,
					url: HOST + PATH_NAME_MODIFY,
					data: adherent 
				};
				
				return $http(req).then(function (response) {				 
					return response; 
			  	}, function(error) {
					return $q.reject(error);
				});
			},
			createAdherent : function(nom,prenom,dateN,email,adresse,codeP,ville,dateP,montant) {
				console.log(nom,prenom,dateN,email,adresse,codeP,ville,dateP,montant);
				var req = {
					method : 'POST',
					url : 'http://localhost:8090/resource/adherent.creation',
					data : {
						nom : nom,
						prenom : prenom,
						date_naissance : dateN,
						email : email,
						adresse : {
							ligne1 : adresse,
							ligne2 : '',
							codepostal : codeP,
							ville : ville
						},
						cotisation : {
							debut : dateP,
							montant : montant
						}
					}
				}
				$http(req).then(function (response) {				 
					  //return response.data; 
					  console.log(response);
				});
			}
		};
	});
