package tutoring;

public class MultiFamily extends FamilyHouse{

    public MultiFamily(int bedrooms, int bathrooms) {
        super(bedrooms, bathrooms);
    }

    @Override
    public double calcSquareFootage() {
        return this.propertyWidth * this.propertyLength;
    }

    public boolean canHoldMultipleFamilies(){
        return true;
    }


    @Override
    public boolean isSellable() {
        return true;
    }
}
