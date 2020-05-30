import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //sa se citeasca dintr un fisier informatii despre angajatii unei companii
        //nume, prenume, departament ( IT si Vanzari)
        //dupa ce citim ii punem in 2 seturi separate IT , Vanzari
        //afisam cele 2 seturi

        Set<Employee> itSet = new HashSet<Employee>();
        Set<Employee> saleSet = new HashSet<Employee>();




        try{
            String filePath = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierAngajati.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text = bufferedReader.readLine();
            while(text != null){
                System.out.println("Citim primul angajat " + text);
                String[] cuvinteArray = text.split(",");
                Employee employee = new Employee(cuvinteArray[0],cuvinteArray[1],cuvinteArray[2]);
                if(employee.getDepartment().equals("IT")){
                    itSet.add(employee);
                }else if(employee.getDepartment().equals("Vanzari")){
                    saleSet.add(employee);
                }
                text = bufferedReader.readLine();



            }
            System.out.println("Primul set este: " );
            for(Employee employee: itSet){
                System.out.println("Angajatul din departamentul IT este: " + employee);
            }
            System.out.println("Al doilea set este: ");
            for(Employee employee: saleSet){
                System.out.println("Angajatul din departamentul Vanzari este " + employee);
            }





        }catch (FileNotFoundException e){
            System.out.println("A aparut o eroare");
        }catch (IOException e){
            System.out.println("A aparut inca o eroare");
        }


    }
}
