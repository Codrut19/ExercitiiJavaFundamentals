import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Sa se citeasca drintr un fisier
        //Pe primul rand avem un sir de numere separate prin ;
        //Sa se ordoneze numerele
        //Sa se caute numarul 325
        //Sa se afiseze cel mai mic numar
        //Sa se afiseze cel mai mare numar
        //Sa se afiseze lista de numere fara duplicate

        try {
            String filePath = "C:\\Users\\codru\\RepositoryCursJavaGalati\\NumereDeCitit.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            String[] arrayNumere = text.split(";");
            List<Integer> numbers = new ArrayList<Integer>();
            for(int cursor = 0; cursor < arrayNumere.length; cursor ++){
              numbers.add(Integer.valueOf(arrayNumere[cursor]));

            }
            //Aici facem operatia de ordonare
            Collections.sort(numbers);
            System.out.println("Afisam elementele ordonate");
            for(Integer number: numbers){
                System.out.println(number);
            }
            //Cautam numarul 325 --> Functioneaza daca lista este ordonata crescator
            int searchedNumber=Collections.binarySearch(numbers, Integer.valueOf(325));
            System.out.println("Afisam pozitia numarului 325 " + searchedNumber);

            //Aici le afisam in ordine inversa
            Collections.reverse(numbers);
            System.out.println("Afisam elementele in ordine inversa");
            for(Integer number: numbers){
                System.out.println(number);
            }



            //Cel mai mare numar
            int greatNumber = Collections.max(numbers);
            System.out.println("Acesta este cel mai mare numar " + greatNumber);
            //Cel mai mic numar
            int smallNumber = Collections.min(numbers);
            System.out.println("Acesta este cel mai mic numar " + smallNumber);

            Set<Integer> numbersSet = new HashSet<Integer>();
            for(Integer number: numbers){
                numbersSet.add(number);
            }
            for (Integer number: numbersSet){
                System.out.println("Acesta este numarul printat " + number);
            }


        }catch(FileNotFoundException e){
            System.out.println("A aparut o eroare " + e.getMessage());
        }catch(IOException e){
            System.out.println("A aparut o alta eroare" + e.getMessage());
        }
    }
}