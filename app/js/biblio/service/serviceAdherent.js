angular.module('biblio')
	.factory('serviceAdherent', function ($http) {
		var ulrGetAllAdherent = "http://192.168.10.41:8090/resource/adherent.recherche";
		
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
				var completeUrl = ulrGetAllAdherent + concatParams(params);
				return $http.get(completeUrl).then(function(response) {
					return response.data;
				});
			}
		};
	});
