package com.neoflex.controller;

import com.neoflex.model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet("/recommend")
public class RecommendServlet extends HttpServlet {

    private static final Map<String, List<Movie>> movieRecommendations = new HashMap<>();

    @Override
    public void init() throws ServletException {
        movieRecommendations.put("Action", Arrays.asList(
                new Movie("Mad Max: Fury Road", "Action", 8.1, "https://m.media-amazon.com/images/I/81h+zUUGd0L._AC_SY679_.jpg"),
                new Movie("John Wick", "Action", 7.4, "https://m.media-amazon.com/images/I/71oyWdX7fOL._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Comedy", Arrays.asList(
                new Movie("The Grand Budapest Hotel", "Comedy", 8.1, "https://m.media-amazon.com/images/I/71CwQ-WXsnL._AC_SY679_.jpg"),
                new Movie("Superbad", "Comedy", 7.6, "https://m.media-amazon.com/images/I/51v5ZpFyaFL._AC_.jpg")
        ));

        movieRecommendations.put("Drama", Arrays.asList(
                new Movie("The Shawshank Redemption", "Drama", 9.3, "https://m.media-amazon.com/images/I/51NiGlapXlL._AC_.jpg"),
                new Movie("Forrest Gump", "Drama", 8.8, "https://m.media-amazon.com/images/I/71dDwV9dGPL._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Sci-Fi", Arrays.asList(
                new Movie("Inception", "Sci-Fi", 8.8, "https://m.media-amazon.com/images/I/81p+xe8cbnL._AC_SY679_.jpg"),
                new Movie("The Matrix", "Sci-Fi", 8.7, "https://m.media-amazon.com/images/I/51EG732BV3L._AC_.jpg")
        ));

        movieRecommendations.put("Horror", Arrays.asList(
                new Movie("Get Out", "Horror", 7.7, "https://m.media-amazon.com/images/I/81B9FkaN7BL._AC_SY679_.jpg"),
                new Movie("The Conjuring", "Horror", 7.5, "https://m.media-amazon.com/images/I/61q64HG4eML._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Romance", Arrays.asList(
                new Movie("The Notebook", "Romance", 7.8, "https://m.media-amazon.com/images/I/61kLzC5V3oL._AC_SY679_.jpg"),
                new Movie("La La Land", "Romance", 8.0, "https://m.media-amazon.com/images/I/91UedSWxo+L._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Thriller", Arrays.asList(
                new Movie("Gone Girl", "Thriller", 8.1, "https://m.media-amazon.com/images/I/81AFocW+a2L._AC_SY679_.jpg"),
                new Movie("Se7en", "Thriller", 8.6, "https://m.media-amazon.com/images/I/71xBLRBYOiL._AC_SY679_.jpg")
        ));

        // ✅ New genres
        movieRecommendations.put("Animation", Arrays.asList(
                new Movie("Coco", "Animation", 8.4, "https://m.media-amazon.com/images/I/81zVBfHpTbL._AC_SY679_.jpg"),
                new Movie("Inside Out", "Animation", 8.1, "https://m.media-amazon.com/images/I/91jN3tqN1XL._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Fantasy", Arrays.asList(
                new Movie("Harry Potter and the Sorcerer's Stone", "Fantasy", 7.6, "https://m.media-amazon.com/images/I/81iqZ2HHD-L._AC_SY679_.jpg"),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", 8.8, "https://m.media-amazon.com/images/I/51Qvs9i5a%2BL._AC_.jpg")
        ));

        movieRecommendations.put("Mystery", Arrays.asList(
                new Movie("Knives Out", "Mystery", 7.9, "https://m.media-amazon.com/images/I/81c7nLrwG0L._AC_SY679_.jpg"),
                new Movie("Prisoners", "Mystery", 8.1, "https://m.media-amazon.com/images/I/81jz-DkMMkL._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Biography", Arrays.asList(
                new Movie("The Social Network", "Biography", 7.7, "https://m.media-amazon.com/images/I/61rW6VqfDxL._AC_SY679_.jpg"),
                new Movie("Bohemian Rhapsody", "Biography", 7.9, "https://m.media-amazon.com/images/I/81n5T3VwMUL._AC_SY679_.jpg")
        ));

        movieRecommendations.put("Adventure", Arrays.asList(
                new Movie("Pirates of the Caribbean", "Adventure", 8.0, "https://m.media-amazon.com/images/I/81lfULVT2YL._AC_SY679_.jpg"),
                new Movie("Indiana Jones: Raiders of the Lost Ark", "Adventure", 8.4, "https://m.media-amazon.com/images/I/51THT3kydRL._AC_.jpg")
        ));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String genre = request.getParameter("genre");
        List<Movie> recommendedMovies = movieRecommendations.getOrDefault(genre, Collections.emptyList());
        request.setAttribute("movies", recommendedMovies);
        request.getRequestDispatcher("/recommend.jsp").forward(request, response);
    }
}



