import java.io.Serializable;

public class Student extends Person implements Examinator, Examinator2, Comparable<Student>, Serializable {

    private int infoGrade;
    private int mathGrade;
    private int phizGrade;
    private boolean admisPoli;
    private boolean admisFacultateaDeFizica;
    private int medie;

    public Student(String firstName, String lastName, int infoGrade, int mathGrade, int phizGrade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.infoGrade=infoGrade;
        this.mathGrade=mathGrade;
        this.phizGrade=phizGrade;
    }
    public Student(){

    }


    public void computeAverage() throws BadGradesException, InvalidGradesException {
        int medie = (this.mathGrade + this.infoGrade + this.phizGrade) / 3;
        if(medie < 6 ){
            throw new BadGradesException("Studentul este repetent");
        }else if(medie < 9 && medie > 6){
            this.admisPoli = false;
        }else if (medie <= 10 && medie  >= 9){
            this.admisPoli = true;
        }else if(this.mathGrade > 10 && this.infoGrade > 10 && this.phizGrade > 10){
            throw new InvalidGradesException("Media introdusa nu este valida");
        }

    }
    public boolean getAdmisPoli(){
        return this.admisPoli;
    }

    @Override
    public void computeAverage2() throws BadGradesException, InvalidGradesException {
        int medie = (this.mathGrade + this.phizGrade) / 2;
        if(medie< 6){
            throw new BadGradesException("Studentul nu sa prezentat la examene");
        }else if(medie > 6 && medie < 9){
            this.admisFacultateaDeFizica = false;
        }else if (medie >= 9 && medie <= 10){
            this.admisFacultateaDeFizica = true;
        }else if (this.mathGrade >10 || this.phizGrade > 10){
            throw new InvalidGradesException("Va rugam introduceti un numar de la 1 la 10");
        }

    }
    public boolean getAdmisFacultateaDeFizica(){
        return this.admisFacultateaDeFizica;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getInfoGrade() {
        return infoGrade;
    }

    public int getPhizGrade() {
        return phizGrade;
    }
    public int getMedie(){
        this.medie=(this.mathGrade+this.phizGrade+this.infoGrade)/3;
     return this.medie;
    }

    @Override
    public int compareTo(Student o) {
        if(this.medie > o.getMedie()){
            return 1;
        }else if(this.medie < o.getMedie()){
            return -1;
        }
        return 0;
    }
}
