

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:import url="header.html"/>
<div id="content">
    <h3>View Contacts</h3>

    <form action="AddContactServlet" method="post"> 
      <table><tr>
          <td>First Name <td><input type="text" name="firstName">
        </tr><tr>
          <td>Last Name <td><input type="text" name="lastName"></tr>
        <tr> <td><td><input type="submit" name="Add" value="Add">
        </tr>
      </table>
    </form>

    <form method="post">
    <table class="table table-hover"> 
      <tr><th>Select</th><th>ID</th><th>First Name</th><th>Last Name</th><th>Action</th></tr>
      <c:forEach var="contact" items="${contacts}">
        <tr>
          <td><input type="checkbox" name="selected" value="${contact.id}"></td>
          <td>${contact.id}</td>
          <td>${contact.firstName}</td> 
          <td>${contact.lastName}</td>
          <td>
          <a href="/week5/UpdateContactServlet?id=${contact.id}">u</a> 
          <a href="/week5/DeleteContactServlet?id=${contact.id}">x</a></td>
        </tr>
        
      </c:forEach>
        <tr>
          <td colspan="5">
            <input type="submit" name="delete" value="delete" 
                   formaction="DeleteContactServlet"
                   formmethod="post"
                   >
          </td>
    </table>
      
    </form>
</div>

<c:import url="footer.html"/> 