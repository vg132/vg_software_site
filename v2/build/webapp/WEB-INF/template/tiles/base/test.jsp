<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<title><tiles:getAsString name="title"/></title>
	</head>
	<body>
		<tiles:getAsString name="body"/>
	</body>
</html>