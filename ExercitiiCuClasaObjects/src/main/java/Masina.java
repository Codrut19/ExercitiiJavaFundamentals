public class Masina {
    private String marca;
    private String model;
    private int nrUsi;

    public Masina(String marca, String model, int nrUsi){
        this.marca=marca;
        this.model=model;
        this.nrUsi=nrUsi;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public String toString(){
        return this.model + " " + this.marca + " " + this.nrUsi;
    }
    public boolean equals(Masina obj){
        if(this.marca.equals(obj.getMarca()) && this.model.equals(obj.getMarca()) && this.nrUsi==obj.nrUsi){
            return true;
        }else
            return false;
    }
}
