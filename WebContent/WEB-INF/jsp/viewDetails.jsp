<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Details</title>
</head>
<body ng-app="myApp">
	<div ng-controller="ctrl">
		Date <input type="text" ng-model="date" name="date"></input>
		<button type="submit" ng-click="functionShow(date)">Submit</button>
	
	<input type="text" ng-model="search.$"
			placeholder="Search By All" />
		<hr />

		<table>
			<tr>
				<th>Trainer ID</th>
				<th>Trainer Name</th>
				<th>College Name</th>
				<th>Domain</th>
				<th>Start Date</th>
				<th>Duration</th>
				<th>Schedule Id</th>
			</tr>
			<tr ng-repeat="e in list | filter: search">
				<td>{{e.trainer.trainerId}}</td>
				<td>{{e.trainer.trainerName}}</td>
				<td>{{e.trainer.collegeName}}</td>
				<td>{{e.trainer.domain}}</td>
				<td>{{e.startDate}}</td>
				<td>{{e.duration}}</td>
				<td>{{e.scheduleId}}</td>
			</tr>
		</table>
</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script>
var app = angular.module('myApp', []);
app.controller('ctrl', function($scope, $http){
	$scope.functionShow=function(date){
		console.log("calling fn")
$http({
method: 'GET',
url: 'viewDetails1',
			params:{"date":date}		
            }).then(res=>res.data)
            .then(data => {
            	console.log(data);
            	$scope.list = data;
            })
        
	}})
    </script>
</body>
</html>