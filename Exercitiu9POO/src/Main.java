import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sa se modeleze o benzinarie
        //Obiectele:
        //Gass station
        //O sa aibe motorina, benzina
        //repr prin cantitate
        //pret pe litru
        //pt benzina
        //pt motorina
        //De fiecare data cand cineva cumpara scade cantitatea
        //cand cantitatea este mai mica decat 10 litrii afisam un mesaj
        //cand cineva cumpara calculam pretul
        //obiect person cu o suma de bani
        //el o sa poata sa platesca pentru benzina sau motorina
        //suma platita scade suma de bani a persoanei
        //persoana poate sa plateasca cu o suma rotunda si benzinaria trebui sa dea rest
        //daca utilizatorul numai are bani ajisam un mesaj


        GassStation OMV = new GassStation(50, 5, 50, 6);
        Scanner persoana = new Scanner(System.in);
        System.out.println("Va rugam introduceti numele persoanei");
        String name = persoana.nextLine();
        Person cumparator = new Person(name, 300);
        int optiune = 0;
        Scanner meniu = new Scanner(System.in);
        System.out.println("Va rugam alegeti o optiune");
        System.out.println("1.Motorina");
        System.out.println("2.Benzina");
        optiune = meniu.nextInt();
        while (optiune != 9) {
            if (optiune == 1) {
                System.out.println("Ati ales sa cumparati motorina");
                int pretTotal = OMV.sellM(5);
                System.out.println("Aveti de platit " + pretTotal);
                String rezultatTranzactie = cumparator.tranzactieM(pretTotal);
                if (rezultatTranzactie.startsWith("Nu aveti destui bani")) {
                    String rezultatIncasare = OMV.incaseazaBanii(pretTotal / 2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este " + rezultatIncasare);
                } else {
                    String rezultatIncasare = OMV.incaseazaBanii(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este " + rezultatIncasare);
                    System.out.println("Am ramas fara motorina " + OMV.getMotorina());

                }


            } else if (optiune == 2) {
                System.out.println("Ati ales sa cumparati benzina");
                int pretTotal = OMV.sellB(6);
                System.out.println("Aveti de platit " + pretTotal);
                String rezultatTranzatie = cumparator.tranzactieB(pretTotal);
                if (rezultatTranzatie.startsWith("Nu aveti destui bani")) {
                    String rezultatIncasare = OMV.incaseazaBanii(pretTotal / 2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este " + rezultatIncasare);
                } else {
                    String rezultatIncasare = OMV.incaseazaBanii(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este " + rezultatIncasare);
                    System.out.println("Am ramas fara benzina " + OMV.getBenzina());
                }

            } else {
                System.out.println("Nu gasim optiunea");
            }

            optiune = meniu.nextInt();
        }

    }
}
