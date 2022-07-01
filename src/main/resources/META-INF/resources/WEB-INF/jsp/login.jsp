<html>
	<head>
		<title>login</title>
		<style>
			.errorMessage {
				color: red;
				font-size: 1rem;
			}
		</style>
		<link
			href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
			rel="stylesheet"
		/>
	</head>
	<body>
		<div class="container">
			Welcome to the login page!
			<pre>${errorMessage}</pre>
			<form method="post">
				Name: <input type="text" name="name" /> Password:
				<input type="password" name="password" />
				<input type="submit" />
			</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>
