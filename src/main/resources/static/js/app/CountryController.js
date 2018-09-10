'use strict'

var module = angular.module('app.controllers', []);
module.controller("CountryController", [ "$scope", "CountryService",
		function($scope, CountryService) {
	var that = this;
			// $scope.country = {
			// id : null,
			// name : null,
			// abrev : null
			// };
			//			
			// CountryService.getCountryById(1)
			// .then(function(value) {
			// console.log(value.data);
			// }, function(reason) {
			// console.log("error occured");
			// }, function(value) {
			// console.log("no callback");
			// });

			$scope.loadCountries =  CountryService.getAllCountries().then(function(value) {
					$scope.allCountries = value.data;
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			

			$scope.saveCountry = function() {
				console.log("entrou no save");
				console.log($scope.country);
				CountryService.saveCountry($scope.country).then(function() {
					that.loadCountries();
					$scope.country = {
						id : null,
						name : null,
						abrev : null
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);
