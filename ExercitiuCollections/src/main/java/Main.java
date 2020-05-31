import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Proiect prin care exemplificam folosirea colectiilor din Java

        //Interfata Set
        //Sa se declare un set in care adaugam 10 din capitalele Europei

        Set<String> capitals = new HashSet<String>();
        //adaugam 10 capitale : add()
        capitals.add("Bucharest");
        capitals.add("Viena");
        capitals.add("Madrid");
        capitals.add("Roma");
        capitals.add("Sofia");
        capitals.add("Berlin");
        capitals.add("Budapest");
        capitals.add("Prague");
        capitals.add("Lisabona");
        capitals.add("London");

        //stergem o intrare din set: remove()
        capitals.remove("London");

        //adaugam in lista o intrare duplicata
        capitals.add("Berlin");
        //deoarece Set nu poate contine duplicate (Java verifica daca obiectul exista deja si nu il mai afiseaza) se verifica cu ajutorul hashCode

        //parcurgerea unui Set
        for(String capital : capitals){
            System.out.println("Capitala este: " + capital);
        }

        //List
        //Sa se adauge intr o lista 10 culori

        //ArrayList
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("brown");
        colors.add("orange");

        for(String color: colors){
            System.out.println("Culoarea gasita este: " + color);
        }
        System.out.println("Dupa ce am sters portocaliu");
        colors.remove("orange");
        for(String color: colors){
            System.out.println("Culoarea gasita este " + color);
        }

        //LinkedList

        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        numbers.add(44);
        numbers.add(77);
        numbers.add(88);

        for(Integer number: numbers){
            System.out.println("Numarul gasit este: " + number);
        }

        //numbers.remove(55)
        numbers.remove(Integer.valueOf(44));
        for(Integer number: numbers){
            System.out.println("Numarul gasit dupa stergere este " + number);
        }

     //Collections --> clasa din Java care ne ofera operatii cu colectii gata implementate(si optimizate)
        //Metodele din clase Collections sunt Statice

        //Sortam listele
        Collections.sort(numbers);

        System.out.println("Lista de numere dupa ce a fost sortata");
        for(Integer number : numbers){
            System.out.println("Numerele gasite sunt " + number);
        }
        Collections.sort(colors);
        System.out.println("Lista de culori dupa ce a fost sortata");
        for(String color: colors){
            System.out.println("Culorile gasite sunt " + color);
        }

        //cautarea --> returneaza indexul/pozitia pe care a fost gasit elementul cautat
        int result = Collections.binarySearch(numbers, 140);
        System.out.println("Rezultatul cautarii este " + result);

        int maximum = Collections.max(numbers);
        int minimum = Collections.min(numbers);

        System.out.println("Minimul si maximul sunt " + minimum + " " + maximum);

     //Colectia Map
     //Sa se declare un Map care sa se stocheze fiecare tara cu capitala

        Map<String,String> countryCapitalMap = new HashMap<String,String>();
        countryCapitalMap.put("Romania", "Bucharest");
        countryCapitalMap.put("Hungary","Budapest");
        countryCapitalMap.put("Bulgaria","Sofia");

        //pereche key-> value putem sa luam din map, valoarea in functie de key(daca o stim)
        System.out.println("Capitala Ungariei este " + countryCapitalMap.get("Hungary"));
        System.out.println("Capitala Bulgariei este " + countryCapitalMap.get("Sofia"));

        //map care contine numele persoanelor si varstele lor
        Map<String,Integer> personAgeMap = new HashMap<String,Integer>();
        personAgeMap.put("Popescu",25);
        personAgeMap.put("Ionescu",36);

        System.out.println("Varsta lui Ionescu este " + personAgeMap.get("Ionescu"));

        //parcurgem un map
        Set<String> countryCapitalKeys= countryCapitalMap.keySet();
        for(String key: countryCapitalKeys){
            System.out.println("Valoarea din map CountryCapitalMap aferenta ale cheii " + key + " este " + countryCapitalMap.get(key));
        }

    }

}
