<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<ul>
  <li id="spittle_<c:out value="person.id"/>">
    <div class="spittleMessage">
      <c:out value="${person.usewrname}" />
    </div>
   
  </li>
</ul>
</body>
</html>