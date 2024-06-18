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

    <a href="#" class="logo"><i class="fas fa-utensils"></i>food advisor</a>

    <div id="menu-bar" class="fas fa-bars"></div>

    <nav class="navbar">
        <a href="#home">home</a>
        <a href="#restaurants">restaurants</a>

    </nav>

</header>

<!-- header section ends -->


<!-- speciality section starts  -->

<section class="speciality" id="restaurants">


    <h1 class="heading"> our <span>restaurants</span> </h1>

    <div class="box-container">

        <c:forEach var="restaurant" items="${listRestaurants}">
            <div class="box">
                <a href="<c:url value="/restaurants_details.do"/>">
                    <img class="image" src="${restaurant.image_url}" alt="">
                    <div class="content">
                        <img src="assets/images/s-1.png" alt="">
                        <h3> ${restaurant.name} </h3>
                        <p> ${restaurant.description} </p>
                    </div>
                </a>
            </div>
        </c:forEach>
    </div>

</section>

<!-- speciality section ends -->



<!-- footer section  -->

<section class="footer">

    <h1 class="credit"> created by <span> TeamI6 </span> | all rights reserved! </h1>

</section>

<!-- scroll top button  -->
<a href="#home" class="fas fa-angle-up" id="scroll-top"></a>

<!-- loader  -->
<div class="loader-container">
    <img src="assets/images/loader.gif" alt="">
</div>






<!-- custom js file link  -->
<script src="assets/js/script.js"></script>


</body>
</html>