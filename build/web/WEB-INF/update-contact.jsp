
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:import url="header.html"/>
<div id="content">
    <h3>Update Contact</h3>
     <form  method="post"> 
       <input type="hidden" name="id" value="${contact.id}">
      <table>
        <tr>
          <td>First Name <td><input type="text" name="firstName" value="${contact.firstName}">
        </tr>
        <tr>
          <td>Last Name <td><input type="text" name="lastName" value="${contact.lastName}">
        </tr>
        <tr>
          <td>Phone</td><td><input type="text" name="phone" value="${contact.phone}"> 
        </tr>
        <tr>
          <td>Email</td><td><input type="text" name="email" value="${contact.email}"> 
        </tr>
        <tr>
          <td>Family</td><td><input type="checkbox" name="family" ${contact.family? "checked":""}> 
        </tr>
        <tr> <td><td>
            <input type="submit" name="update" value="Update" formaction="UpdateContactServlet">
            <input type="submit" name="cancel" value="Cancel" formaction="ContactServlet">
        </tr>
      </table>
    </form>   
</div>
<c:import url="footer.html"/> 
