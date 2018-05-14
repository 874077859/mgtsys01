<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
        <div class="tpl-content-wrapper">
            <div class="row-content am-cf">
                <div class="row">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                                <div class="widget-title  am-cf">员工列表</div>
                            </div>
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
											    <a href="form.html" class="am-btn am-btn-default am-btn-success am-btn-danger" target="_blank"><span class="am-icon-plus"> 新增</span></a>
                                                <!-- <button type="button" class="am-btn am-btn-default am-btn-success"><span class="am-icon-plus"> 新增</span></button> -->
                                                <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 添加到购物车</button>
                                                <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除</button>
                                          </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                    <div class="am-form-group tpl-table-list-select">
                                        <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">所有类别</option>
              <option value="option2">IT业界</option>
              <option value="option3">数码产品</option>
              <option value="option3">笔记本电脑</option>
              <option value="option3">平板电脑</option>
              <option value="option3">只能手机</option>
              <option value="option3">超极本</option>
            </select>
                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                        <input type="text" class="am-form-field ">
                                        <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" type="button"></button>
          </span>
                                    </div>
                                </div>

                                <div class="am-u-sm-12">
                                
                                    <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black ">
                                        <thead>
                                            <tr>
                                                <th>选择</th>
                                                <th>员工照片</th>
                                                <th>员工ID</th>
                                                <th>员工名</th>
                                                <th>价格</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody ng-init="getEmployeeInfoCtr()" >

<% for (int i=0;i< 5 ;i++) {%>
   
<%-- <c:forEach items="{{employeeInfoList}}" var="list">
          3${list}3   --%>                            		
	                                            <tr class="gradeX">
	                                                <td class="am-text-middle"><input type="checkbox"></td>
	                                                <td>
	                                                    <img src="<%=request.getContextPath()%>/resources/img/k.jpg" class="tpl-table-line-img" alt="">
	                                                </td>
	                                                <td class="am-text-middle">{{employeeInfoList[<%=i %>].employeeId}}</td>
	                                                <td class="am-text-middle">{{employeeInfoList[<%=i %>].employeeName}}</td>
	                                                <td class="am-text-middle">123元/个</td>
	                                                <td class="am-text-middle">
	                                                    <div class="tpl-table-black-operation">
	                                                        <a href="javascript:;">
	                                                            <i class="am-icon-pencil"></i> 编辑
	                                                        </a>
	                                                        <a href="javascript:;" class="tpl-table-black-operation-del">
	                                                            <i class="am-icon-trash"></i> 删除
	                                                        </a>
	                                                    </div>
	                                                </td>
	                                            </tr>
	 <%} %>                                         
	 
<%-- </c:forEach> --%>

                                            <!-- more data -->
                                        </tbody>
                                    </table>
                                </div>
                                <div class="am-u-lg-12 am-cf">

                                    <div class="am-fr">
                                        <ul class="am-pagination tpl-pagination">
                                            <li class="am-disabled"><a href="#">«</a></li>
                                            <li class="am-active"><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li><a href="#">»</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

