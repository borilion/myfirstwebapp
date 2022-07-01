<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Todo list</title>
		<link
			href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
			rel="stylesheet"
		/>
	</head>
	<body>
		<div class="container">
			<h1>Enter Todo Details</h1>
			<form method="post">
				<div class="form-group">
					Description: <input type="text" name="description" />
				</div>
				<div class="form-group">
					Target Date: <input type="date" name="targetDate" />
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Add" />
				</div>
			</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>
