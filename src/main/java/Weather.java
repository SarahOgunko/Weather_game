import java.util.Scanner;

public class Weather {

public static void main (String[]arg){

    Scanner reader = new Scanner (System.in);
    System.out.print("What is the forecast average temperature today");
    int temperature = reader . nextInt();


     String message;
     message = temperature > 15 ? "no coat today" : " Better wear my coat.";
     System.out.println(message);


    }

}






