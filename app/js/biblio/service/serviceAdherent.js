angular.module('biblio')
	.factory('serviceAdherent', function ($http) {
		var HOST = "http://192.168.10.41:8090/";
		var PATH_NAME_SEARCH = "resource/adherent.recherche/";
		var PATH_NAME_MODIFY = "resource/adherent.modification/";
		var METHOD_POST = "POST";

		var searchObjectInArray = function(data, id) {
			var res = null;
			angular.forEach(data, function(element) {
				if (element.id == id) {
					res = element;
				}
			});

			return res;
		};

		var concatParams = function(params) {
			var concatParams = "?";
			angular.forEach(params, function(value, key) {
				concatParams += key + "=" + value + "&"
			});
			return concatParams;
		};

		return {
			searchAdherent: function(params) {
				var completeUrl = HOST + PATH_NAME_SEARCH + concatParams(params);
				return $http.get(completeUrl).then(function(response) {
					return response.data;
				});
			},
			modifyAdherent: function(adherent) {				
				var req = {
					method: METHOD_POST,
					url: HOST + PATH_NAME_MODIFY,
					/*headers: {
					   'Content-Type': undefined
					},*/
					data: adherent 
				};
				
				return $http(req).then(function (response) {				 
					return response; 
			  	});
				
			}
		};
	});
