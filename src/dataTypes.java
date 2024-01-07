public class dataTypes {
    public static void main(String[] args) {
        boolean myBoolean= true;
        System.out.println(myBoolean);
        char myChar='a';
        System.out.println(myChar);
        byte myByte= 0;
        System.out.println(myByte);
        short myShort = -55;
        System.out.println(myShort);
        //short myshort=3726537; prea mare
        //System.out.println(myshort);
        int myInt=9/2;
        System.out.println(myInt);
        long myLong= 283452538;
        System.out.println(myLong);
        float myFloat=5.5f+6.4f;
        System.out.println(myFloat);
        double myDouble=5.4842;
        System.out.println(myDouble);
        int x=5;
        double y=7.5;
        System.out.println(x+y);
        double sum=x+y;//nu merge int-nu
        double a=x;
        System.out.println(a);
        double z=5.5;
        //int w=z; de la mare la mic nu se poate trece direct, numai prin casting
        //casting-ul este trecerea de la un tip de date la alt tip de date
        //de la mic la mare ok
        //de la mare la mic doar explcit se poate  cum ar fi intw=(int)z
        //System.out.println(w);
        int w=(int) z;
        System.out.println(w);
        //double mai mare decat int, de la mare la mic se precizeaza casting intre paranteze


        System.out.println("exercitiu1");
        int mynum= 9;
        float myfloat=8.99f;
        char myLetter= 'A';
        boolean myBool= false;
        String mytext="hello world";
        String myothertext= "1a2b3c";

        System.out.println("Ex 2");
        /*Casting – în clasa DataTypes
        Declarați o variabilă de tip byte și atribuiți-i o valoare
        Declarați o nouă variabilă de tip int și dați-i valoarea primei variabile folosind casting.
        Afișați valoare celei de-a doua variabile folosind metoda print().*/
        byte d=-120; //byte tre sa fie nt intre -128 si 127
        int e= d;
        System.out.println("Valoarea celei de-a doua variabile este " + e);

        System.out.println("Ex 2");
        /*Declarați o variabilă de tip float și atribuiți-i o valoare.
        Declarați o nouă variabilă de tip int și atribuiți-i valoarea primei variabile folosind casting.
        Afișați valoare celei de-a doua variabile folosind metoda print()*/
        float nr= 1.55f;
        int h= (int) nr;
        System.out.println("Valoarea celei de a doua variabile este " +h);

        /*Casting = trecerea de la un tip de date la alt tip de date
        Casting implicit/widening (de la mic la mare):byte -> short -> char -> int -> long -> float -> double
        Casting explicit/narrowing (de la mare la mic):double -> float -> long -> int -> char -> short -> byte
        Ex. double y = 5; int x = (int) y;
         */


        System.out.println("tema optionala Tipuri de date - Ex 1 ");
        /*Declarati doua variabile de tip float cu valori la alegere.
         afisati suma lor.
         Afisati diferenta dintre ele.
         Afisati produsul dintre ele (produsul a doua numere se realizeaza cu ajutorul operatorului
         “*”).*/
        float m= 1.22f;
        float n=1.66f;
        System.out.println("Suma numerelor este " + (m+n));
        System.out.println("Diferenta numerelor este " + (m-n));
        System.out.println("Produsul numerelor este " + (m*n));


    }
}
