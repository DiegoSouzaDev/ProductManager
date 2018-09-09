'use strict'

angular.module('app.services', []).factory('CountryService',
		[ "$http", function($http) {
			var service = {};
			service.getCountryById = function(countryId) {
				return $http.get(/country/ + countryId);
			}
			service.getAllCountries = function() {
				return $http.get(/country/);
			}
			service.saveCountry = function(country) {
				return $http.post(/country/, country);
			}
			return service;
		} ]);