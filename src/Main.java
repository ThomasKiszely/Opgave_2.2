import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        // Opretter scanner med navnet "input"

        System.out.print ("Indtast navn: ") ;
        String navn = input.next() ;
        //Bruger indtaster navn

        System.out.print ("Indtast alder: ") ;
        int alder = input.nextInt() ;
        //Bruger indtaster alder

        System.out.print ("Indtast dit yndlingsdecimaltal: ") ;
        double yndlingsdecimaltal = input.nextDouble() ;
        //Bruger indtaster yndlingsdecimaltal

        System.out.println("Navn: " + navn + ", alder: " + alder +
                " & yndlingsdecimaltal: " + yndlingsdecimaltal) ;

       input.close() ;







    }
}
