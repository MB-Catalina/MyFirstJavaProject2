public class Operators {
    public static void main(String[] args) {
        int nr1 = 100;
        int nr2 = 50;
        System.out.println(nr1 + nr2);
        System.out.println(nr1 - nr2);
        System.out.println(nr1 / nr2);
        System.out.println(nr1 * nr2);
        System.out.println(nr1 % nr2);
        System.out.println(9 / 2); //catul
        System.out.println(9 % 2);  //restul impartirii
        System.out.println(10 % 7);
        System.out.println(++nr1);
        System.out.println(nr1++);
        System.out.println(--nr2);
        int nr3 = nr2;
        System.out.println(nr3);
        int nr5 = 1;
        System.out.println(nr3);

        nr2+=4;
        System.out.println(nr2);
        nr2-=3;
        System.out.println(nr2);
        nr2*=2;
        System.out.println(nr2);
        System.out.println(nr1<nr2); // 100<6
        System.out.println(10>5);
        System.out.println('A'=='A');
        System.out.println('a'!= 'a');
        System.out.println('a'<'b');
        System.out.println(true);
        System.out.println(!true);
        System.out.println(nr1);
        System.out.println(nr2);
        boolean condition = nr1>nr2 && !(nr1<100);
        System.out.println(condition);
        boolean condition2 = nr1>nr2 || nr1<100;
        System.out.println(condition2);
        if(!condition) {
            System.out.println("contitia este adevarata");
        }
        else System.out.println("conditia nu este adevarata");
        System.out.println("Exectitii-clasa Operators");
        System.out.println("Ex1");
        // Inmulţiţi 10 cu 6. Afişati rezultatul cu funcţia println.
        int a= 10*6;
        System.out.println(a);
        System.out.println("ex2");
        //Impărţiţi 10 la 5. Afisati rezultatul.
        int b =10/5;
        System.out.println(b);
        System.out.println("exercitii optionale operatori");
        // ex 1. Declarati patru variabile de tip int: var1, var2, var 3, var4 si initializati-le cu valori la alegere.
        //afisati suma lor, produsul lor si restul impartirii intre var 4 si var 2
        int var1 = 12, var2 =15, var3 = 18, var4 = 20;
        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4 % var2);
        //2.incrementati var1 cu o unitate de 3 ori.
        //Afisati var1 dupa cea de-a treia incrementare.
        for(int i=0;i<3;i++){
            var1++;
            var3++;
        }
        System.out.println(var1);
        System.out.println(var3);
        //3. Decrementati var2 cu doua unitati de 2 ori.
        //Afisati var2 dupa cea de-a doua decrementare.
        for (int j=0; j<2; j++){
            var2=var2-2;
        }
        System.out.println("raspunsul pentru ex. 3 este " + var2);

        /*
         * Exercitiul 4 – in Operators:
         * Declarati doua variabile de tip boolean cond1 si cond2
         * cond1 este adevarata daca suma celor 4 variabile de la Exercitiul 1 este mai mare decat 100.
         * cond2 este adevarata daca produsul celor 4 variabile de la Exercitiul 1 este mai mare decat
         * 1000.
         * Afisati cond1 si cond2
         */
         int suma= var1+var2+var3+var3;
         boolean cond1 = suma > 100;
        System.out.println(cond1);
        int produs= var1*var2*var3*var4;
        boolean cond2 = produs > 1000;
        System.out.println(cond2);

        /*
          Exerciriul 5 – in Operators
          Evaluati si afisati daca cel putin una din conditiile cond1 si cond2 este adevarata.
          Evaluati si afisati daca ambele condtiii cond1 si cond2 sunt adevarate.
         */
        boolean evaluare = cond1 || cond2; //cel putin una este adevarata
        System.out.println(evaluare);
        boolean evaluare2= cond1 && cond2; //daca ambele sunt adevarate
        System.out.println(evaluare2);


    }

}