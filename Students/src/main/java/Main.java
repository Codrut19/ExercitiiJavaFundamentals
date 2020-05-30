import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa se modeleze urmatoarele entitati
        //un student care o sa aiba nume, prenume
        //se va introduce de la tastatura numele, prenumele, si notele
        //nota la mate , informatica, fizica
        //un atribut admis la politehnica care o sa fie boolean
        //clasa parinte sa fie Person
        //o interfata sa gestionam notele si admiterea la facultate o sa se calculeze in functie de medii
        //daca media notelor este mai mica decat 6 sa se arunce o exceptie BadGradesException

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti numele");
        String nume = scanner.nextLine();
        System.out.println("Va rugam introduceti prenumele");
        String prenume = scanner.nextLine();
        System.out.println("Va rugam sa introduceti nota la matematica");
        int notaMate = scanner.nextInt();
        System.out.println("Va rugam sa introduceti nota la informatica");
        int notaInformatica = scanner.nextInt();
        System.out.println("Va rugam introduceti nota la fizica");
        int notaFizica = scanner.nextInt();

        System.out.println("Ati introdus numele, prenumele studentului si notele la probe" + nume + " " + prenume + " " + notaMate + " " + notaInformatica + " " + notaFizica);
        Student student = new Student(nume, prenume, notaMate, notaInformatica, notaFizica);
        try{
            student.computeAverage();
        }catch (BadGradesException e){
            System.out.println("A fost o problema cu calcularea mediei " + e.getMessage());
        }catch (InvalidGradesException e){
            System.out.println("Va rugam introduceti o nota de la 1 la 10" + e.getMessage());
        }
        System.out.println("Rezultatul admiterii este: " + student.getAdmisPoli());

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Va rugam introduceti numele");
        String nume2 = scanner1.nextLine();
        System.out.println("Va rugam introduceti prenumele");
        String prenume2 = scanner1.nextLine();
        System.out.println("Va rugam sa introduceti nota la matematica");
        int notaMate2 = scanner1.nextInt();
        System.out.println("Va rugam introduceti nota la fizica");
        int notaFizica2 = scanner1.nextInt();
        try{
            student.computeAverage2();
        }catch (BadGradesException | InvalidGradesException e){
            System.out.println("Calcularea mediei a fost prea mica incearca la anul" + e.getMessage());
        }
        System.out.println("Rezultatul admiteri la facultatea de fizica este : " + student.getAdmisFacultateaDeFizica());

     Student student_mihai = new Student("Mihai","Topor",8,6,9);
     Student student_Gabi = new Student("Gabriel","Matei",7,8,5);
     Student student_Dan = new Student("Daniel","Eftimie",10,9,10);
     int medieM = (student_mihai.getInfoGrade() + student_mihai.getMathGrade() + student_mihai.getPhizGrade())/3;
     int medieG = (student_Gabi.getInfoGrade() + student_Gabi.getPhizGrade() + student_Gabi.getMathGrade())/3;

     if(medieM > medieG){
         System.out.println("Media lui Mihai este mai mare decat media lui Gabi");
     }else{
         System.out.println("Media lui Gabi este mai mare");
     }
     if(student_mihai.getMedie() > student_Gabi.getMedie()){
         System.out.println("Media lui Mihai este mai mare ca a lui Gabi");
     }else{
         System.out.println("Media lui Gabi este mai mare ca a lui Mihai");
     }


     int comparatie=student_mihai.compareTo(student_Gabi);
     if(comparatie > 0){
         System.out.println("Media lui Mihai este mai mare ca a lui Gabi");

     }else if(comparatie < 0){
         System.out.println("Media lui Gabi este mai mare");
     }else{
         System.out.println("Cei 2 au mediile egale");
     }

    }
    //sa se creeze si sa se trateze exceptia atunci cand notele sunt mai mici decat 1 sau mai mari decat 10
    //sa se mai adauge urmatorul comportament prin intermediul unui interfete sa se calculeze media doar la matematica s fizica si sa se adauge un camp admis la facultatea de fizica
    //sa se calculeze media la matematica si informatica si sa mai fie un camp admisInfo
    //sa se mai adauge o expectie si sa se arunce o exceptie si sa se arunce atunci cand media este 10 perfect sa se afiseze un mesaj Felicitari aveti un 10 perfect
    //de adaugat o interfata cu comportamente care pot fi implementate
}
