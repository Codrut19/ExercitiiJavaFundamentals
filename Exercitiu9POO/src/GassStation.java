public class GassStation {
    private int motorina;
    private int benzina;
    private int pretM;
    private int pretB;
    public GassStation(){

    }
    public GassStation(int motorina,int pretM, int benzina, int pretB){
        this.motorina=motorina;
        this.benzina=benzina;
        this.pretM=pretM;
        this.pretB=pretB;
    }
    public int getMotorina(){
        return motorina;
    }
    public int getPretM(){
        return pretM;
    }
    public int getBenzina(){
        return benzina;
    }
    public int getPretB(){
        return pretB;
    }
    public int sellM(int motorinaDeVandut){
        int pretTotal=0;
        if(this.motorina<10){
            System.out.println("Nu mai avem motorina in stoc");
        }else{
            if(motorinaDeVandut>this.motorina){

            }
            this.motorina -=motorinaDeVandut;
            pretTotal=motorinaDeVandut*pretM;
        }

       return pretTotal;
    }
    public int sellB(int benzinaDeVandut){
        int pretTotal=0;
        if(this.benzina<10){
            System.out.println("Nu mai avem benzina pe stoc");
        }else{
            if(benzinaDeVandut>this.benzina){

            }
            this.benzina-=benzinaDeVandut;
            pretTotal=benzinaDeVandut*pretB;
        }
        return pretTotal;

    }
    public String incaseazaBanii(int bani, int pretTotal){
        if(bani==pretTotal){
            return "Multumim va mai asteptam";
        }else if(bani>pretTotal){
            return "Multumim si poftim restul " + (bani-pretTotal);
        }else{
            return "Chemam politia";
        }

    }
}
