angular.module('biblio')
	.factory('serviceAdherent', function ($http, $q) {
		var HOST = "http://192.168.10.41:8090/";
		var PATH_NAME_ACCESSION = "resource/adherent.accession";
		var PATH_NAME_MODIFY = "resource/adherent.modification";
		var METHOD_POST = "POST";

		return {
			getAdherent: function(id) {
				var completeUrl = HOST + PATH_NAME_ACCESSION;
				return $http.get(completeUrl, {params : {"id":id}}).then(function(response) {
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
				
			}
		};
	});
