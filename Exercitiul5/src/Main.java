public class Main {
    public static void main(String[] args) {
        //Se da un text
        //Sa se afiseze toate cuvintele care incep cu litera "s" sau cu litera "d"
        //Sa se afiseze litera de la pozitia 3 din fiecare cuvant
        String text = "To unsubscribe from future promotional notification emails, please opt-out here";
        afisareCuvinte(text);
        literaPozitie3(text);


    }

    public static void afisareCuvinte(String text){
        String [] arrayText = text.split(" ");
        for(int cursor = 0; cursor < arrayText.length; cursor++){
            arrayText[cursor] = arrayText[cursor].toLowerCase();
            if(arrayText[cursor].startsWith("s") || arrayText[cursor].startsWith("d")){
                System.out.println(arrayText[cursor]);
            }

        }

    }
    public static void literaPozitie3(String text){
        String [] arrayText = text.split(" ");
        for(int cursor = 0; cursor < arrayText.length; cursor++){
            if(arrayText[cursor].length() > 3){
                System.out.println("Litera de la pozitia 3 a cuvantului " + arrayText[cursor] +  "este: " + arrayText[cursor].charAt(3));
            }

        }
    }
}
