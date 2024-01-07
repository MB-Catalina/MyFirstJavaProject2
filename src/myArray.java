public class myArray {
    public static void main(String[] args) {
        int[] myArray ={1,2,3,4};
                //valorile se declara intre acolade
        String []myStringArray= {"unu","doi","trei"};
        System.out.println(myArray[0]);
        //numerotarea incepe de la 0, trebuie sa mentionez care pozitie vreau sa fie afisata
        System.out.println(myStringArray[1]);
        //eroare daca vreau sa afisez o pozitie care nu exista-pozitia 3 este pozitia celui de a patrulea element

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);
        //sirurile pot fi parcurse (adica daca am mai multe valori sa afiseze de la valoare care vreau pana unde vreau
        //se foloseste functia for ptr a afisa toate elementele

        for (int i=0;i<myStringArray.length;i++){
            System.out.println(myStringArray[i]);
            //for: primeste conditia de start. de stop si pas- start e 1=0, stop i<4. pass -creste cu o unitate)
            //i=0, array[0] => "unu"
            //i=1, array[1] => "doi"
            //for parcurge un index;
        }

        for (String str:myStringArray) {      //ptr string-ptr fiecare element din Strng printeaza elementul
            System.out.println(str);

        }

        System.out.println("Ex 4 Automation 3");
        /*Declarați un șir (array) de tip double cu patru elemente și stocați cele patru valori.
         Afișați elementul de pe a doua poziție.
        Afișați elementul de pe ultima poziție.
        Afișați numărul de elemente din șir*/

        double[] exArray = {1.434, 2.565, 5.343, 8.636};
        System.out.println("elementul de pe pozitia 2 este "+ exArray[1]);
        System.out.println("elementul de pe pozitia 4 este "+ exArray[3]);
        for (int i=0; i<exArray.length; i++){
            System.out.println(exArray[i]);
        }
        int length = exArray.length;
        System.out.println("Lungimea sirului este " + length);

        System.out.println("Ex optional - Tipuri de date");
        /*  Ex 5 Declarati un array de elemente de tip char cu elementele: a, b, c, d.
         Afisati elementul de pe prima pozitie.
        Afisati elementul de pe a doua pozitie.
        Afisati elementul de pe ultima pozitie.
        Afisati toate elementele sirului folosind FOR.*/
        char[] exChar = {'a', 'b', 'c', 'd'};
        System.out.println(exChar[0]);
        System.out.println(exChar[1]);
        System.out.println(exChar[3]);
        for (int i=0; i<exChar.length;i++){
            System.out.print(exChar[i]);
        }
    }
}
