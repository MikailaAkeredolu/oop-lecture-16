package tutoring;

public class Condos extends House{

    public double maintenanceFees;

    public Condos(int bedrooms, int bathrooms ) {
        super(bedrooms, bathrooms);
        this.maintenanceFees = 1000.0;
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
