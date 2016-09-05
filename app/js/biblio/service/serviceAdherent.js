angular.module('biblio')
	.factory('serviceAdherent', function ($http) {
		var ulrGetAllAdherent = "http://192.168.10.41:8090/resource/adherent.recherche";
		var promiseAllAdherent = $http.get(ulrGetAllAdherent).then(function(response) {
			return response.data;
		});
		var searchObjectInArray = function(data, id) {
			var res = null;
			angular.forEach(data, function(element) {
				if (element.id == id) {
					res = element;
				}
			});

			return res;
		};
		return {
			getById: function (id) {
				return promiseAllAdherent.then(function(data) {
					return searchObjectInArray(data, id);
				});
		}
	};
});
