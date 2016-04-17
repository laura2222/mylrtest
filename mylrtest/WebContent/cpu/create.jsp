<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>new cpu</title>
</head>
<body>
	<form action="create.do">
		<input name="id" />
		<input name="cpuNameString" />
		<input name="coreSpeed" />
		<input name="multiplier" />
		<input name="busSpeed" />
		<input name="l1Cache" />
		<input name="l2Cache" />
		<input name="l3Cache" />
		<input name="instruction" />
		<input value="commit" type="submit"/>
	</form>

</body>
</html>