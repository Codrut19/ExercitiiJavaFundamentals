import java.util.Scanner;

public class Main {
    //Sa se modeleze o sedinta de training
    //vom avea : Trainee(student)- nume, stamina, strength
    //o sa se antreneze lunea miercurea si vinerea
    //o sa porneasca cu stamina 1000
    //de fiecare data cand face un exercitiu stamina o sa scada
    //de fiecare cand face un exercitiu puterea o sa ii creasca
    //porneste cu puterea 50
    //luni o sa faca cardio - scade staimina cu 30
    //ati ars 300 de calorii
    //miercuri body-pump - scade stamina cu 50
    //ati ars 500 de calorii
    //vinerea box -scade stamina cu 70
    //ati ars 250 de calorii
    //stamina >0
    public static void main(String[] args) {
        Scanner name= new Scanner(System.in);
        System.out.println("Va rugam introduceti numele Trainee-ului");
        String nume=name.nextLine();
        Trainee ion=new Trainee("Ion");
        Scanner zi=new Scanner(System.in);
        System.out.println("Va rugam introduceti ziua curenta");
        String ziCurenta=zi.nextLine();
        while((ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")) && ion.getStamina()>0) {


            switch (ziCurenta) {
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                case "Miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta");
                    break;
            }
            ziCurenta=zi.nextLine();
        }
        if(!ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")){
            System.out.println("Ai introdus o zi in care nu se antreneaza " + ziCurenta);
        }

        if(ion.getStamina()<=0){
            System.out.println("Trainee-ul " + ion.getName() + " a obosit ");
        }
        System.out.println("Puterea trainee-ului " + ion.getName() + " a ajuns la " + ion.getStrength());

    }
}
