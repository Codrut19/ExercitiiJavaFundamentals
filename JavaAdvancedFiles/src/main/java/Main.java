import java.io.*;

public class Main {
    public static void main(String[] args) {

        //sa se citeasca fiecare rand dintr un fisier
        //sa se afiseze numarul de cuvinte dintr un rand

        try {
            //Declaram calea catre fisier
            String filePath = "C:\\Users\\codru\\Documents\\FisierDeCitit.txt";
            //Incarcam fisierul in program
            //Se face cu ajutorul obiectului FileReader

            FileReader fileReader = new FileReader(filePath);
            //Incepem citirea din fisier linie cu linie
            //Obiectul folosit pentru a citi linie cu linie se numeste BufferedReadear
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text = bufferedReader.readLine();
            //Facem while ca sa putem citii toate randurile
            while (text != null) {
                System.out.println("Linia citita este: " + text);
                String[] wordsArray = text.split(" ");
                System.out.println("Numarul de cuvinte de pe o linie este: " + wordsArray.length);
                text = bufferedReader.readLine();

            }

        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }


        try {
            //Scriem intr un fisier

            String filePathToWrite = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierDeScris.txt";
            FileWriter fileWriter = new FileWriter(filePathToWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String liniiDeScris = "Afara ploua";
            String linieDeScris2 = "Afara numai ploua";
            bufferedWriter.write(liniiDeScris);
            //Newline este necesar pentru a pune randurile una sub alta
            bufferedWriter.newLine();
            bufferedWriter.write(linieDeScris2);
            bufferedWriter.newLine();
            //Avem nevoie de flush si close pentru a putea scrie
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }

    }
}
