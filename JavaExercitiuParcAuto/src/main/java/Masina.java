public class Masina implements Comparable<Masina>, Leasing{
    private String marca;
    private String model;
    private String culoare;
    private int pret;
    private String combustibil;
    private int fabricatie;
    private boolean sold;

    public Masina(String marca, String model, String culoare, int pret, String combustibil, int fabricatie){
        this.marca=marca;
        this.model=model;
        this.culoare=culoare;
        this.pret=pret;
        this.combustibil=combustibil;
        this.fabricatie=fabricatie;
    }
    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public String getCuloare(){
        return culoare;
    }
    public int getPret(){
        return pret;
    }
    public String getCombustibil(){
        return combustibil;
    }
    public int getFabricatie(){
        return fabricatie;
    }
    public boolean getSold(){
        if((this.marca.equals("Audi")||this.marca.equals("Skoda")||this.marca.equals("BMW")) && this.culoare.equals("negru")&& this.combustibil.equals("benzina")){
            return sold =true;
        }else{
            return sold = false;
        }
    }


    public int compareTo(Masina o) {
        if(this.fabricatie< o.getFabricatie()){
            return -1;
        }else if(this.fabricatie> o.getFabricatie()){
            return 1;
        }
        return 0;
    }

    public int numberOfPays() {
        return 24;
    }

    public int payRate() {
        return this.pret/numberOfPays();
    }
}
