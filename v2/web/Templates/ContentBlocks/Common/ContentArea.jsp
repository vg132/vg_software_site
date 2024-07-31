<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<div class="story">
	<h3><tiles:getAsString name="title"/></h3>
	<p>
		<tiles:getAsString name="content"/>
	</p>
</div>