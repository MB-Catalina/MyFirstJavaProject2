import java.sql.SQLOutput;
import java.util.Locale;

public class myString {
    public static void main(String[] args) {
        String myString = "This is a text";//intodeauna stringul se scrie intre paranteze
        System.out.println(myString);
        int lungime=myString.length();
        System.out.println(lungime);
        //pt ghilimele pui \" ceva intre si la final\"
        System.out.println("lungimea \"textului\" este " +lungime);
        String nume="Manzat-Bontas Catalina";
        int num=nume.length();
        System.out.println(num);
        System.out.println("lungimea numelui meu este "+ num);

        //ex suplimentar afisare lungimea numelui fara spatii
        String myNameWithoutSpace=nume.replace( " ", "");
        //cu functia replace am inlouit pauza cu fara pauze pt a afisa lungimea numeelui fara spatii
        int lungimeanumeluifaraspatii= myNameWithoutSpace.length();
        System.out.println("lungimea numelui meu fara spatii este " + lungimeanumeluifaraspatii);

        char aPatraLitera=nume.charAt(3);
        char primaLitera=nume.charAt(0); //numerotarea se incepe de la 0
        System.out.println("A patra litera din numele meu este "+ aPatraLitera);
        System.out.println("Prima litera din numele meu este " + primaLitera);

        System.out.println("Ex 3");
        /*3. Strings – în clasa MyString
        Declarați o variabilă de tip String care să conțină un nume de tara.
                Declarați o variabilă de tip int care să stocheze lungimea Stringului.
        Afișați valoarea celei de-a doua variabile.*/
        String tara= "Italia";
        int lungimeanumeluitarii=tara.length();
        System.out.println("Lungimea numelui tarii este " +lungimeanumeluitarii);

        System.out.println("Tema optionala Tipuri de date - Ex 2");
        /*
        Declarati o variabila de tip String cu numele myFavouriteMovie si valoarea egala cu
        numele filmului vostru preferat.
        Afisati urmatorul text in consola:
        "My favourite movie is “Great Expectations”"
        Unde numele filmului vostru preferat sa apara in loc de “Great Expectations”.
        Afisati inclusiv ghilimelele.
         */
        String myFavouriteMovie ="Film favorit";
        System.out.println("My favourite movie is "+ myFavouriteMovie);

        String myfav = "film prefereat";
        System.out.println("filmul meu preferat este \"" + myfav + "\"");

        System.out.println("Ex optional 3");
        //Ex 3. apelati metodele toUpperCase() si toLowerCase() cu variabila de la exercitiul 2.
        String myFavouriteMovieUpperCase= myFavouriteMovie.toUpperCase();
        System.out.println(myFavouriteMovieUpperCase);
        String myFavouriteMovieLowercase = myFavouriteMovie.toLowerCase();
        System.out.println(myFavouriteMovieLowercase);
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());

        System.out.println(" Ex optional 4");
        //Exercitiul 4 – in clasa MyString
        //Afisati lungimea stringului (adica numarul de caractere) pentru myFavouriteMovie;
        int lenghtMovie = myFavouriteMovie.length();
        System.out.println("Lungimea numelui filmului meu favorit este " + lenghtMovie);

        //ex suplimentar afisare lungimea numelui fara spatiu
        String myFavouriteMoviefaraspatii = myFavouriteMovie.replace(" ", "");
        int lungimeaFilmuluiFaraSpatii = myFavouriteMoviefaraspatii.length();
        System.out.println("Lungimea numelui filmului favorit, dar fara spatiu este "+ lungimeaFilmuluiFaraSpatii );


    }
}
