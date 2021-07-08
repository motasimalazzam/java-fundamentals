package interfaces;

import inheritance.Review;

public interface RestaurantInterface {

    String getName();
    double getNumberOfStars();
    String  getPriceCategory();

    void addReview(Review review);
    void updateStars();
}
