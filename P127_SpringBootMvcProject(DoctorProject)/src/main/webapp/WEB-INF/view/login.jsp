<!DOCTYPE html>
<html lang="en">

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<link rel="stylesheet" href="main.css">


<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Covid Help Webservice</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Booking <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="s3">Book a Doctor</a></li>
						<li><a href="s4">Book a Bed</a></li>
						<li><a href="s5">Book a Ambulance</a></li>
					</ul></li>
				<li><a href="s6">Contact us</a></li>
				<li><a href="s7">Feedback</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Admin <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="s8">View a Doctor</a></li>
						<li><a href="s9">View a Bed</a></li>
						<li><a href="s10">View a Ambulance</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="s2"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li class="active"><a href="s1"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<h1>
		<center>
			<b>Login</b>
		</center>
	</h1>

	<form action="action_page.php" method="post">
		<div class="imgcontainer"></div>

		<div class="container">
			<label for="uname"><b>User Name</b></label> <input type="text"
				placeholder="Enter Username" name="uname" required><br>
			<br> <label for="psw"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="psw" required><br>
			<br>

			<button type="submit">Login</button>
			<br>
			<br> <label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>
	</form>

</body>

</html>