import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Vrem sa se modeleze comportamentul unui calculator simlu(adunare, scadere, inmultire, impartire)
        //Calculatorul sa fie reprezentat folosind POO.

        Calculator calculator = new Calculator();

        System.out.println("Rezultatul adunarii este: "+ calculator.adunare(5, 10));
        System.out.println("Rezultatul scaderii este " + calculator.scadere(10, 5));

        int inmultire = calculator.inmultirea(2, 2);
        System.out.println("Rezultatul inmultirii este " + inmultire);
        int imparatire = calculator.impartire(2,2);
        System.out.println("Rezultatul inmultirii este " + imparatire);

        //De aici citim valorile de la tastatura obiectu care ne ajuta se numeste Scanner

        Scanner scanner = new Scanner(System.in);
        //citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti primul numar: ");
        int primulNumar = scanner.nextInt();
        //Citeste al doilea numar de la tastatura
        System.out.println("Va rugam introduceti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();

        System.out.println("Numerele introduse de dumneavoastra sunt " + primulNumar + "si" + alDoileaNumar);

        int adunare = calculator.adunare(primulNumar,alDoileaNumar);
        System.out.println("Rezultatul adunarii sc este: " + adunare);
        int scadere = calculator.scadere(primulNumar,alDoileaNumar);
        System.out.println("Rezulatatul scaderii sc este: " + scadere);

        inmultire = calculator.inmultirea(primulNumar,alDoileaNumar);
        System.out.println("Rezultatul inmultirii sc este: " + inmultire);
        imparatire = calculator.impartire(primulNumar,alDoileaNumar);
        System.out.println("Rezultat impartire sc este: " + imparatire);

    }
}
