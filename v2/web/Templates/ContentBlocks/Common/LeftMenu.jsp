<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!-- start left menu -->
<div class="relatedLinks">
	<c:forEach var="section" items="${menuItems}" varStatus="status">
		<h3><c:out value="${section.name}"/></h3>
		<c:forEach var="item" items="${section.subMenuItems}" varStatus="status">
			&nbsp;&nbsp;<a href="<c:out value="${item.url}"/>"><c:out value="${item.name}"/></a><br/>
		</c:forEach>
	</c:forEach>
</div>
<!-- end left menu -->