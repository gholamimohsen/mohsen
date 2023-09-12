import java.util.Scanner;

public class LABB0908 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println( " Hej och Välkommen! ");
        System.out.println( " Vänligen mata in din nota, tack! " );


      try {

          int input = scanner.nextInt();
          if (input >= 50 && input <= 300) {
              System.out.println(" Din nota är : " + input);
              System.out.println(" Så din dricks blir : " + input * 0.15f);
              System.out.println(" Tack för denna gången och ha en trevlig dag! ");

          } else if (input > 300 && input <= 1000) {
              System.out.println(" Din nota är : " + input);
              System.out.println(" Så din dricks blir : " + input * 0.2f);
              System.out.println(" Tack för denna gången och ha en trevlig dag! ");

          } else if (input > 1000) {
              System.out.println(" Din nota är : " + input);
              System.out.println(" Så din dricks blir : " + input * 0.25f);
              System.out.println(" Tack för denna gången och ha en trevlig dag! ");

          } //else {
          // System.out.println(" Ogiltigt inmatning, försök igen! ");
          // System.out.println(" Kom ihåg, du kan bara mata in siffror högre än 50 och inga bokstäver ");
          //}
      }

      catch (Exception e) {
        System.out.println(" Ogiltigt inmatning, försök igen! ");
        System.out.println(" Kom ihåg, du kan bara mata in siffror högre än 50 och inga bokstäver ");

      }


    }
}
