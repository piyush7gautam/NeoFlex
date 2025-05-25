<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>NeoFlex Home</title>
    <style>
        body {
            margin: 0;
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            background-color: #141414;
            color: white;
        }

        .header {
            background-color: #111;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header h1 {
            color: #e50914;
            margin: 0;
            font-size: 28px;
        }

        .header nav a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
            font-size: 16px;
            transition: color 0.3s;
        }

        .header nav a:hover {
            color: #e50914;
        }

        .banner {
            padding: 60px 40px 20px;
            background: linear-gradient(to right, rgba(20, 20, 20, 0.9), rgba(20, 20, 20, 0.6)), url('https://wallpapercave.com/wp/wp4056410.jpg');
            background-size: cover;
            background-position: center;
            color: white;
        }

        .banner h2 {
            font-size: 36px;
            margin-bottom: 10px;
        }

        .banner p {
            font-size: 18px;
            max-width: 500px;
        }

        .movie-section {
            padding: 20px 40px;
        }

        .movie-section h3 {
            font-size: 22px;
            margin-bottom: 15px;
        }

        .movie-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(160px, 1fr));
            gap: 16px;
        }

        .movie-card {
            background-color: #222;
            border-radius: 8px;
            overflow: hidden;
            transition: transform 0.3s;
            cursor: pointer;
        }

        .movie-card:hover {
            transform: scale(1.08);
        }

        .movie-card img {
            width: 100%;
            display: block;
        }

        .movie-card p {
            padding: 10px;
            margin: 0;
            font-size: 14px;
            text-align: center;
        }
    </style>
</head>
<body>

<div class="header">
    <h1>NeoFlex</h1>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="recommend.jsp">Recommendations</a>
    </nav>
</div>

<div class="banner">
    <h2>Welcome to NeoFlex</h2>
    <p>Stream your favorite movies by genre. Personalized recommendations, just for you!</p>
</div>

<div class="movie-section">
    <h3>Action</h3>
    <div class="movie-grid">
        <div class="movie-card">
            <img src="https://m.media-amazon.com/images/I/71oyWdX7fOL._AC_SY679_.jpg" alt="John Wick">
            <p>John Wick</p>
        </div>
        <div class="movie-card">
            <img src="https://m.media-amazon.com/images/I/81h+zUUGd0L._AC_SY679_.jpg" alt="Mad Max: Fury Road">
            <p>Mad Max: Fury Road</p>
        </div>
    </div>
</div>

<div class="movie-section">
    <h3>Comedy</h3>
    <div class="movie-grid">
        <div class="movie-card">
            <img src="https://m.media-amazon.com/images/I/81C3bSu5jnL._AC_SY679_.jpg" alt="The Mask">
            <p>The Mask</p>
        </div>
        <div class="movie-card">
            <img src="https://m.media-amazon.com/images/I/51v5ZpFyaFL._AC_.jpg" alt="Superbad">
            <p>Superbad</p>
        </div>
    </div>
</div>

</body>
</html>

