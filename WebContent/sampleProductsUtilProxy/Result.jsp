<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleProductsUtilProxyid" scope="session" class="util.ProductsUtilProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleProductsUtilProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleProductsUtilProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleProductsUtilProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        util.ProductsUtil getProductsUtil10mtemp = sampleProductsUtilProxyid.getProductsUtil();
if(getProductsUtil10mtemp == null){
%>
<%=getProductsUtil10mtemp %>
<%
}else{
        if(getProductsUtil10mtemp!= null){
        String tempreturnp11 = getProductsUtil10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] categories13mtemp = sampleProductsUtilProxyid.categories();
if(categories13mtemp == null){
%>
<%=categories13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(categories13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(categories13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        String name_1id=  request.getParameter("name19");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        String description_2id=  request.getParameter("description21");
            java.lang.String description_2idTemp = null;
        if(!description_2id.equals("")){
         description_2idTemp  = description_2id;
        }
        String categories_3id=  request.getParameter("categories23");
            java.lang.String categories_3idTemp = null;
        if(!categories_3id.equals("")){
         categories_3idTemp  = categories_3id;
        }
        boolean insertBoard16mtemp = sampleProductsUtilProxyid.insertBoard(name_1idTemp,description_2idTemp,categories_3idTemp);
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertBoard16mtemp));
        %>
        <%= tempResultreturnp17 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>