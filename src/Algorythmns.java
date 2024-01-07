public class Algorythmns {
    public static void main(String[] args) {
        //ex 1. Declarați un șir de numere întregi (ex. 1, -25, 34, -2, 67, 5)
        int numere[] = {1, -25, 34, -2, 67, 5};

        //Ex2. Scrieți un program care să afișeze doar vecinii numerelor din șir (ex. în loc de 1
        //afișați 0 și 2; în loc de -25 afișați -26 și -24; etc)

        for (int i = 0; i < numere.length; i++) {
            int inainte = numere[i] - 1;
            int dupa = numere[i] + 1;
            System.out.print(inainte + " " + dupa);
        }
        System.out.println();

        //Ex 3. Scrieți un program care să afișeze numerele negative din șir
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] < 0) {
                System.out.println(numere[i]);
            }
        }
        System.out.println("\n)");

        //Ex 4. Declarați un șir de țări cu 8 elemente (ex. Anglia, România, Albania, Franța,Elveția, China, SUA, Australia)
        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Afganistan", "Elvetia", "China"};

        //Ex 5. Scrieți un program care să afișeze inițiala fiecărei țări
        for (String t : tari) {
            System.out.println("Initiala tarii " + t +  " este " + t.charAt(0));

        }
        // Ex 6. Scrieți un program care să afișeze numai țările care încep cu litera “A”

        for (String t: tari){
            if(t.charAt(0)=='A') {
                System.out.println("TARA cu A este: " + t);
            }
        }


        //Ex care sa afiseze doar tarirle care contin litera n
        for (String t : tari) {
            if (t.contains("n")) {
                System.out.println("Tara care contine litera n este: " + t + " ");
            }
        }

        //String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Afganistan", "Elvetia", "China"};
        //ex: un program care sa afisee tara cu cel mai lung nume
        int max = tari[0].length();
        String taraCuLungimeMaxima = tari[0];
        for (int i = 0; i < tari.length; i++) {
            if (tari[i].length() >= max) {
                max = tari[i].length();
                taraCuLungimeMaxima = tari[i];
            }
        }
        System.out.println(max);
        System.out.println("Tara cu cel mai lung nume este: " + taraCuLungimeMaxima);

        //Scrieți un program care să afișeze țara cu cel mai scurt nume
        int min = tari[0].length();
        String taraCuCelmaiScurtNume = tari[0];
        for (int i=0; i< tari.length; i++) {
            if(tari[i].length() <= min){
                min =tari[i].length();
                taraCuCelmaiScurtNume = tari[i];
            }
        }
        System.out.println("Tara cu cel mai scurt nume este: " + taraCuCelmaiScurtNume);

        //Ex 7. Scrieți un program care să afișeze numărul de litere pentru fiecare țara
        for (int i=0; i<tari.length; i++){
            System.out.println(tari[i] + " are urmatorul numar de litere: "+ tari[i].length());
        }


        int nr[] = {4, 8, -5, 89};
        int minim = numere[0];
        System.out.println("5+5");
        int a = 5;
        int b = 10;
        int c = 8;
        boolean abc = a > b || c > b || c > a;
        System.out.println(abc);
        System.out.println(25 % 5);
        boolean bool1 = true;
        boolean bool2 = !bool1;
        boolean bool3 = bool1 && bool2;
        System.out.println(!bool3);
        if (false) {
            System.out.print("a");
        } else if (true) {
            System.out.print("b");
        } else {
            System.out.print("c");
        }
        ;
        boolean suntemCuminti = true;
        boolean vineMosul;
        if (!suntemCuminti) {
            vineMosul = false;
        } else vineMosul = true;
        System.out.print(vineMosul);


    }
}
