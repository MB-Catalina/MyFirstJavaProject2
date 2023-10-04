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
        System.out.println("lungimea numelui meu este");
        System.out.println(num);
        String myNameWithoutSpace=nume.replace( " ", "");//aici am pus pauza
        int lungimeanumeluifaraspatii= myNameWithoutSpace.length();
        System.out.println("lungimea numelui meu fara spatii este " + lungimeanumeluifaraspatii);
        char aPatraLitera=nume.charAt(4);
        char primaLitera=nume.charAt(0); //numerotarea se incepe de la 0
        System.out.println(aPatraLitera);
        System.out.println(primaLitera);
        String extrei= "Italia";
        int exercitiutrei=extrei.length();
        System.out.println(exercitiutrei);
        String myFavouriteMovie ="\"In time\"";

        System.out.println("My favourite movie is "+ myFavouriteMovie);
        String myFavouriteMovieUpperCase= myFavouriteMovie.toUpperCase();
        System.out.println(myFavouriteMovieUpperCase);
        String myFavouriteMovieLowercase = myFavouriteMovie.toLowerCase();
        System.out.println(myFavouriteMovieLowercase);
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());



    }
}
