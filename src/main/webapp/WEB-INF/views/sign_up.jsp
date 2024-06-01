<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Advisor </title>

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

    <!-- custom css file link  -->
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- ADD a Fav Icon  -->
    <link rel="icon" type="image/x-icon" href="images/favicon.png">
</head>
<body>
    <!-- header section starts  -->

<header>

    <a href="<c:url value="/sign_in.do"/>" class="logo"><i class="fas fa-utensils"></i>food advisor</a>

    <div id="menu-bar" class="fas fa-bars"></div>

    <nav class="navbar">
        <a href="<c:url value="/sign_in.do"/>">Sign in</a>
        <a href="<c:url value="/sign_up.do"/>">Sign up</a>

    </nav>

</header>

<!-- header section ends -->

<section class="home" id="home">

    

    <div class="content">
        <h3>Registration</h3>
        <form action="" method="post">
            <div class="user-details">
              <div class="input-box">
                <span class="details">First Name</span>
                <input type="text" name="first_name" placeholder="Enter your name" required>
              </div>
              <div class="input-box">
                <span class="details">Last Name</span>
                <input type="text" name="last_name" placeholder="Enter your name" required>
              </div>
              <div class="input-box">
                <span class="details">Email</span>
                <input type="text" name="email" placeholder="Enter your email" required>
              </div>
              <div class="input-box">
                
              </div>
              <div class="input-box">
                <span class="details">Password</span>
                <input type="text" name="password" placeholder="Enter your password" required>
              </div>
              <div class="input-box">
                <span class="details">Confirm Password</span>
                <input type="text" placeholder="Confirm your password" required>
              </div>
            </div>
            <div class="gender-details">
              <input type="radio" name="gender" id="dot-1" value="user">
              <input type="radio" name="gender" id="dot-2" value="owner">
              <span class="gender-title">You are ?</span>
              <div class="category">
                <label for="dot-1">
                <span class="dot one"></span>
                <span class="gender">User</span>
              </label>
              <label for="dot-2">
                <span class="dot two"></span>
                <span class="gender">Owner</span>
              </label>
    
            </div>
            <div class="">
              <button type="submit" class="btn mt-4">Registration</button>
            </div>
          </form>
    </div>

</section>


<!-- footer section  -->

<section class="footer">

    <h1 class="credit"> created by <span> TeamI6 </span> | all rights reserved! </h1>

</section>

<!-- scroll top button  -->
<a href="#home" class="fas fa-angle-up" id="scroll-top"></a>

<!-- custom js file link  -->
<script src="script.js"></script>


</body>
</html>