<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>
	<jsp:include page="../common/heard.jsp"/>
</head>

<body data-type="widgets">
    <script src="<%=request.getContextPath()%>/resources/js/common/theme.js"></script>
    <div class="am-g tpl-g" ng-app="myApp" ng-controller="loginCtr" >
    	<!-- 头部 -->
        <jsp:include page="../common/topNav.jsp"/>
        <!-- 风格切换 -->
        <jsp:include page="../common/style.jsp"/>
        <!-- 侧边导航栏 -->
        <jsp:include page="../common/left-sidebar.jsp"/>
        <!-- 内容区域 -->
        <jsp:include page="../${url}"/>
    </div>

    <script src="<%=request.getContextPath()%>/resources/js/common/angular.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/common/app.js"></script>
    
 	<script>
		var app = angular.module('myApp', []);
		var employees = new Array();
		app.controller('loginCtr', function($scope, $http){
			$scope.init = function(){
				$http.get("<%=request.getContextPath()%>/employer/getEmployeeInfo")
			        .then(function(response){
						$scope.userName = response.data.employerId;
					});
	    	};
			$scope.getEmployeeInfoCtr = function(){
				$http.get("<%=request.getContextPath()%>/employee/getEmployeeInfo")
			        .then(function(response){
						$scope.employeeInfoList = response.data;
					});
			};
			
		});
	</script>
</body>
</html>