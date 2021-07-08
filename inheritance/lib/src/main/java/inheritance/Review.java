package inheritance;

import interfaces.ReviewInterface;

public class Review implements ReviewInterface {
    private String body;
    private String author;
    public double stars;

    Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public double getStars() {
        return this.stars;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getBody() {
        return this.body;
    }


    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }


}
