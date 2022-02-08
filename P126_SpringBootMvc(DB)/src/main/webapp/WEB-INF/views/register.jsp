<!DOCTYPE html>
<html>
<title>Employee Registration Page</title>
<body>
	<h1>
		<center>Employee Registration Page</center>
	</h1>
	<hr>
	<form action="save">
		<table>
			<tr>
				<td>Enter your name
				<td><input type=text name=t1 size=20></td>
			</tr>
			<tr>
				<td>Enter your address
				<td><input type=address name=t2 size=20></td>
			</tr>
			<tr>
				<td>Enter your phoneno
				<td><input type=text name=t3 size=20></td>
			</tr>
			<tr>
				<td>Enter your email
				<td><input type=address name=t4 size=20></td>
			</tr>
			<tr>
				<td>Enter your salary
				<td><input type=text name=t5 size=20></td>
			</tr>
			<tr>
				<td>Enter your designation
				<td><input type=address name=t6 size=20></td>
			</tr>
			<tr>
				<td>Enter your Gender
				<td><input type=radio name=t7 value=male>Male <input
					type=radio name=t7 value=female>Female</td>
			</tr>
			<tr>
				<td>Enter your nationality
				<td><select name=t8>
						<option value=India>India</option>
						<option value=China>China</option>
						<option value=Japan>Japan</option>
				</select>
			<tr>
				<td>Enter your Hobby
				<td><input type=checkbox name=t9 value=cricket>Cricket
					<input type=checkbox name=t9 value=football>FootBall</td>
			</tr>

			<tr>
				<td>
				<td><input type=submit value=Insert name=t10> <input
					type=submit value=Update name=t10> <input type=submit
					value=Delete name=t10></td>
			</tr>
		</table>
	</form>
</body>
</html>