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
        <div class="box">
            <!--Ici on va mettre le lien de chaque restaurant-->
            <a href="<c:url value="/restaurants_details.do"/>">
                <img class="image" src="assets/images/s-img-1.jpg" alt="">
                <div class="content">
                    <img src="assets/images/s-1.png" alt="">
                    <h3>tasty burger</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
                </div>
            </a>

            
        </div>

        
        <div class="box">
            <img class="image" src="assets/images/s-img-2.jpg" alt="">
            <div class="content">
                <img src="assets/images/s-2.png" alt="">
                <h3>tasty pizza</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
            </div>
        </div>
        <div class="box">
            <img class="image" src="assets/images/s-img-3.jpg" alt="">
            <div class="content">
                <img src="assets/images/s-3.png" alt="">
                <h3>cold ice-cream</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
            </div>
        </div>
        <div class="box">
            <img class="image" src="assets/images/s-img-4.jpg" alt="">
            <div class="content">
                <img src="assets/images/s-4.png" alt="">
                <h3>cold drinks</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
            </div>
        </div>
        <div class="box">
            <img class="image" src="assets/images/s-img-5.jpg" alt="">
            <div class="content">
                <img src="assets/images/s-5.png" alt="">
                <h3>tasty sweets</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
            </div>
        </div>
        <div class="box">
            <img class="image" src="assets/images/s-img-6.jpg" alt="">
            <div class="content">
                <img src="assets/images/s-6.png" alt="">
                <h3>healty breakfast</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda inventore neque amet ipsa tenetur voluptates aperiam tempore libero labore aut.</p>
            </div>
        </div>

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