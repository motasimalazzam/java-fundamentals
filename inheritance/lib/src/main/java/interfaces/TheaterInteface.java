package interfaces;

import inheritance.Review;

public interface TheaterInteface {
    String getName();
    Review addNewRev (String body, String author, int stars);
}
