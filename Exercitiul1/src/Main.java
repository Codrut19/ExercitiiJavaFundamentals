public class Main {
    public static void main(String[] args) {
        //1 o functie care primeste 2 striguri ca parametrii si vefircam daca primul string il contine pe al doilea.
     String string1 = "Ana are pere de aceasta data";
     String string2 = "Ana numai are mere";
     verifcaIncludere(string1, string2);

    }

    public static void verifcaIncludere(String string1, String string2){
        if(string1.contains(string2)){
            System.out.println("Primul contine pe al doilea");
        }else{
            System.out.println("Primul nu il contine pe al doilea");

        }
    }

}
