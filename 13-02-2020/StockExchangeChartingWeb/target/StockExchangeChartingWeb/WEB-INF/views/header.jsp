<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<h2>Hello World!</h2>
	<a href="user-home">User</a>
	<a href="company-home">Company</a>
	<a href="stockexchange-home">StockExchange</a>

	<hr>
	<header>
		<h2 class="text-center">Stock Exchange Market</h2>
	</header>
	<nav class="navbar navbar-expand-lg  bg-dark">
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item "><a href="home" class="nav-link text-white" >Home</a></li>
				<li class="nav-item "><a href="#" class="nav-link text-white">About</a></li>
				<li class="nav-item dropdown"><a
					class="btn text-white nav-link dropdown-toggle" data-toggle="dropdown">
						Services </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="">Compare Charts</a> <a
							class="dropdown-item" href="">Update IPO</a> <a
							class="dropdown-item" href="">Daily Reports </a> <a
							class="dropdown-item" href="">Monthly Reports</a> <a
							class="dropdown-item" href="">Yearly Reports</a>
					</div></li>
				<li class="nav-item"><a href="" class="nav-link text-white">Contact</a></li>

			</ul>
			<div>
				<ul class="navbar-nav float-right">

					<li><a href="u-home" class=" btn btn-success">viewusers</a>
					</li>
				</ul>
				</div>
				<ul class="navbar-nav" style="margin-left: 450px; padding-top: 5px;">
					<li><a href="createaccount" class=" btn btn-success">createaccount
					</a></li>

					<li class="nav-item mx-2"><a routerLink="login"
						routerLinkActive="active" class="btn btn-success"> Login</a>
				</ul>
			</div>
		</div>
	</nav>
	<br>
	<div style="min-height: 75vh;">
		<router-outlet></router-outlet>
	</div>



	<footer class="page-footer">
		<div class="footer-copyright text-center py-3 bg-dark text-white mb-3">
			© 2020 Copyright: <a href="www.javatpoint.com"> javatpoint</a>
		</div>
	</footer>

