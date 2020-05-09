public class CalculatorStiintific extends Calculator {

    public CalculatorStiintific(){

    }
    // un numar ridicat la puterea altui numar
    public double ridicareLaPutere(int a,int b){
        return Math.pow(a,b);
    }
    //radical dintr un numar
    public double radicalDinNumar(int a){
        return Math.sqrt(a);
    }
    //logaritm in baza 10 dintr un numar
    public double logaritmBaza10(int a){
        return Math.log10(a);
    }
    //logaritm dintr un numar
    public double logaritmNumar(int a){
        return Math.log(a);
    }
}
