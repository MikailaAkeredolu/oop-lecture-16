package zoo.enumsdemo;

public enum Days {
    SUN(1),
    MON(2),
    TUE(3),
    WED(4),
    THU(5),
    FRI(6),
    SAT(7);

    private final int numberOfDay;
    Days(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }
}
