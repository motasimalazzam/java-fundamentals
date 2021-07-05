package inheritance;

import interfaces.TheaterInteface;

import java.util.*;

public class Theater implements TheaterInteface {

    private String name;
    private List<String> movies = new ArrayList<>();
    private Map<String , Review> reviews = new HashMap<>();


// CONSTRUCTOR
    public Theater(String name) {
        this.name = name;
    }

//    METHODS
    public Map<String, Review> getReviews() {
        return reviews;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Review addNewRev(String body, String author, int stars) {
        Review newReview = new Review(body, author, stars);
        this.reviews.put("",newReview);
        return newReview;
    }


    public void addNewRev(Review rev, String movieName) {
        if(movies.contains(movieName)) {
            reviews.put(movieName , rev);
            System.out.println("The movie name added to review");
        }else{
            System.out.println("Movie doesn't exist");
        }
    }

    public void addMovie(String movieTitle) {
        this.movies.add(movieTitle);
    }
    public List<String> getMovies() {
        return this.movies;
    }
    public void removeMovie(String movieTitle) {
        this.movies.remove(movieTitle);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies" + movies +
                ", reviews=" + reviews +
                '}';
    }
}
