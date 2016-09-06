  angular.module('biblio').controller('ModalRechercheAdherentCtrl', function($scope , param){

  	console.log("dd", param.id);

        serviceAdherent.getAdherent(param.id).then(function(data){
               
                console.log(data);

                /*$scope.addAdherent {
                	id :data.id,
					nom :data.nom,
					prenom :data.prenom, 
					date_naissance:data.date_naissance,
					cotisation:data.cotisation.montant,
					nombre_media:data.nombre_media}*/

                }


      

   });