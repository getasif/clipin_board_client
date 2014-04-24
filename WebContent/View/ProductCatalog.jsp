<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="<%=getServletContext().getContextPath()%>/View/Categories">
<p>Name of the Board<p><input type="text" name="bname" id="bname"></input>
<p>Description</p><input type="text" name="bdescription" id="bdescription"></input>
<p>Categories</p><select id="bcategories" name="bcategories">
<% String[] Categories = (String[])request.getAttribute("products"); %>
<% if (Categories!=null && Categories.length>0){ %>
<% for (String categories : Categories) { %>
	<Option value="<%= categories%>"><%= categories%></Option>
<% };
}
%>
</select>
<input type="submit" Value="Create Board"></input>
</form>
</body>
</html>