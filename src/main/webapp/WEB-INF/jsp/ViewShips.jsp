<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>


<html>


<head>


<meta charset="UTF-8">


<title>Ship Reservation System</title>


<link

href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"

rel="stylesheet" />

<!-- Google Fonts -->

<link

href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"

rel="stylesheet" />

<!-- MDB -->

<link

href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.3.0/mdb.min.css"

rel="stylesheet" />

<style>

.high {

float: none;

position: absolute;

transform: translate(-57%, -50%);

top: 50%;

left: 50%;

}

</style>


</head>


<body>

 

 

<nav

class="navbar navbar-expand-lg navbar-light bg-light sticky-top py-2">

<!-- Container wrapper -->

<div class="container">

<!-- Navbar brand -->

<a class="navbar-brand me-2"> <i

class="fa-solid fa-ship me-2 text-primary"></i>

<p class="fw-bold mb-0">Ship Reservation System</p>

</a>

<ul class="navbar-nav high">

<li class="nav-item"><a class="nav-link active"

aria-current="page" href="/welcome">Home</a></li>

<li class="nav-item"><a class="nav-link" href="/view-ship">Ships</a>

</li>

<li class="nav-item"><a class="nav-link" href="/add-ship">AddShip</a>

</li>

<li class="nav-item"><a class="nav-link" href="/passengers">Passengers</a>

</li>

<li class="nav-item"><a class="nav-link" href="/booking">Bookings</a>

</li>

</ul>

<!-- Collapsible wrapper -->

 

<a href="/home" class="btn btn-primary px-3 me-2"> LogOut </a>

<!-- Container wrapper -->

</div>

 

</nav>

<h1 class="text-center mt-5">View Ship</h1>

 

<table class="table container mt-4" align="center" border="2">


<thead class="thead-dark">


<tr>


<th scope="col">Ship Id</th>


<th scope="col">Route</th>

<th scope="col">Schedule</th>


<th scope="col">Ship Model</th>


<th scope="col">Reservation Capacity</th>


<th scope="col">Capacity</th>



<th scope="col">Rate per Km</th>

<th scope="col">Actions</th>


</tr>

</thead>


<tbody>

<tbody>


<c:forEach var="ship" items="${ships}">

 

<tr>


<td>${ship.shipId}</td>


<td>${ship.route.source}-${ship.route.destination}</td>

<td>${ship.schedule.journeyDate}-${ship.schedule.time}</td>


<td>${ship.shipModel}</td>


<td>${ship.reservationCapacity}</td>


<td>${ship.capacity}</td>


<td>${ship.perKmRate}</td>


<td><a href="/update-ship/${ship.shipId}"

class="btn btn-primary">Update</a> <a

href="/delete-ship/${ship.shipId}" class="btn btn-danger">Delete</a>

 

</td>


</tr>

 

</c:forEach>


</tbody>


</table>

 

</body>


</html>