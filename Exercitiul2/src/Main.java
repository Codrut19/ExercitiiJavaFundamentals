public class Main {
    public static void main(String[] args) {
        //Cerinta
        //Care e numarul cel mai mare dintr un array/vector
        //Avem un vector de 10 elemente int, returnam cel mai mare numar
        int [] elementeIntregi = new int [10];
        elementeIntregi[0]=0;
        elementeIntregi[1]=1;
        elementeIntregi[2]=2;
        elementeIntregi[3]=3;
        elementeIntregi[4]=30;
        elementeIntregi[5]=5;
        elementeIntregi[6]=6;
        elementeIntregi[7]=7;
        elementeIntregi[8]=8;
        elementeIntregi[9]=9;

        int valoare = celMaiMareNumar(elementeIntregi);
        celMaiMareNumar(elementeIntregi);
        System.out.println("Cel mai mare numar din sir: " + valoare);
    }
    public static int celMaiMareNumar(int [] elementeIntregi){
        int celMaiMareNumar = elementeIntregi[0];

        for(int cursor = 0; cursor < elementeIntregi.length; cursor++){

           if(elementeIntregi[cursor] > celMaiMareNumar){
               celMaiMareNumar = elementeIntregi[cursor];
           }
        }
        return celMaiMareNumar;
    }
}

