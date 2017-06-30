<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="myApp">
	<form:form method="POST"
		action="/BaseCodeSlice_BankManagementSystem/mvc/applySchedule1"
		modelAttribute="trainerSchedule" name="userForm">
		<table>
		<tr>
				<td>Trainer Id :</td>
				<td><form:input path="trainer.trainerId" ng-model="trainer.trainerId"
						required="true" /></td>
			</tr>
		<tr>
				<td>Trainer Name :</td>
				<td><form:input path="trainer.trainerName" ng-model="trainer.trainerName"
						required="true" /></td>
			</tr>
		<tr>
				<td>Domain :</td>
				<td><form:input path="trainer.domain" ng-model="trainer.domain"
						required="true" /></td>
			</tr>
		<tr>
				<td>College Name :</td>
				<td><form:input path="trainer.collegeName" ng-model="trainer.collegeName"
						required="true" /></td>
			</tr>
		

			<tr>
				<td>Start Date :</td>
				<td><form:input path="startDate" ng-model="startDate"
						required="true" /></td>

			</tr>

			<tr>
				<td>Duration :</td>
				<td><form:input path="duration" ng-model="duration"
						required="true" /></td>

			</tr>


		</table>
		<button type="submit" ng-disabled="userForm.$invalid">Submit</button>
	</form:form>

	<script src="../libs/angular.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script>
		var app = angular.module('myApp', []);

		app.controller('AppCtrl', function($scope) {
			//$scope.transactionAmount = "";
			// $scope.transactionType = "";
			//$scope.transactionDescription = "";
		})
	</script>
</body>
</html>