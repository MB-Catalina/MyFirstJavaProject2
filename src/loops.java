import java.io.PrintStream;
import java.util.stream.IntStream;

public class loops {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--){
            System.out.println(i);
        }
       // IntStream.iterate(0, i -> i >= 1 -, i -> i + 2).forEach(System.out::println);

        for (int i = 10; i <=10; i+=2){
            System.out.println(i);
        }

        //for each
        String cars[] = {"bmw", "mazda", "opel", "toyota"};
        for (String car: cars){
            System.out.println(car);
        }

        //do while
        int i=0;
        do{
            System.out.println(i);
            i++;

        } while (i<5);

        //break
        for (int k=0; k<10; k++){
            System.out.println(k);
            if(k==4){break;}; // break intrerupe iar continuie sare peste iteratia respactiva dar continua cu restul
        }
        System.out.println("exercitiu");
        int k= 0;
        while (k<10) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
            k++;
        }
        System.out.println("continue");
        int m=0;
            while (m<10){
                m++;
                if (m==4) continue;
                System.out.println(m);
            }


    }
}

