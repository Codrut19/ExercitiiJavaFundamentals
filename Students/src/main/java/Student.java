public class Student extends Person implements Examinator {

    public int infoGrade;
    public int mathGrade;
    public int phizGrade;
    public boolean admisPoli;

    public Student(String firstName, String lastName, int infoGrade, int mathGrade, int phizGrade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.infoGrade=infoGrade;
        this.mathGrade=mathGrade;
        this.phizGrade=phizGrade;
    }
    public Student(){

    }


    public void computeAverage() throws BadGradesException {
        int medie = (this.mathGrade + this.infoGrade + this.phizGrade) / 3;
        if(medie < 6){
            throw new BadGradesException("Studentul este repetent");
        }else if(medie < 9 && medie > 6){
            this.admisPoli = false;
        }else{
            this.admisPoli = true;
        }

    }
    public boolean getAdmisPoli(){
        return this.admisPoli;
    }
}
