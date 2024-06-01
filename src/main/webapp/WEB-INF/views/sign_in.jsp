<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Advisor </title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
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
        <h3>Connexion</h3>
        <form action="" method="post" >
            <div class="user-details">

              <div class="input-box">
                <span class="details">Email</span>
                <input type="text" name = "email" placeholder="Enter your email" required>
              </div>
              <div class="input-box">
                
              </div>
              <div class="input-box">
                <span class="details">Password</span>
                <input type="text"  name="password" placeholder="Enter your password" required>
              </div>

          </form>
          <div class="">
            <button type="submit" class="btn mt-4">submit</button>
        </div>
    </div>


</section>


<!-- footer section  -->

<section class="footer">

    <h1 class="credit"> created by <span> TeamI6 </span> | all rights reserved! </h1>

</section>

<!-- scroll top button  -->
<a href="#home" class="fas fa-angle-up" id="scroll-top"></a>

<script src="script.js"></script>

</body>
</html>