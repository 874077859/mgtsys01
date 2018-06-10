<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>vip home system</title>
<meta name="description" content="欢迎使用vip之家系统">
<meta name="keywords" content="vip">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="<%=request.getContextPath()%>/resources/img/favicon.png">
<link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/resources/img/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="vip home system" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/amazeui.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/app.css">
<script src="<%=request.getContextPath()%>/resources/js/common/echarts.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/common/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/common/angular.min.js"></script>
</head>

<body data-type="addEmployee" class="theme-black" ng-app="myApp" ng-controller="addEmployeeCtr">
  <div ng-init="init()"></div>
  <div class="am-g tpl-g">
    <div class="tpl-login">
      <div class="tpl-login-content">
        <div class="tpl-login-title">添加员工</div>
        <span class="tpl-login-content-info">添加一个新员工</span>

        <form class="am-form tpl-form-line-form" name="addEmployeeForm">
          <div class="am-form-group">
            <input type="text" name="employeeID" placeholder="请输入员工ID" ng-model="employeeID" required>
          </div>
          
          <div class="am-form-group">
            <input type="text" name="employeeName" placeholder="请输入员工姓名" ng-model="employeeName" required>
          </div>

          <div class="am-form-group">
            <input type="text" name="employeeTel" placeholder="请输入员工电话" ng-model="employeeTel" required>
          </div>

          <div class="am-form-group">
            <label class="for-label-one">请选择员工类别</label>
            <div>
              <select ng-model="employeeType" ng-options="t.value for t in types"></select>
            </div>
          </div>
          
          <div class="am-form-group">
            <label class="for-label-one">请选择员工状态</label>
            <div>
              <select ng-model="employeeStatus" ng-options="s.value for s in status"></select>
            </div>
          </div>
          
          <div class="am-form-group">
            <input type="password" name="employeePwd" placeholder="请输入员工密码" ng-model="employeePwd" required>
          </div>
          
          <div class="am-form-group">
            <input type="password" name="employeePwdConfirm" placeholder="请再次输入员工密码" ng-model="employeePwdConfirm" required>
          </div>

          <div class="am-form-group">
            <button type="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn am-btn-block"
            ng-click="doCommit()">提交</button>
            <button type="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn am-btn-block"
            ng-click="doBack()">返回</button>
          </div>
        </form>
      </div>
    </div>
  </div>

<script>
var app = angular.module('myApp', []);
app.controller('addEmployeeCtr', function($scope, $http){
	$scope.init = function() {
		$http.post("<%=request.getContextPath()%>/employeeStatus/getEmployeeStatus")
	        .then(function(response){
	    	    $scope.status = response.data;
	    	    $scope.employeeStatus = response.data[0];
	        });
		$http.post("<%=request.getContextPath()%>/employeeType/getEmployeeTypes")
		    .then(function(response){
		    	$scope.types = response.data;
		    	$scope.employeeType = response.data[0];
		    });
	}
	$scope.doBack = function() {
		window.location = "<%=request.getContextPath()%>";
    };
    $scope.doCommit = function() {
    	var data = {employeeId:$scope.employeeID,
                    employeeName:$scope.employeeName,
                    employeeTel:$scope.employeeTel,
                    employeeType:$scope.employeeType.key,
                    employeeStatus:$scope.employeeStatus.key,
                    employeePwd:$scope.employeePwd};
    	$http.post("<%=request.getContextPath()%>/employee/doAdd", data)
    	    .then(function(response){
    	        window.location = "<%=request.getContextPath()%>/employee/index";
    	    });
    };
});
</script>

</body>
</html>