public class Main {
    public static void main(String[] args) {
        //Se da un text
        //a. Sa se numere toate cuvinte care au lungimea mai mare decat 2, daca contin caracterul "i" si caracterul "i" se afla pe o pozitie para
        //ex: Matei

        String text = "To unsubscribe from future promotional notification emails, please opt-out here";

        int numarCuvinte = numarCuvinte(text);
        System.out.println("Numarul de cuvinte este " + numarCuvinte);
    }
    public static int numarCuvinte(String text){

        int numarCuvinte = 0;
        String [] cuvinte = text.split(" ");
        for( int cursor = 0; cursor < cuvinte.length; cursor++){
            if (cuvinte[cursor].length() > 2 && cuvinte[cursor].contains("i") && cuvinte[cursor].indexOf("i") % 2 == 0){
                numarCuvinte++;
            }

        }
        return numarCuvinte;
    }
}
