import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Sa se citeasca dintr un fisier produsele aflate la vanzare dintr un magazin
        //Pe fiecare rand vom avea categoria (alimentare, curatenie, auto) , numele , raionul , pretul , reducerea
        //Sa se grupeze produsele in colectii in functie de categorie , pretul mai mic decat 100 Ron , pretul mai mic decat 50 Ron , mai mare decat 100 Ron
        //Vom avea 3 colectii - pt categorii , pt pret , pt reducere 10 % , > 20 % , 30%
        //La final sa se scrie produsele in functie de colectia din care fac parte in fisiere separate (3 fisiere )

        try {
            String filePath = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierMagazinProduse.txt";
            FileReader fileReader =  new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();

            Map<String, ArrayList<Product>> categoryProductMap = new HashMap<String, ArrayList<Product>>();
            Map<String, ArrayList<Product>> priceProductMap = new HashMap<String, ArrayList<Product>>();
            Map<String, ArrayList<Product>> discountProductMap = new HashMap<String, ArrayList<Product>>();
            //pregatim map pt categorii
            categoryProductMap.put("Alimentare", new ArrayList<Product>());
            categoryProductMap.put("Curatenie", new ArrayList<Product>());
            categoryProductMap.put("Auto", new ArrayList<Product>());
            //pregatim map pt pret
            priceProductMap.put("Lower100", new ArrayList<Product>());
            priceProductMap.put("Lower50", new ArrayList<Product>());
            priceProductMap.put("Greater100", new ArrayList<Product>());
            //pregatim map pt discount
            discountProductMap.put("10", new ArrayList<Product>());
            discountProductMap.put("20", new ArrayList<Product>());
            discountProductMap.put("30", new ArrayList<Product>());

            while(text != null){
                System.out.println("Afisam prima linie din text " + text);
                String[] arrayCuvinte = text.split(";");
                //Aici creem un obiect product
                Product product = new Product(arrayCuvinte[0],arrayCuvinte[1],arrayCuvinte[2],arrayCuvinte[3],arrayCuvinte[4]);

                if(product.getCategory().equals("Alimentare")){
                    categoryProductMap.get("Alimentare").add(product);
                }else if(product.getCategory().equals("Curatenie")){
                    categoryProductMap.get("Curatenie").add(product);

                }else if(product.getCategory().equals("Auto")){
                    categoryProductMap.get("Auto").add(product);

                }

                if(Integer.valueOf(product.getPrice()) < 100){
                    priceProductMap.get("Lower100").add(product);
                }else if(Integer.valueOf(product.getPrice()) < 50){
                    priceProductMap.get("Lower50").add(product);
                }else if(Integer.valueOf(product.getPrice()) > 100){
                    priceProductMap.get("Greater100").add(product);

                }

                if(product.getDiscount().equals("10")){
                    discountProductMap.get("10").add(product);
                }else if(product.getDiscount().equals("20")){
                    discountProductMap.get("20").add(product);
                }else if(product.getDiscount().equals("30")){
                    discountProductMap.get("30").add(product);
                }



                text=bufferedReader.readLine();
            }

            String fileWriteCategory = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierCategorie.txt";
            String fileWritePrice = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierPret.txt";
            String fileWriteDiscount = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierReducere.txt";

            FileWriter fileWriterCategory =  new FileWriter(fileWriteCategory);
            FileWriter fileWriterPrice = new FileWriter(fileWritePrice);
            FileWriter fileWriterDiscount = new FileWriter(fileWriteDiscount);

            BufferedWriter bufferedWriterCategory = new BufferedWriter(fileWriterCategory);
            BufferedWriter bufferedWriterPrice = new BufferedWriter(fileWriterPrice);
            BufferedWriter bufferedWriterDiscount = new BufferedWriter(fileWriterDiscount);

            //Scriem din colectia category in Fisier
          ArrayList<Product> productsAlimentareList = categoryProductMap.get("Alimentare");
          for(Product produsAlimentar : productsAlimentareList){
               bufferedWriterCategory.write(produsAlimentar.toString());
               bufferedWriterCategory.newLine();
          }

          ArrayList<Product> productsCuratenieList = categoryProductMap.get("Curatenie");
          for(Product produsCuratenie: productsCuratenieList){
              bufferedWriterCategory.write(produsCuratenie.toString());
              bufferedWriterCategory.newLine();
          }

          ArrayList<Product> productsAutoList = categoryProductMap.get("Auto");
          for(Product produsAuto : productsAutoList){
              bufferedWriterCategory.write(produsAuto.toString());
              bufferedWriterCategory.newLine();
          }
          bufferedWriterCategory.flush();
          bufferedWriterCategory.close();

          //Scriem din colectia Price in Fisier
            ArrayList<Product> productsPriceLower100 = priceProductMap.get("Lower100");
            for (Product productLower100 : productsPriceLower100){
                bufferedWriterPrice.write(productLower100.toString());
                bufferedWriterPrice.newLine();
            }
            ArrayList<Product> productsPriceLower50 = priceProductMap.get("Lower50");
            for(Product productLower50 : productsPriceLower50){
                bufferedWriterPrice.write(productLower50.toString());
                bufferedWriterPrice.newLine();
            }
            ArrayList<Product> productsPriceGreater100 = priceProductMap.get("Greater100");
            for (Product productGreater100 : productsPriceGreater100 ){
                bufferedWriterPrice.write(productGreater100.toString());
                bufferedWriterPrice.newLine();
            }
            bufferedWriterPrice.flush();
            bufferedWriterPrice.close();

            //Scriem din colectia in Fisier
            ArrayList<Product> productsDiscount10 = discountProductMap.get("10");
            for(Product productDiscount10 : productsDiscount10){
                bufferedWriterDiscount.write(productDiscount10.toString());
                bufferedWriterDiscount.newLine();
            }
            ArrayList<Product> productsDiscount20 = discountProductMap.get("20");
            for(Product productDiscount10 : productsDiscount20){
                bufferedWriterDiscount.write(productDiscount10.toString());
                bufferedWriterDiscount.newLine();

            }
            ArrayList<Product> productsDiscount30 = discountProductMap.get("30");
            for(Product productDiscount30 : productsDiscount30){
                bufferedWriterDiscount.write(productDiscount30.toString());
                bufferedWriterDiscount.newLine();
            }
            bufferedWriterDiscount.flush();
            bufferedWriterDiscount.close();









        }catch(FileNotFoundException e){
            System.out.println("A aparut o eroare " + e.getMessage());
        }catch (IOException e){
            System.out.println("A aparut o alta eroare " + e.getMessage());
        }
    }
}