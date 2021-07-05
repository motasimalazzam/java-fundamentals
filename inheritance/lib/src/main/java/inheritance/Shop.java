package inheritance;

import interfaces.ShopInterface;

import java.util.LinkedList;

public class Shop implements ShopInterface {
    String name;
    String description;
    int numOfDollarSigns;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;

    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getNumOfDollarSign() {
        return this.numOfDollarSigns;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStars();
    }

    @Override
    public void updateStars() {
        int current = 0;
        for (int i=0; i < getReviews().size(); i++) {
            current += getReviews().get(i).getStars();
        }
        current = current/(getReviews().size());
        current = Math.round(current );
        this.numOfDollarSigns = current;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                '}';
    }


}
