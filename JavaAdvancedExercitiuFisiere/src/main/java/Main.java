import java.io.*;

public class Main {
    //sa se citeasca dintr un fisier linie cu linie
    //sa se scrie in alt fisier liniile din primul fisier care au numar par de cuvinte
    public static void main(String[] args) {

        //Declaram calea
        try {
            String textDeCitit = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiiJavaAdvancedFeatures\\FisierDeCitit.txt";
            String textDeScris = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiiJavaAdvancedFeatures\\FisierDeScris.txt";

            FileReader fileReader = new FileReader(textDeCitit);
            FileWriter fileWriter = new FileWriter(textDeScris);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String text = bufferedReader.readLine();
            while (text != null) {
                String[] arraySplit = text.split(" ");
                if (arraySplit.length % 2 == 0) {

                    bufferedWriter.write(text);
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                text = bufferedReader.readLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }
    }
}
