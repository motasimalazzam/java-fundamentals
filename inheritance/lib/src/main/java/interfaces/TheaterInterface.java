package interfaces;

import inheritance.Review;

public interface TheaterInterface {
    String getName();
    Review addNewRev (String body, String author, int stars);
}
