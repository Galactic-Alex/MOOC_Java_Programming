import java.util.Objects;

public class Book {
    private int ageRecommendation;
    private String name;

    public Book(int ageRecommendation, String name) {
        this.ageRecommendation = ageRecommendation;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
}
