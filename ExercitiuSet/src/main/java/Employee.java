public class Employee {
    private String name;
    private String surname;
    private String department;

    public Employee(String name, String surname, String department){
        this.name=name;
        this.surname=surname;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }
    public String toString(){
        return this.name + " " + this.surname + " " + this.department;
    }
    public boolean equals(Employee obj){
        if(this.name.equals(obj.getName()) && this.surname.equals(obj.getSurname()) && this.department.equals(obj.getDepartment())){
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return this.name.length() + this.surname.length() + this.department.length();
    }
}
