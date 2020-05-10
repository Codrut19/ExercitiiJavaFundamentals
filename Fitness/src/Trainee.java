public class Trainee {
    private String name;
    private int stamina=1000;
    private int strength=50;

    public Trainee(){

    }
    public Trainee(String name){
        this.name=name;
    }


    public void cardio(){
        System.out.println("Am inceput cardio");
        System.out.println("Ati ars 300 de calorii");
        stamina -=30;
        strength +=10;
    }
    public void bodyPump(){
        System.out.println("Am inceput body pump");
        System.out.println("Ati ars 300 de calorii");
        stamina -=50;
        strength +=10;
    }
    public void box(){
        System.out.println("Am inceput box");
        System.out.println("Ati ars 250 de calorii");
        stamina -=70;
        strength +=10;
    }
    public String getName(){
        return name;
    }
    public int getStamina(){
        return stamina;
    }
    public int getStrength(){
        return strength;
    }
}
