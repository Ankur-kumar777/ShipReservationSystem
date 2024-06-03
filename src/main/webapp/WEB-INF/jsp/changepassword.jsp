<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <!-- Font Awesome -->
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
<!-- MDB -->
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.3.0/mdb.min.js"
></script>
</head>
<body>
  <span class="h1 fw-bold mb-0">Ship Reservation System</span>
  <section class="vh-100" style="background-color: #9A616D;">
    <div class="container py-5 h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
          <div class="card" style="border-radius: 1rem;">
            <div class="row g-0">
              <div class="col-md-6 col-lg-5 d-none d-md-block">
                <img src="https://images.pexels.com/photos/1838680/pexels-photo-1838680.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
                  alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
              </div>
              <div class="col-md-6 col-lg-7 d-flex align-items-center">
                <div class="card-body p-4 p-lg-5 text-black">
                
                
                 <c:if test="${not empty change}">
                            <div id="myAlert" class="alert alert-danger alert-dismissible fade show" role="alert">

                               ${change}

                            </div>
                  </c:if>






                  <form action="/changepassword" method="post">
                   <div class="d-flex align-items-center mb-3 pb-1">
                      <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                      <span class="h1 fw-bold mb-0">SRS</span>
                    </div>
                     <div class="form-outline mb-4">
                      <input type="password" id="form2Example27"  minlength="5" class="form-control form-control-lg" name="password"/>
                      <label class="form-label" for="form2Example27">Enter your old Password</label>
                    </div>
                    <div class="form-outline mb-4">
                      <input type="password" id="form2Example27"  minlength="5" class="form-control form-control-lg" name="newpassword"/>
                      <label class="form-label" for="form2Example27">Enter your new Password</label>
                    </div>
                     <div class="form-outline mb-4">
                      <input type="password" id="form2Example27"  minlength="5" class="form-control form-control-lg" name="confirmpassword"/>
                      <label class="form-label" for="form2Example27">Confirm Password</label>
                    </div>
                    <button class="btn btn-dark btn-lg btn-block" type="submit">Change Password</button>
                  </form>
                  
                  
                  
                  
                  
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</body>
</html>