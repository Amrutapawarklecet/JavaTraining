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
						<li class="active"><a href="s3">Book a Doctor</a></li>
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
				<li><a href="s1"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>

	<h1>
		<center>
			<b> List of Doctors</b>
		</center>
	</h1>
	<div class="container">
		<form action="bk">
			<table border=3>
				<tr>
					<th>Doctor Name</th>
					<th>Email</th>
					<th>Contact Number</th>
					<th>Hospital Address</th>
				</tr>
				<tr>
					<td>Dr. Soni</td>
					<td>soni111@gmail.com</td>
					<td>7845879584</td>
					<td>PBM Hospital</td>
				</tr>
				<tr>
					<td>Dr. Bhattar</td>
					<td>mgb@gmail.com</td>
					<td>9874561258</td>
					<td>PBM Hospital</td>
				</tr>
				<tr>
					<td>Dr. Chhajer</td>
					<td>chhajer45@gmail.com</td>
					<td>9875698231</td>
					<td>Statelite Hospital Gangashahar</td>
				</tr>
				<tr>
					<td>Dr. Aggrwal</td>
					<td>dr.aggrwal@gmail.com</td>
					<td>6587435871</td>
					<td>Kothari Hospital</td>
				</tr>
			</table>
			<br>



			<tr>
				<td>Available Doctors
				<td><select name=t10>
						<option>select...</option>
						<option value="Dr. Soni">Dr. Soni</option>
						<option value="Dr. Aggrwal">Dr. Aggrwal</option>
				</select>
			</tr>
			<br>
			<br>


			<tr>
				<button type="submit" class="signupbtn">Submit</button>
			</tr>
			</td>
			<br>
		</form>
	</div>
</body>

</html>