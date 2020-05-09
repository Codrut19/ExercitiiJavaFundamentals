import java.util.Date;

public class ProduseAlimentare extends Produs{
    private String alergeni;
    private Date dataExpirare;

    public ProduseAlimentare(){

    }
    public ProduseAlimentare(String nume, int pret, String alergeni, Date dataExpirare){
        this.nume=nume;
        this.pret=pret;
        this.alergeni=alergeni;
        this.dataExpirare=dataExpirare;
    }
    public String getAlergeni(){
        return alergeni;
    }
    public Date getDataExpirare(){
        return dataExpirare;
    }

}
