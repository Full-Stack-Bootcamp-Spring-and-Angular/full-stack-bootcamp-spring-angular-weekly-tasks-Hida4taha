<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">

        <form:form action="processForm" modelAttribute="userData">
            <form:input type="text" placeholder="Enter Student Name" path="name">
 <form:input type="password" placeholder="Enter Student Name" path="password">
 <form:select path="country">
 <form:option value="Egypt" label="Egy"/>
  <form:option value="American" label="usk"/>
   <form:option value="syria" label="SYR"/>
    <form:option value="saudia" label="ksa"/>
        </form:select>

        </form:select>
        java<form:radiobutton path="programmingLanguage" value="java"/>
         c#<form:radiobutton path="programmingLanguage" value="c#"/>
          c++<form:radiobutton path="programmingLanguage" value="c++"/>
           python<form:radiobutton path="programmingLanguage" value="python"/>

        <input type="submit" class="btn btn-danger">
        </form:form>
    </body>
</html>

