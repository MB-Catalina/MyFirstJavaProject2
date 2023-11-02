import java.util.Enumeration;

public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("Cristina");
        helloName("6");
        getSum(2, 3);
        getProduct(2,3);
        getSum(33,44,55);
        getSum(2.2, 3.3);
        helloNameAge("Catalina", 20);
        printFriends("catalina", "ana");
    }
    private static void printHello(){
        System.out.println("Hello world");
    }
    //numele metodei se scrie cu litera mica
    //scri codul si se poare refolosi, daca este ceva reptitiv se poate scrie in metoda si se apeleaza.
    //parametrii sunt intre paranteze
    //se poate scrie o metoda care sa primeasca un parametru pe care sa il foloseasca
    //nu se poate apela fara paramentru
    private static void weLearn(){
        System.out.println("we learn java methods");
    }
    private static void helloName (String name){
        System.out.println("Hello " + name);
    }
    private static  void getSum(int x, int y){
        System.out.println(x+y);
    }
    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    private static void getSum(double x, double y){
        System.out.println(x+y);
    }
    private static void getProduct (int a, int b){
        System.out.println(a*b);
    }
    private static void helloNameAge(String name, int age){
        System.out.println(name+ " is "+ age + " years old ");
    }
    private static void printFriends(String name1, String name2){
        System.out.println(name1 + " and " +name2 + " are friends");
    }

}
