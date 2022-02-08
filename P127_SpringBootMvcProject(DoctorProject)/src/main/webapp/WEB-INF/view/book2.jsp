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
						<li class="active"><a href="s5">Book a Ambulance</a></li>
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
				<li><a href="s1"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>

	<h1>
		<b>Book a Ambulance</b>
	</h1>
	<div class="container">
		<form action="bk2">

			<label for="user">Name:</label> <input type="text"
				class="form-control" id="user" name="t19"><br>
			<br> <label for="date">DOB:</label> <input type="text"
				class="form-control" id="date" name="t20"><br>
			<br> <label for="email">Email ID:</label> <input type="email"
				class="form-control" id="email" name="t21"><br>
			<br> <label for="number">Contact Number:</label> <input
				type="number" class="form-control" id="number" name="t22"><br>
			<br> <label>Enter your Gender:</label> <label><input
				type="radio" value="male" name="t23">Male</label> <label><input
				type="radio" value="female" name="t23">Female</label> <label><input
				type="radio" value="others" name="t23" disabled>Others </label><br>
			<br> <label for="from">City</label> <select name="t24">
				<option value="select">select..</option>
				<option value="Goa">Goa</option>
				<option value="Mumbai">Mumbai</option>
				<option value="New Delhi">New Delhi</option>
				<option value="Bengluru">Bengluru</option>
				<option value="Jaipur">Jaipur</option>
				<option value="Gohati">Gohati</option>
				<option value="Kolkata">Kolkata</option>
				<option value="Srinagar">Srinagar</option>
				<option value="Lucknow">Lucknow</option>
				<option value="Chennai">Chennai</option>
			</select><br>
			<br> <label for="from">Ambulance</label> <select name="t25">
				<option>select..</option>
				<option value="Individual Ambulance">Individual Ambulance</option>
				<option value="Mobile ICU Ambulance">Mobile ICU Ambilance</option>
				<option value="Basic Ambulance">Baic Ambulance</option>
				<option value="Helicopeter Ambulance">Helicopeter Ambulance</option>
			</select><br>
			<br>

			<button type="submit" class="signupbtn">Submit</button>
		</form>
	</div>

</body>


</html>