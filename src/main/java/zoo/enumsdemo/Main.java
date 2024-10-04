package zoo.enumsdemo;

public class Main {
    public static void main(String[] args) {
        Days dayOfTheWeek = Days.MON;
        Days[] days = Days.values();

        switch (dayOfTheWeek){
            case FRI :
                System.out.println("Friday Forum");
                break;
            case SAT, SUN:
                System.out.println("Closed on weekends");
                break;
            default:
                System.out.println("Just another day");
                break;
        }


        //System.out.println(dayOfTheWeek.ordinal());
        //loops through the days - ordinal
//            Days d = Days.WED;
//            if(d == dayOfTheWeek){
//                System.out.println("Friday Forum");
//            }else if(d == Days.FRI || d == Days.SAT){
//                System.out.println("Yay it's the weekend");
//            }else{
//                System.out.println("Just another day");
//            }

            //print every day of the week except friday -




    }

}
