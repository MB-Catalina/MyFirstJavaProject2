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






    }

}