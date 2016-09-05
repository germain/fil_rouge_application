	var searchObjectInArray = function(data, id) {
		var res = null;
		angular.forEach(data, function(element) {
			if (element.id == id) {
				res = element;
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
		searchAdherent : function(params) {
			var completeUrl = ulrGetAllAdherent
					+ concatParams(params);
			return $http.get(completeUrl).then(
					function(response) {
						return response.data;
					});
		},

		createAdherent : function(nom,prenom,dateN,email,adresse,codeP,ville,dateP,montant) {
			console.log(nom,prenom,dateN,email,adresse,codeP,ville,dateP,montant);
			var req = {
				method : 'POST',
				url : 'http://192.168.10.41:8090/resource/adherent.creation',
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
