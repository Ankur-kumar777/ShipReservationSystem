<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>


<!DOCTYPE html>


<html>


<head>

<meta charset="UTF-8">

<title>Ship Reservation System</title>

<link

href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
rel="stylesheet"
/>
<!-- Google Fonts -->
<link
 href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
 rel="stylesheet"
/>
<!-- MDB -->

<link
 href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.3.0/mdb.min.css"
 rel="stylesheet"
/>
<style>

  .high{

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

<div class="container">

<div class="row">

<div

class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">

<h1 class="text-center">Update Ship</h1>

<div class="card-body">

<form method="POST" action="/update-ship/">

<div class="form-group">

<label>Ship Id</label> <input type="text" name="shipId"

class="form-control" value=${ship.shipId} readonly>

</div>

<div class="form-group">

<label>Ship Model</label> <input type="text" name="shipModel"

class="form-control" value=${ship.shipModel} required >

</div>

<div class="form-group">

<label>Ship Reservation Capacity</label> <input type=number min=1

name="reservationCapacity" class="form-control" value=${ship.reservationCapacity} required>

</div>

<div class="form-group">

<label>Ship Capacity</label> <input type=number min=1 name="capacity"

class="form-control" value=${ship.capacity} required>

</div>

<div class="form-group">

<label>Ship per Km Rate</label> <input type=number min=1 name="perKmRate"

class="form-control" value=${ship.perKmRate} required>

</div>

<div class="footer-body">

<button type="submit" class="btn btn-primary">Submit</button>

</div>

</form>

</div>

</div>

</div>

</div>
</body>

</html>