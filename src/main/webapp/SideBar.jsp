<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap Css -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<!-- Boxicons -->
	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
	<!-- My CSS -->
<link rel="stylesheet" href="css/sidebar.css">
	<title></title>
</head>
<body>


	<!-- SIDEBAR -->
	<section id="sidebar" class="sidebar">
		<a href="Controller?actions=home" class="brand">
			<i class='bx bxs-wallet-alt'></i>
			<span class="text">Expense Tracker</span>
		</a>
		<ul class="side-menu top">
			<li class="dashboard" id="dashboard">
				<a href="Controllers?actions=dashboard">
					<i class='bx bxs-dashboard' ></i>
					<span class="text">Dashboard</span>
				</a>
			</li>
			<li id="regstudents">
				<a href="Controllers?actions=">
					<i class='bx bx-history' ></i>
					<span class="text" >History</span>
				</a>
			</li>
			<li id="studentdetails">
				<a href="Controllers?actions=">
					<i class='bx bxs-group'></i>
					<span class="text">Set Budget</span>
				</a>
			</li>

			<li id="profile" >
				<a href="#">
					<i class='bx bxs-wallet'></i>
					<span class="text">Accounts</span>
				</a>
			</li>
			<li id="profile" >
				<a href="Controllers?actions=add_category">
					<i class='bx bxs-category'></i>
					<span class="text">Add Category</span>
				</a>
			</li>
			<li id="profile" >
				<a href="Controllers?actions=add_new">
					<i class='bx bxs-plus-circle'></i>
					<span class="text">Add Expense</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="Controller?actions=log_out" class="logout"  onclick="confirmLogout()">
					<i class='bx bx-log-out' ></i>
					<span class="text">Logout</span>
					
				</a>
			</li>
		</ul>
	</section>
	<script src="js/sidebar.js"></script>
</body>
</html>	