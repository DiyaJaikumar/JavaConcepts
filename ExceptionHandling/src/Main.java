// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       try{
           int myInt= Integer.parseInt("l");
       }catch(NumberFormatException nfe){ //(Exception e) catches every exception
           System.out.println("catch block");
       }
       finally{
           System.out.println(("finally block"));
       }
       System.out.println("End");
    }
}