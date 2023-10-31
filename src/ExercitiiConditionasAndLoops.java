public class ExercitiiConditionasAndLoops {
    public static void main(String[] args) {
        System.out.println("exercitii conditionals+loops");
        System.out.println("exercitiul 1");
        //Scrieți un program care să afișeze toate numerele întregi de la 0 până la 10
        //(inclusiv).

        for (int l = 0; l<=10; l++){
            System.out.print(l+", ");
        }
        System.out.print("\n");
        for (int o = 0; o<=9; o++){
            System.out.print( o +", ");
        }
        System.out.print("10.\n");

        System.out.println("exercitiul 2");
        //Scrieți un program care să afișeze numerele întregi de la 20 până la 10 (inclusiv) în ordine descrescătoare.

        for (int e =20; e >=10; e--){
            System.out.print(e + " ");
        }

        System.out.println( "exercitiul 3");
        //Scrieți un program care să afișeze toate numerele pare pozitive până la 100 (inclusiv)

        for (int p=0; p<=100; p++) {
            if(p%2==0) System.out.print(p+", ");

        }

        System.out.println("exercitium 4");
        //Se dă un șir cu următoarele elemente: măr, căpsune, pere, banane. Scrieți un program care să afișeze
        // pentru fiecare fruct: “Îmi place să mananc [numeFruct]”, unde numeFruct reprezintă fiecare fruct din șir.
        String[] sir= {"mar", "capsune","pere","banane"};
        for (String fruct : sir){
            System.out.println("Imi place sa mananc "+fruct+".");
        }

        System.out.println("exercitiul5");
        //Scrieți un program care să afișeze numele lunii în funcție de un număr întreg de la 1-12.
        // Ex: 1 -> Ianuarie, 2-> Februarie, 3-> Martie, etc.
        String[] lunile={null, "ianuarie", "februarie","martie","aprilie","mai","iunie","iulie","august","septembrie","octombrie","noiembrie","decembrie"};
        for (int x=1; x<=12; x++){
            System.out.print(lunile[x]+" "); //incercare cu for
        }
        System.out.println("\r");
        int y=1;
        while (y<13){
            System.out.print(lunile[y]+ " ");
            y++;
        }
        System.out.println("\n");
        System.out.println("exercitii otionale");
        System.out.println("ex. 1");
        //Exercitiul 1 Declarati o variabila de tip int, cu numele “temperature” si dati-i o valoare la alegere.
        //Daca valoarea ei este mai mica decat 18, afisati “prea frig”. Daca valoarea este intre 18 si 22, afisati “ok”.
        // Daca valoarea este peste 22, afisati “prea cald”.

        int temperature = 26;
        if (temperature<=18){
            System.out.println("prea frig");
        } else if (temperature>18 && temperature<22) {
            System.out.println("ok");
        } else if (temperature>22) {
            System.out.println("prea cald");
        }

        System.out.println("exercitiu 2");
        //Exercitiul 2
        //Se dau doua variabile: char gender (gen) – initializati cu o valoare la alegere (posibile valori „m‟ sau „f‟)
        // boolean married (casatorit/a) - initializati cu o valoare la alegere
        //Scrieti un program folosind instructiuni conditionale, astfel incat
        // pentru gen „m‟, sa afiseze “Domnul”, indiferent daca persoana e casatorita sau nu
        // pentru gen „f‟ sa afiseze “Domnisoara”, daca nu e casatorita sau “Doamna”, daca e casatorita

        char gender = 'f';
        boolean married = false;
        if (gender == 'm'){
            System.out.println("Domnul");
        } else if (gender== 'f'&& married ) {
            System.out.println("doamna");
        } else if (gender == 'f' && !married) {
            System.out.println("domnisoara");
        }

        System.out.println("ex. 3");
        //Declarati si initializati doua variabile de tip int.
        //Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele doua: “[x] este mai mare decat [y]”,
        // unde x si y sunt valorile variabilelor
        // Daca cele doua sunt egale, programul trebuie sa afiseze “sunt egale”.

        int var1 = 52, var2 = 433, var3 = 1218;

        if (var1>var2){
            System.out.println(var1 + " este mai mare decat " + var2);
        } else if (var1<var2) {
            System.out.println(var2 + " este mai mare decat "+ var1);
        } else if (var1==var2) {
            System.out.println("sunt egale");
        }

        System.out.println("ex 4.");
        //Declarati o a treia variabila.
        //Screiti un program care sa afiseze variabila cu valoare mai mare dintre cele 3.
        if (var1 > var2){
            if (var3> var1){
                System.out.println("maximul este " + var3);
            } else if ( var3 < var1) {
                System.out.println("maximul este " + var1);
            }
        } else if (var1 < var2) {
            if (var3 > var2){
                System.out.println("maximul este " +var3);
            } else if (var3 <var2) {
                System.out.println("maximul este "+ var2);

            }

        }

        int max;
        if(var1>var2) max=var1;
        else max=var2;
        if(var3>max) max=var3;
        System.out.println(max);

        System.out.println("ex. 5");
        //Exercitiul 5 – IF Declarati o variabila de tip char cu numele letter si dati-i o valoare la alegere.
        //Daca valoarea este consoana, afisati “[letter] este consoana”, daca este vocala, afisati “[letter] este vocala”,
        // unde letter e valoarea variabilei.
        char letter= 'a';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " este o vocala");
        } else System.out.println(letter+ " este o consoana");


        String vocale = "aeiou";
        if (vocale.indexOf(letter)>0) System.out.println(letter + " este o vocala");
        else System.out.println(letter+ " este o consoana");





    }


}
