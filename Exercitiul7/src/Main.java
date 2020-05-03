public class Main {
    public static void main(String[] args) {
        //se da un array de 7 cuvinte sa se concateneze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0

        String[] arrayCuvinte = new String[7];
        arrayCuvinte[0] = "natura";
        arrayCuvinte[1] = "Ocean";
        arrayCuvinte[3] = "jungla";
        arrayCuvinte[4] = "mare";
        arrayCuvinte[5] = "animale";
        arrayCuvinte[6] = "case";
        concatenare(arrayCuvinte);

    }

    public static void concatenare(String[] arrayCuvinte){
        String cuvinte = "";
        for(int cursor = 1; cursor < arrayCuvinte.length; cursor++){
            if(cursor % 3 == 0){
                cuvinte= cuvinte.concat(arrayCuvinte[cursor]);

            }

        }
        System.out.println("Rezultat: " + cuvinte);
    }
}
