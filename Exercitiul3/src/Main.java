public class Main {
    public static void main(String[] args) {
        //Se da un text sa se numere cuvintele care au lungimea impara si se termina cu litera 'e'
        String text = "This email was sent to codrut.cristian19@gmail.com because you have registered an account at FreeBitco.in. " +
                "To unsubscribe from future promotional notification emails, please opt-out here";
        int variabila = numarCuvinte(text);
        System.out.println("Numarul de cuvinte gasite: " + variabila);
    }

    public static int numarCuvinte(String text) {
        int numarCuvinte = 0;
        String[] rezultatSplit = text.split(" ");
        for (int cursor = 0; cursor < rezultatSplit.length; cursor++) {
            System.out.println(rezultatSplit[cursor]);
            if(rezultatSplit[cursor].length() % 2 !=0 && rezultatSplit[cursor].endsWith("e")){
                numarCuvinte++;
            }
        }
        return numarCuvinte;


    }
}
