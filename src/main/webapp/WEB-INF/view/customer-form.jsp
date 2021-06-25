<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>


<form:form method="POST" 
          action="saveCustomer" modelAttribute="customer">
          <form:hidden path="id"/>
             <table>
                <tr>
                    <td><form:label path="firstName">first name:</form:label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                
                  <tr>
                    <td><form:label path="lastName">last name:</form:label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                
                  <tr>
                    <td><form:label path="email">email:</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
            
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                
                <div style=" clear; both"></div>
                
                <p>
                <a href="${pageContext.request.contextPath}/customer/list">Back to nature</a>
                </p>
            </table>
        </form:form>
</body>
</html>