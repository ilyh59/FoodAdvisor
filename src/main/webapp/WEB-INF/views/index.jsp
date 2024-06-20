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
        <a href="<c:url value="/sign_in.do"/>">Sign in</a>
        <a href="<c:url value="/sign_up.do"/>">Sign up</a>

    </nav>

</header>

<!-- header section ends -->

<!-- home section starts  -->

<section class="home" id="home">

    <div class="content">
        <h3>choose your restaurant with love</h3>
        <p>Nous allons fournir les meilleures recommandations des restaurants pour vous les maroccains à tous les prix. Chaque
            recommandation contiendra les revues des clients qui ont déjà visité ces
            restaurants et leurs retours sur la qualité des produits présentés…</p>
        <a href="<c:url value="/sign_in.do"/>" class="btn">check now</a>
    </div>

    <div class="image">
        <img src="assets/images/home-img.png" alt="">
    </div>

</section>

<!-- home section ends -->


<!-- footer section  -->

<section class="footer">

    <h1 class="credit"> created by <span> ILYAS</span> | all rights reserved! </h1>

</section>
</body>
</html>
