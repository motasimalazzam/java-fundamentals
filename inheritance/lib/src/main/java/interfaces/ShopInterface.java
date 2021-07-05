package interfaces;

import inheritance.Review;

public interface ShopInterface {

    String getName();
    String getDescription();
    int getNumOfDollarSign();

    void addReview(Review review);
    void updateStars();
}
