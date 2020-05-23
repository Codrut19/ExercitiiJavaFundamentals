import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 13;
        int y = 0;

        try {
            System.out.println("Rezultat impartirii lui x la y: " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Incercati o operatie aritmetica imposibila " + e.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println("Valoarea de pe pozitia 3 este: " + array[3]);
            System.out.println("Valoarea de pe pozitia 16 este: " + array[16]);
            System.out.println("Afisam x : y " + (13 / 0));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A aparut o exceptie specifica " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A aparut o exeptie  " + e.getMessage());
        }

        String text = "a";
        if(text == null){
            throw new NullPointerException("Ai uitat sa instantiezi textul");
        }

        try {
            System.out.println("Afisam lungimea textului " + text.length());

        } catch (NullPointerException e) {
            System.out.println("Aveti grija ca nu ati instantiat obiectul " + e.getMessage());
        }
        String text1 = "Tratam exceptii";
        System.out.println("Caracterul de pozitia 8 este: " + returneazaCaracter(text1));
        String text2 = "Tratam exceptii";
        try {
            System.out.println("Caracterul de la pozitia 8 este: " + returneazaCaracter(text2));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Textul este mai mic decat pozitia cautata " + e.getMessage());
        }

        //Se introduce un numar de la tastatura
        //Daca numarul este par afisam un mesaj "Bravo ati ales un numar par"
        //Daca numarul nu este par vrem sa aruncam exceptia OddNumberException
        try {
            numar();
        }catch (OddNumberException e){
            System.out.println("Aveti grija ce numar introduceti " + e.getMessage());
        }

        //punem utilizatorul sa introduca un cuvant
        //daca cuvantul incepe cu o vocala aruncam exceptia VowelException
        //daca incepe cu o consoana afisam mesajul totul ok
        try{
            cuvantul();
        }catch (VowelException e){
            System.out.println("Din pacate ati introdus o vocala " + e.getMessage());
        }
    }

    public static char returneazaCaracter(String text) throws StringIndexOutOfBoundsException {
        return text.charAt(8);
    }
    public static void numar() throws OddNumberException{
        System.out.println("Va rugam introduceti un numar de la tastatura");
        Scanner scan = new Scanner(System.in);
        int numar = scan.nextInt();
        System.out.println("Ati ales numarul: " + numar);
        if(numar % 2 == 0){
            System.out.println("Felicitari ati ales un numar par");
        }else{
            throw new OddNumberException("Ati ales un numar impar");
        }
    }
    public static void cuvantul() throws VowelException {
        System.out.println("Va rugam introduceti un cuvant ");
        Scanner scan = new Scanner(System.in);
        String cuvant = scan.nextLine();
        System.out.println("Ati introdus cuvantul: " + cuvant);

        if(cuvant.startsWith("a") || cuvant.startsWith("e") || cuvant.startsWith("i") || cuvant.startsWith("o") || cuvant.startsWith("u")){
            throw new VowelException("Cuvantul incepe cu o vocala");
        }else{
            System.out.println("Totul este bine");
        }

    }
}

