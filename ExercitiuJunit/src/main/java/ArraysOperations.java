public class ArraysOperations {
    public int lungimeArray(int[] numereIntregi ){
        return numereIntregi.length;
    }
    public int numereMaiMari(int[] numere){
        int numarNumere=0;
        for(int cursor = 0; cursor < numere.length; cursor++){
            if(numere[cursor] > 5 ){
                numarNumere ++;
            }


        }
        return numarNumere;

    }
}
