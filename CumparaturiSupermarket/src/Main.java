import java.util.Date;
import java.util.Scanner;

public class Main {
    //Sa se modeleze cosul de cumparaturi dintr un supermarket
    //Fiecare produs sa fie reprezentat de un obiect care contine nume si pret ex mere 5 lei struguri 7 lei
    //cosul de cumparaturi va fi reprezentat de un array de produse
    //Sa se afiseze un meniu cu produsele dorite
    //Bazat pe ce se introduce la tastatura adaugam in cosul de cumparaturi
    //Sa se calculeze costul total al cosului de cumparaturi
    //Simulam plata pt cosul de cumparaturi

    public static void main(String[] args) {

        Produs[] cosDeCumparaturi = new Produs[10];
        System.out.println("Meniu cumparaturi");
        System.out.println("1.Mere");
        System.out.println("2.Covrigi");
        System.out.println("3.Set de brichete");
        System.out.println("4.Suc coca-cola");
        System.out.println("5.Apa minerala");
        System.out.println("6.Set imbus");
        System.out.println("7.SmartWatch");
        System.out.println("Va rugam alegeti produsele dorite:");
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati adaugat in cosul de cumparaturi mere");
                Produs mere = new Produs("Mere", 5);
                cosDeCumparaturi[0] = mere;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[0].getNume() + "si" + cosDeCumparaturi[0].getPret());
            } else if (optiune == 2) {
                System.out.println("Ati adaugat in cosul de cumparaturi covrigi");
                Produs covrigi = new Produs("Covrigi", 2);
                cosDeCumparaturi[1] = covrigi;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[1].getNume() + "si" + cosDeCumparaturi[1].getPret());
            } else if (optiune == 3) {
                System.out.println("Ati adaugat in cosul de cumparaturi set de brichete");
                Produs setBrichete = new Produs("SetBrichete", 10);
                cosDeCumparaturi[2] = setBrichete;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[2].getNume() + "si" + cosDeCumparaturi[2].getPret());
            } else if (optiune == 4) {
                System.out.println("Ati adaugat in cosul de cumparaturi Suc coca-cola");
                Produs sucCola = new Produs("Suc coca-cola", 6);
                cosDeCumparaturi[3] = sucCola;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[3].getNume() + "si" + cosDeCumparaturi[3].getPret());
            } else if (optiune == 5) {
                System.out.println("Ati adaugat in cosul de cumparaturi apa minerala");
                Produs apaMinerala = new Produs("Apa minerala", 3);
                cosDeCumparaturi[4] = apaMinerala;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[4].getNume() + "si" + cosDeCumparaturi[4].getPret());
            } else if (optiune == 6) {
                System.out.println("Ati adaugat in cosul de cumparaturi set imbus");
                Produs setImbus = new Produs("Set imbus", 25);
                cosDeCumparaturi[5] = setImbus;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[5].getNume() + "si" + cosDeCumparaturi[5].getPret());
            } else if (optiune == 7) {
                System.out.println("Ati adaugat in cosul de cumparaturi smart watch");
                Produs smartWatch = new Produs("Smart Watch", 250);
                cosDeCumparaturi[6] = smartWatch;
                System.out.println("Afisam adaugarea " + cosDeCumparaturi[6].getNume() + "si" + cosDeCumparaturi[6].getPret());
            } else {
                System.out.println("Optiunea aleasa nu exista");
            }

            optiune = scanner.nextInt();

        }
        System.out.println("Ati apasat tasta 0, ati terminat cumparaturile");

        System.out.println("Ati cumparat");
        System.out.println("Lungimea cosului de cumparaturi este " + cosDeCumparaturi.length);
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                //in acest mod afisam numele si pretul fiecarui produs din array
                System.out.println("Produsul este: " + cosDeCumparaturi[cursor].getNume() + "la pretul de: " + cosDeCumparaturi[cursor].getPret());
            }
        }

        //declaram variabila pt stocarea pretului in afara buclei for deoarece nu dorim resetarea variabilei
        int pretTotal = 0;
        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                //in acest fel adunam pretul produselor la pretul total
                pretTotal += cosDeCumparaturi[cursor].getPret();
            }
        }
        System.out.println("Pretul total este " + pretTotal);
        System.out.println("S-au platit cumparaturile ");
        pretTotal = 0;

        //Sa se reprezinte si produse perisabile acestea vor avea in plus daca expirarii
        //Sa se simuleze din nou un cos de cumparaturi
        //Daca utilizatorul cumpara un produs perisabil si daca de expirare este depasita se va afisa un mesaj "Produs expirat" si nu il vom mai adauga in cos
        //Adaugam alergeni si cand afisam cosul de cumparaturi sa afisam si alergenii
        //un cos de cumparaturi pentru produsele non-alimentare
        //un cos de cumparaturi pentru produsele alimentare
        Date dataAstazi = new Date(2020, 5, 9);
        int pretTotalAlimente = 0;
        int pretTotalNonAlimente = 0;

        ProduseAlimentare[] cosAlimentare = new ProduseAlimentare[10];
        Produs[] cosNonAlimentare = new Produs[10];

        System.out.println("Meniu produse");
        System.out.println("1.Mere");
        System.out.println("2.Carne");
        System.out.println("3.Lapte");
        System.out.println("4.Matura");
        System.out.println("5.Bec");
        System.out.println("6.Pronto");

        optiune = scanner.nextInt();

        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales mere");
                ProduseAlimentare mere = new ProduseAlimentare("mere", 5, "zaharoza, viermi", null);
                cosAlimentare[0] = mere;
            } else if (optiune == 2) {
                System.out.println("Ati ales carne");
                ProduseAlimentare carne = new ProduseAlimentare("carne", 20, "condimente", new Date(2020, 3, 1));
                cosAlimentare[1] = carne;
            } else if (optiune == 3) {
                System.out.println("Ati ales lapte");
                ProduseAlimentare lapte = new ProduseAlimentare("Lapte", 4, "Lactoza", new Date(2020, 6, 1));
                cosAlimentare[2] = lapte;
            } else if (optiune == 4) {
                System.out.println("Ati ales matura");
                Produs matura = new Produs("Matura", 12);
                cosNonAlimentare[0] = matura;
            } else if (optiune == 5) {
                System.out.println("Ati ales bec");
                Produs bec = new Produs("Bec", 11);
                cosNonAlimentare[1] = bec;
            } else if (optiune == 6) {
                System.out.println("Ati ales Pronto");
                Produs pronto = new Produs("Pronto", 7);
                cosNonAlimentare[2] = pronto;
            } else {
                System.out.println("Numarul introdus nu exista!");
            }


            optiune = scanner.nextInt();
        }
        System.out.println("Acestea sunt produsele non-alimentare din cos:");
        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {


                System.out.println("Produsul este: " + cosNonAlimentare[cursor].getNume() + "si pretul este " + cosNonAlimentare[cursor].getPret());
            }
        }
        System.out.println("Acestea sunt produsele alimentare din cos:");
        for (int cursor = 0; cursor < cosAlimentare.length; cursor++) {
            if (cosAlimentare[cursor] != null) {
                System.out.println("Produsul este " + cosAlimentare[cursor].getNume() + "cu pretul " + cosAlimentare[cursor].getPret() + "Alergeni " + cosAlimentare[cursor].getAlergeni() + "Data de expirare " + cosAlimentare[cursor].getDataExpirare());
                if (cosAlimentare[cursor].getDataExpirare().before(dataAstazi)) {
                    System.out.println("Produsul este expirat si va fi scos din cos");
                    cosAlimentare[cursor] = null;
                }
            }
        }

        for(int cursor= 0; cursor < cosAlimentare.length; cursor++){
            if(cosAlimentare[cursor] != null){
                pretTotalAlimente += cosAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru alimente este: " + pretTotalAlimente);

        for(int cursor = 0; cursor < cosNonAlimentare.length; cursor ++){
            if(cosNonAlimentare[cursor] != null){
                pretTotalNonAlimente += cosNonAlimentare[cursor].getPret();
            }
        }
        System.out.println("Pretul total pentru non-alimente este: " + pretTotalNonAlimente);
        System.out.println("Pretul total este: " + (pretTotalAlimente + pretTotalNonAlimente));
    }
    //Sa se reprezinte un calculator care face operatii simple si operatiile stiintifice dar si urmatoarele operatii cu stringur
    //concateneaza 2 stringuri
    //verifica daca stringul contine un anumit caracter
    //aduna lungimea a 2 stringuri
    //verifica daca lungimea unui string este numar par sau impar
    //transforma un string intr un sir de caractere
    //verifica daca stringul incepe cu o vocala
    //numara spatiile dintr un string
}
