public class codingExercises {
    /*
    1.
    public class PositiveNegativeZero {
   public static void checkNumber(int number)
    {
        if(number>0)
        {
            System.out.println("positive");
        }

        else if(number<0)
        {
            System.out.println("negative");
        }

        else
        {
            System.out.println("zero");
        }

    }
}
    2.
    public class SpeedConverter {
    // write your code here


    public static long toMilesPerHour(double kilometersperHour){


        if(kilometersperHour<0){
            return -1;
        }else{
            return Math.round((kilometersperHour/1.609));

        }

    }

    public static void printConversion(double kilometersperHour){


        if(kilometersperHour<0){
            System.out.println("Invalid Value");
        }else{
            long mph=toMilesPerHour(kilometersperHour);
              System.out.println(kilometersperHour+" km/h"+" = "+mph+" mi/h");

        }

    }
}
   3.
   public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int megabytes= kiloBytes/1024;
            int remk = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+ megabytes+ " MB and "+remk+" KB");}


    }
 4.
  public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if(barking == true && (hourOfDay < 8 || hourOfDay >22)){
            return true;
        }else{
            return  false;
        }
    }

}
5.
public class LeapYear {
   public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("not leepyear");
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("leepyear");
                return year % 400 == 0;

            } else {
                System.out.println("not leepyear");
                return true;
            }
        } else {
            System.out.println("not leepyear");
            return false;
        }
    }
}
     */
}
