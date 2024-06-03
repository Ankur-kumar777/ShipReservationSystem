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

 

<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top py-2">
    <div class="container">

      <a class="navbar-brand me-2">
       <i class="fa-solid fa-ship me-2 text-primary"></i>
        <p class="fw-bold mb-0">Ship Reservation System</p>
        </a>

        <ul class="navbar-nav high">
        
        <li class="nav-item" >
         <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="view-ship">Ships</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="add-ship">AddShip</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="/passengers">Passengers</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="/changepassword">Change password</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="/booking">Bookings</a>
        </li>
         </ul>
      <a href="/home" class="btn btn-primary px-3 me-2">
        LogOut
      </a>
     </div>
  </nav>

 <h1 class="text-center">Welcome to Ship Reservation System</h1>

<img src="https://wallpaperaccess.com/full/842293.jpg"
height="650px" width="1320vh" class="d-block w-100" alt="...">

</body>
</html>