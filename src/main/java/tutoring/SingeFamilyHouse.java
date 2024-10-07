package tutoring;

public class SingeFamilyHouse extends FamilyHouse{

    public SingeFamilyHouse(int bedrooms, int bathrooms) {
        super(bedrooms, bathrooms);
    }

    @Override
    public double calcSquareFootage() {
        return this.propertyWidth * this.propertyLength;
    }

    public boolean getFistTimeHomeOwnerCredit(){
        return true;
    }

    @Override
    public boolean isSellable() {
        return true;
    }
}
