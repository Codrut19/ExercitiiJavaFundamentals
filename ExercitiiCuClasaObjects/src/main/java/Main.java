import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Balan", "Andrei", "Bucuresti");
        Student student1 = new Student("Ion", "Costel","Galati");
        Student student2 = new Student("Balan", "Andrei","Bucuresti");
        System.out.println("Informatii Student " + student);
        System.out.println("Informatii Student1 " + student1);
        System.out.println("Informatii Student2 " + student2);

        if(student.equals(student2)){
            System.out.println("Sunt egali");
        }else{
            System.out.println("Nu sunt egale");
        }

        Masina masina = new Masina("Dacia", "Logan", 5);
        Masina masina1 = new Masina("Dacia", "Duster", 5);

        if(masina.equals(masina1)){
            System.out.println("Masinile sunt egale");
        }else{
            System.out.println("Masinile nu sunt egale");
        }

    }
}
