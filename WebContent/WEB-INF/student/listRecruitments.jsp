<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0"
	   class="list_table">
	<tr>
		<th width="10">标题</th>
		<th width="15">城市</th>
		<th width="15">市区</th>
		<th width="40">地址</th>
		<th width="20">工资</th>
		<th width="30">联系电话</th>
		<th width="30">开始日期</th>
		<th width="30">结束日期</th>
		<th width="30">工作性质</th>
		<th width="30">工作类别</th>
		<th width="30">发布日期</th>
		<th width="30">发布人</th>
		<th width="30">备注</th>
	</tr>
	<s:iterator var="recruitment" value="#request.list">
		<tr class="tr">
			<td><s:property value="#recruitment.title" /></td>
			<td><s:property value="#recruitment.city.cityName" /></td>
			<td><s:property value="#recruitment.district" /></td>
			<td><s:property value="#recruitment.address" /></td>
			<td><s:property value="#recruitment.salary" /></td>
			<td><s:property value="#recruitment.phone" /></td>
			<td><s:property value="#recruitment.beginYear" />. <s:property
					value="#recruitment.beginMonth" />. <s:property
					value="#recruitment.beginDay" /></td>
			<td><s:property value="#recruitment.endYear" />. <s:property
					value="#recruitment.endMonth" />. <s:property
					value="#recruitment.endDay" /></td>
			<td><s:property
					value="#recruitment.correspond.correspondName" /></td>
			<td><s:property value="#recruitment.workKind.workKindName" /></td>
			<td><s:property value="#recruitment.date" /></td>
			<td><s:property value="#recruitment.recruiter.username" /></td>
			<td><s:property value="#recruitment.context" /></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>