import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Vrem sa se modeleze comportamentul unui calculator simlu(adunare, scadere, inmultire, impartire)
        //Calculatorul sa fie reprezentat folosind POO.

        // instantierea obiectului default
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

        //Sa se modeleze un calculator care sa permita operatiile unui calculator simplu
        // si urmatoarele operatii: -un numar ridicat la puterea altui numar
                                  // radical dintr un numar
                                  // logaritm in baza 10 dintr un numar
                                  // logaritm dintr un numar

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();
        System.out.println("Rezultatul adunarii2 este " + calculatorStiintific.adunare(10,15));
        System.out.println("Rezultatul scaderii2 este " + calculatorStiintific.scadere(10,15));
        System.out.println("Rezultatul inmultirii2 este " + calculatorStiintific.inmultirea(10,15));
        System.out.println("Rezultatul impartirii2 este " + calculatorStiintific.impartire(10,15));

        double ridicareLaPutere = calculatorStiintific.ridicareLaPutere(3,6);
        System.out.println("Rezultatul ridicarii la putere este: " + ridicareLaPutere);
        double radicalDinNumar = calculatorStiintific.radicalDinNumar(64);
        System.out.println("Rezultatul radicalului este: " + radicalDinNumar);
        double logaritmBaza10 = calculatorStiintific.logaritmBaza10(100);
        System.out.println("Rezultatul logaritmului in baza este " + logaritmBaza10);
        double logaritmNumar = calculatorStiintific.logaritmNumar(30);
        System.out.println("Rezultatul logaritmului este " + logaritmNumar);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Va rugam introduceti primul numar pentru ridicare la putere");
        primulNumar = scanner1.nextInt();
        System.out.println("Va rugam introduceti al doilea numar pentru ridicarea la putere ");
        alDoileaNumar = scanner1.nextInt();

        ridicareLaPutere = calculatorStiintific.ridicareLaPutere(primulNumar,alDoileaNumar);
        System.out.println("Rezultatul ridicarii la putere al numerelor sc este " + primulNumar + "si" + alDoileaNumar + "este" + calculatorStiintific.ridicareLaPutere(5,3));

        System.out.println("Va rugam introduceti numarul pentru calcularea  radicalului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcularii radicalului este " + primulNumar + "este" + calculatorStiintific.radicalDinNumar(77));

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului in baza 10");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul calcului logaritm in baza 10 este: " + primulNumar + "este: " + calculatorStiintific.logaritmBaza10(44) );

        System.out.println("Va rugam introduceti numarul pentru calcularea logaritmului");
        primulNumar = scanner1.nextInt();
        System.out.println("Rezultatul logaritmului  " + primulNumar + "este" + calculatorStiintific.logaritmNumar(21));

        //Sa se introduca 2 numere
        //Afisam numerele
        //Sa se afiseze meniul
        //1.Adunare
        //2.Inmultire
        //3.Radical
        //4.Scadere
        //Afisam mesajul va rugam alegeti o optiune.
        //In functie de optiunea aleasa se realizeaze operatie respectiva
        //daca operatia aleasa presupune folosirea unui singur numar facem operatie si pentru al doilea numar

        int optiune = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam introduceti cele 2 numere");
        primulNumar = sc.nextInt();
        alDoileaNumar = sc.nextInt();
        System.out.println("Numerele introduse sunt " + primulNumar + "si" + alDoileaNumar);
        System.out.println("Meniu");
        System.out.println("1.Adunare");
        System.out.println("2.Inmultire");
        System.out.println("3.Radical");
        System.out.println("4.Scadere");
        System.out.println("Va rugam alegeti o optiune");
        optiune = sc.nextInt(); // utilizatorul introduce un numar la tastatura

        while(optiune != 9) { //daca utilizatorul introduce orice alt numar in afara de 9


            if (optiune == 1) {
                System.out.println("Ati ales optiunea adunare");
                System.out.println("Rezultatul adunarii este " + calculatorStiintific.adunare(primulNumar, alDoileaNumar));

            } else if (optiune == 2) {
                System.out.println("Ati ales optiunea 2");
                System.out.println("Rezultatul inmultirii este: " + calculatorStiintific.inmultirea(primulNumar, alDoileaNumar));

            } else if (optiune == 3) {
                System.out.println("Ati ales optiunea 3");
                System.out.println("Rezultatul radicalului este: " + calculatorStiintific.radicalDinNumar(primulNumar));
                System.out.println("Rezultatul radicaluilui pt al doilea numaru este: " + calculatorStiintific.radicalDinNumar(alDoileaNumar));

            } else if (optiune == 4) {
                System.out.println("Ati ales optiunea 4");
                System.out.println("Rezultatul scaderii este: " + calculatorStiintific.scadere(primulNumar, alDoileaNumar));

            } else {
                System.out.println("Nu gasim optiunea aleasa de dvs");
            }
            optiune = sc.nextInt();
        }
        System.out.println("Ne pare rau ati apasat tasta 9 am iesit din program");
    }
}
