import java.io.*;

public class Main {
    public static void main(String[] args) {

        //sa se modeleze un parc auto
        //masinile vor fi citite dintr un fisier
        //in fisier vom avea marca, modelul, culoare, pret combustibul, data fabricarii (separate prin virgula)
        //3 tipuri de masini
        //nemtesti
        //frantuzesti
        //altele
        //o sa citim din fisier masinile
        //daca masina este nemteasca le scriem intr un fisier separat
        //la fel si pentru celelalte
        //masinile au comportamele:
        //pot fi vandute in leasing -  (avans care se scade din pretul total)o sa putem lua numarul de rate si cat valoreaza
        //masinile pot fi comparate (calitate)
        //calitatea este reprezentata de an de fabricatie
        //masina o sa mai aibe un atribut vandut (boolean)
        //dupa ce setam campul true masinile o sa fie scrise in alt fisier
        //La final afisam toate masinile vandute
        //masinile vandute o sa fie cele nemtesti de culoare neagra si combustibilul benzina

        //Avem de nevoie de o clasa masina --> contine marca, model, culoare, pret,combustibil,data fabricarii
        //o sa aibe un camp de vanzare (boolean)
        //Comportament -> creem o interfata leasing - (getRate + getValoare)
        //implementam interfata comparable - pentru a putea compara masinile
        //avem nevoie de un fisier de unde sa citim masinile
        //cand le citim le sortam pe fisierul respectiv (inca 3 fisiere)
        //mai creem un fisier unde adaugam masinile vandute si le afisam (le luam din primul fisier)

        try {
            String masiniInitiale = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiuParcAutoFisiere\\MasiniInitial.txt";
            FileReader masiniInitialeReader = new FileReader(masiniInitiale);
            BufferedReader masiniInitialeBuffer = new BufferedReader(masiniInitialeReader);

            String masiniNemtesti = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiuParcAutoFisiere\\MasiniNemtesti.txt";
            FileWriter masiniNemtestiWriter= new FileWriter(masiniNemtesti);
            BufferedWriter masiniNemtestiBuffer= new BufferedWriter(masiniNemtestiWriter);

            String masiniFrantuzesti = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiuParcAutoFisiere\\MasniniFrantuzesti.txt";
            FileWriter masiniFrantuzestiWriter= new FileWriter(masiniFrantuzesti);
            BufferedWriter masiniFrantuzestiBuffer= new BufferedWriter(masiniFrantuzestiWriter);

            String masiniAltele = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiuParcAutoFisiere\\MasiniAltele.txt";
            FileWriter masiniAlteleWriter= new FileWriter(masiniAltele);
            BufferedWriter masiniAlteleBuffer= new BufferedWriter(masiniAlteleWriter);

            String masiniVandute = "C:\\Users\\codru\\RepositoryCursJavaGalati\\ExercitiuParcAutoFisiere\\MasiniVandute.txt";
            FileWriter masiniVanduteWriter= new FileWriter(masiniVandute);
            BufferedWriter masiniVanduteBuffer= new BufferedWriter(masiniVanduteWriter);

            String text= masiniInitialeBuffer.readLine();
            while(text!=null){
                String[] split= text.split(",");
                Masina masina=new Masina(split[0],split[1],split[2],Integer.valueOf(split[3]),split[4],Integer.valueOf(split[5]));
                System.out.println("Rata la masina " + masina.getMarca() + " este " + masina.payRate());

                if(masina.getSold()==true){
                    masiniVanduteBuffer.write(text);
                }

                text=masiniInitialeBuffer.readLine();
            }
            masiniVanduteBuffer.flush();
            masiniVanduteBuffer.close();

        } catch (IOException e) {
            System.out.println("A aparut o eroare");
        }
    }
}
