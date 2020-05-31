import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Sa se citeasca dintr un fisier de pe fiecare rand numele, prenumele, clasa, optional
        //Sa se grupeze in colectii diferite elevii in functie de clasa care fac parte si in functie de optionalul la care participa
        //Atributele vor fi separate prin ;
        try {
            String filePath = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierElevi.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            //Aici creem Map
            Map<String, ArrayList<Student>> groupsMap = new HashMap<String, ArrayList<Student>>();
            Map<String, ArrayList<Student>> optionalsMap = new HashMap<String, ArrayList<Student>>();
            //Pregatim Map
            groupsMap.put("10",new ArrayList<Student>());
            groupsMap.put("11", new ArrayList<Student>());
            groupsMap.put("12", new ArrayList<Student>());

            optionalsMap.put("Germana", new ArrayList<Student>());
            optionalsMap.put("Informatica", new ArrayList<Student>());
            optionalsMap.put("MatematicaAplicata", new ArrayList<Student>());


            while(text != null){
                System.out.println("Prima linie citita este " + text);
                String[] arrayCuvinte = text.split(";");
               //Aici urmeaza sa creem studentul in functie de atribute din text
                Student student = new Student(arrayCuvinte[0], arrayCuvinte[1], arrayCuvinte[2], arrayCuvinte[3]);
                //Aici grupam studentul in functie de group si vor fi adaugati in groupsMap
                if(student.getGroup().equals("10")){ //aici scriem sintaxa pentru grupa 10
                  groupsMap.get("10").add(student);  //aici adaugam studentii in functie de grupa 10

                }else if(student.getGroup().equals("11")){
                    groupsMap.get("11").add(student);

                }else if(student.getGroup().equals("12")){
                    groupsMap.get("12").add(student);
                }

                //Aici grupam studentul in functie de optional si vor fi adaugati in optionalsMap
                if(student.getOptional().equals("Germana")){
                    optionalsMap.get("Germana").add(student);
                }else if(student.getOptional().equals("Informatica")){
                    optionalsMap.get("Informatica").add(student);

                }else if(student.getOptional().equals("MatematicaAplicata")){
                    optionalsMap.get("MatematicaAplicata").add(student);
                }

                text= bufferedReader.readLine();



            }
             //Afisam toti studentii de la informatica
            System.out.println("Aici afisam studentii de la informatica");
            ArrayList<Student> studentiInfo =optionalsMap.get("Informatica");
            for(Student student1: studentiInfo){
                System.out.println(student1);
            }

            //Afisam toti studentii din clasa a 11 a
            System.out.println("Aici afisam studentii din clasa a 11 a");
            ArrayList<Student> studenti11 = groupsMap.get("11");
            for(Student studentA11: studenti11){
                System.out.println(studentA11);
            }
            //Afisam toti studentii de la MatematicaAplicata
            System.out.println("Aici afisam studentii de la Matematica Aplicata");
            ArrayList<Student> studentiMate = optionalsMap.get("MatematicaAplicata");
            for(Student student2 : studentiMate){
                System.out.println(student2);
            }

            //Afisam toti studentii din clasa a 10 a
            System.out.println("Afisam studentii din clasa a 10 a");
            ArrayList<Student> studenti10 = groupsMap.get("10");
            for(Student studentiA10 : studenti10){
                System.out.println(studentiA10);
            }


        }catch(FileNotFoundException e){
            System.out.println("A aparut o eroare " + e.getMessage());
        }catch(IOException e){
            System.out.println("A aparut alta eroare " + e.getMessage());
        }
    }
}