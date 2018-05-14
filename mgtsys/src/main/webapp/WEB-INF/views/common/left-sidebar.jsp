<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="left-sidebar">
    <!-- 用户信息 -->
    <div class="tpl-sidebar-user-panel">
        <div class="tpl-user-panel-slide-toggleable">
            <div class="tpl-user-panel-profile-picture">
                <img src="<%=request.getContextPath()%>/resources/img/user04.png" alt="">
            </div>
            <span class="user-panel-logged-in-text">
	      		<i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
				  <div ng-init="init()"><span>{{userName}} !!!</span></div>
 			</span>
            <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
        </div>
    </div>


    <!-- 菜单 -->
    <ul class="sidebar-nav">
        <li class="sidebar-nav-link" id="li-home">
            <a href="index.html" class="active">
                <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
            </a>
        </li>
        <li class="sidebar-nav-link">
            <a href="table-list-img.html">
                <i class="am-icon-table sidebar-nav-link-logo"></i> 商品列表
            </a>
        </li>
        <li class="sidebar-nav-link">
            <a href="table-list-shopcar.html">
                <i class="am-icon-calendar sidebar-nav-link-logo"></i> 购物车列表
            </a>
        </li>
        <li class="sidebar-nav-link">
            <a href="table-list-worker.html" id="li-employee">
                <i class="am-icon-wpforms sidebar-nav-link-logo"></i> 员工列表

            </a>
        </li>
        <li class="sidebar-nav-link">
            <a href="table-list.html">
                <i class="am-icon-bar-chart sidebar-nav-link-logo"></i> 会员列表

            </a>
        </li>

    </ul>
    
</div>
