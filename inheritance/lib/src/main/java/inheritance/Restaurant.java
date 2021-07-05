package inheritance;

import interfaces.RestaurantInterface;

import java.util.*;

public class Restaurant implements RestaurantInterface {

    private String name;
    private double numberOfStars ;
    private String priceCategory;



    private LinkedList<Review> reviews = new LinkedList<>();

    //  Constructor

    public Restaurant(String name, double numberOfStars, String  priceCategory) {

        this.name = name;

        if (numberOfStars > 5){
            this.numberOfStars = 5;
        }else if(numberOfStars<0){
            this.numberOfStars = 0;
        }else{
            this.numberOfStars = numberOfStars;
        }

        this.priceCategory = priceCategory;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    //  Methods

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getNumberOfStars() {
        return this.numberOfStars;
    }

    @Override
    public String getPriceCategory() {
        return this.priceCategory;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStars();
    }


    @Override
    public void updateStars() {
        double current = 0;
        for (int i=0; i < getReviews().size(); i++) {
            current += getReviews().get(i).getStars();
        }
        current = current/(getReviews().size());
        current = Math.round(current );
        this.numberOfStars = current;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory=" + priceCategory +
                '}';
    }
}
