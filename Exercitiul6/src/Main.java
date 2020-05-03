import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Se da un array de caractere sa se afiseze in ordine inversa

        char[] arrayCharacter = new char[10];
        arrayCharacter[0] = 'a';
        arrayCharacter[1] = 'b';
        arrayCharacter[2] = 'c';
        arrayCharacter[3] = 'd';
        arrayCharacter[4] = 'e';
        arrayCharacter[5] = 'f';
        arrayCharacter[6] = 'g';
        arrayCharacter[7] = 'h';
        arrayCharacter[8] = 'i';
        arrayCharacter[9] = 'j';
        arrayCharacter(arrayCharacter);

    }
    public static void arrayCharacter(char[] arrayCharacter){
        for(int cursor = arrayCharacter.length -1 ; cursor >= 0; cursor--){
            System.out.println(arrayCharacter[cursor]);
        }
    }
}
