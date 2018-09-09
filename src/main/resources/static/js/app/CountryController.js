'use strict'

var module = angular.module('app.controllers', []);
module.controller("CountryController", [ "$scope", "CountryService",
		function($scope, CountryService) {
			$scope.country = {
				id : null,
				name : null,
				abrev : null
			};
			
			CountryService.getCountryById(1)
			.then(function(value) {
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			$scope.saveCountry = function() {
				CountryService.saveCountry($scope.country).then(function() {
					console.log("works");
					CountryService.getAllCountries().then(function(value) {
						$scope.allCountries = value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

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
