package tutoring;

public class Skyscraper extends House{

    public Skyscraper(int bedrooms, int bathrooms) {
        super(bedrooms, bathrooms);
    }

    @Override
    public double calcSquareFootage() {
        return 0;
    }

    @Override
    public boolean isSellable() {
        return false;
    }
}
