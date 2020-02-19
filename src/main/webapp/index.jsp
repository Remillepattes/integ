<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Boutique RCR</title>
  </head>
  
	<style>
	* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #333;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Container for flexboxes */
section {
  display: -webkit-flex;
  display: flex;
}


/* Style the content */
article {
  -webkit-flex: 3;
  -ms-flex: 3;
  flex: 3;
  background-color: #f1f1f1;
  padding: 10px;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Add a black background color to the top navigation */
.topnav {
  background-color: #333;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
	
	
	</style>
<!--    <body>
  <h1>Bienvenue sur la boutique RCR !</h1>
  	</br>
  	<h2><a href="./products"> <button>Liste des produits</button></a><h2>
  </body>
-->

<body>

<header>
  <h2> Bienvenue sur la boutique RCR !</h2>

</header>
  <div class="topnav">
  	<a class="active" href="./">Maison</a>
  	<a href="./products">Liste des produits</a>
  	<a href="#about">About</a>
</div>

<section>

  
  <article>
    <h1>Boutique RCR</h1>
    <p></p>
  </article>
</section>

</body>
</html>