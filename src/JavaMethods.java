public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("Cristina");
        helloName("6");
        getSum(2, 3);
        getProduct(2, 3);
        getSum(33, 44, 55);
        getSum(2.2, 3.3);
        helloNameAge("Catalina", 20);
        printFriends("catalina", "ana");

        System.out.println(getSumWithReturn(6,7));
        System.out.println(getProductReturn(2,4));
        System.out.println(areMere("Ana"));
        System.out.println(areMere("Catalina"));
        System.out.println(metodaEx8Optionale(273));
        printHello();
        System.out.println(metodaInversul(-8));
        System.out.println(metodaInversul(7));
        System.out.println(metodaMaximul(44,888));
        System.out.println(mediaAritmetica(34.2,4.5,5.2));
        System.out.println(lungimeaTextului("Metoda care sa afiseze lungimea unui text"));
        System.out.println(metodaConcatenarea("Catalina", " invata Java"));
        System.out.println(inversulStringului("Catalina"));
        ninge();
        System.out.println(numarParSauImpar(4));
        System.out.println(numarParSauImpar(7));
        System.out.println(lunasiAnotimpul("ianuarie"));
        System.out.println(lunasiAnotimpul("mai"));
        System.out.println(lunasiAnotimpul("iunie"));
        System.out.println(lunasiAnotimpul("septembrie"));
        System.out.println(numarulMaxim(2,2));
        System.out.println(maximuldintre4numere(22,55,564,765));
        System.out.println(literaMijloc("mancare"));
        System.out.println(literaMijloc("floare"));
        System.out.println(numarulCaractere("Buna seara"));
        System.out.println(sumaCifrelor(651));

    }

    private static void printHello() {
        System.out.println("Hello world");
    }

    //numele metodei se scrie cu litera mica
    //scri codul si se poare refolosi, daca este ceva reptitiv se poate scrie in metoda si se apeleaza.
    //parametrii sunt intre paranteze
    //se poate scrie o metoda care sa primeasca un parametru pe care sa il foloseasca
    //nu se poate apela fara paramentru
    private static void weLearn() {
        System.out.println("we learn java methods");
    }

    private static void helloName(String name) {
        System.out.println("Hello " + name);
    }

    private static void getSum(int x, int y) {
        System.out.println(x + y);
    }

    private static void getSum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    private static void getSum(double x, double y) {
        System.out.println(x + y);
    }

    private static void getProduct(int a, int b) {
        System.out.println(a * b);
    }

    private static void helloNameAge(String name, int age) {
        System.out.println(name + " is " + age + " years old ");
    }

    private static void printFriends(String name1, String name2) {
        System.out.println(name1 + " and " + name2 + " are friends");
    }

    private static int getSumWithReturn(int x, int y) {
        //nt sum =x+y;
        int i = x + y;
        return x + y;
    }

    private static int getProductReturn (int x, int y){
        int i=x*y;
        return x*y;
    }
    private static String areMere(String nume) {
        return (nume + " are mere");
    }

    public static int metodaEx8Optionale(int numar){
    int sum =0;
    while (numar>0) {
        sum = sum + numar % 10;
        numar = numar/10;
    }
       return sum;
    }

    //ex 1.Scrieti o metoda care primeste un numar intreg si returneaza inversul lui
    //exemplu: Inversul lui “4” e “-4”, inversul lui “-35” e “35”)
    private static int metodaInversul(int numar) {
        int i = 0 - numar;
        return i;
    }

    //Ex2 Scrieti o metoda care primeste doua numere intregi si returneaza maximul dintre ele
    private static int metodaMaximul( int x, int y) {
        return Math.max(x,y);
    }

    //ex 3. Scrieți o metoda care primeste 3 numere intregi si returneaza media lor aritmetica (cu tot cu virgula)
    private static double mediaAritmetica (double x, double y, double z){
        return ((x+y+z)/3);
    }

    //ex 4. Scrieti o metoda care primeste un String si returneaza lungimea lui
    private static int lungimeaTextului (String text) {
        return text.length();
    }

    //ex 5. Scrieti o metoda care primeste doua Stringuri si le concateneaza
    private static String metodaConcatenarea (String text1, String text2){
        return text1.concat(text2);
    }

    //ex.6 Optional Scrieti o metoda care primeste un String si returneaza inversul lui (Ex: abcd”->”dcba”)
    private static String inversulStringului (String text){
        String reverse =  new StringBuffer(text).reverse().toString();
        return reverse;
    }

    /*Tema Optionala
    Exercitiul 1:
    Scrieti o metoda care nu primeste nimic si afiseaza textul “In sfarsit ninge!”.
    Apelati metoda in main().*/
    private static void  ninge() {
        System.out.println("In sfarsit ninge");
    }

    // Ex 2. Scrieti o metoda care primeste un numar si returneaza un rezultat de tip boolean.
    // Daca numarul e par returneaza true, altfel returneaza false.
    //Afisati rezultatul returnat de metoda in main().
    private static boolean numarParSauImpar (int x){
        return x % 2 == 0; //restul impartirii la 2 sa fie 0
    }

    /* Scrieti o metoda care primeste o luna calendaristica si returneaza anotimpul din care face parte.
    Pentru martie, aprilie, mai -> primavara
    Pentru iunie, iulie, august -> vara
    Pentru septembrie, octombrie, noiembie -> toamna
    Pentru decembrie, ianuarie, februarie -> iarna
    Pentru orice altceva inafara de luna calendaristica -> unknown
    Testati metoda in main cu date de test din toate clasele de echivalenta*/
    private static String lunasiAnotimpul (String luna){
        switch (luna){
            case "ianuarie","februarie","decembrie" : return "iarna";
            case "martie", "aprilie", "mai": return "primavara";
            case "iunie", "iulie", "august": return "vara";
            case "septembrie","octombrie","noiembrie": return "toamna";
            default:
                return "Unknown";
        }
    }

    //Exercitiul 4:
    //Scrieti o metoda care primeste doua numere si il returneaza pe cel mai mare din ele. In cazul
    //in care sunt egale, returnati oricare din ele.
    private static int numarulMaxim (int x, int y){
        return Math.max(x,y);
    }

    //Exercitiul 5:
    //Scrieti o metoda care primeste 4 numere si il returneaza pe cel mai mare din ele.
    // In cazul in care doua sau mai multe sunt eglale, returnati oricare din ele.
    private static int maximuldintre4numere (int x, int y, int z, int w){
        int nrMaxim = Math.max(Math.max(x,y),Math.max(z,w));
        return nrMaxim;
    }

    /*Exercitiul 6:
    Scrieti o metoda care primeste un cuvant si returneaza caracterul/caracterele din mijloc.
    Daca are numar impar de litere, returnati litera din mijloc (casca -> s).
    Daca are numar par de litere, returnati cele doua litere din mijloc (castel -> st).*/

    private static String literaMijloc (String cuvant){
        int wordSize= cuvant.length();
        if (wordSize % 2==0 ){
            String substring = cuvant.substring(wordSize / 2-1, wordSize / 2+1);
            return substring;
        }
        else {
            return String.valueOf(cuvant.charAt(wordSize/2));
        }
    }

    //Exercitiul 7:
    //Scrieti o metoda care primeste un String si returneaza numarul de caractere din Stringul respectiv.

    private static int numarulCaractere (String text){
        return text.length();
    }

    //Exercitiul 8:
    //Scrieti o metoda care primeste un numar si returneaza suma cifrelor lui.

    private static int sumaCifrelor(int nr) {

        int sum = 0;
        while (nr > 0) {
            sum = sum + nr % 10;
            nr = nr / 10;
        }
        return sum;
    }



}

