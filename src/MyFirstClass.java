public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.print("Salutare");
        int y;
        String nume;
        y=5;
        nume="jon";
        System.out.println(y);
        System.out.println(nume);
        System.out.println("hello "+nume);
        int x=10;
        System.out.println(x);

        System.out.println("Exercitiu 1 ");
        //Declarați câte o variabilă de tip int pentru a stoca ziua și luna nașterii voastre;
        //Afișați suma dintre cele două folosind System.out.println();
        // Suma dintre două numere se realizează folosind operatorul “+”
        int a=12;
        int b=31;
        System.out.println(a+b);

        System.out.println("Exercitiu 2");
        //Declarați o variabilă de tip String care să conțină numele vostru și afișați valoarea ei;
        //Afișați textul urmator: “nume invata Java”, unde nume corespunde variabilei declarata anterior
        String num= "catalina";
        System.out.println(num+" invata Java");

        System.out.println("Exercitiu 3");
        //Declarați o variabilă de tip int și una de tip String și afișați cele două variabile împreună în aceeași funcție print;
        // Pentru a concatena (uni) doua variabile, folositi “+”.
        int numar= 7;
        String textul = " today";
        System.out.println(numar + textul);

        System.out.println("exercitii suplimentare");
        int w=66;
        int z=99;
        System.out.println(a+b+w+z);

        System.out.println("Exercitii Optionale-Afisare in Java");
        /*Declarati o variabila de tip String, cu numele limbaj si valoarea “Phyton”.
        Declarati o noua variabila de acelasi tip cu numele text1 si valoarea “este usor sa inveti ”
        Afisati impreuna cele doua variabile in ordinea: text+limbaj si observati ce rezulta.
        Exercitiu 2:Daca atribuim variabilei limbaj
        declarata anterior, o alta valoare, aceasta din urma o va suprascrie pe prima.
        Exercitiul 3:
        Atribuiti variabilei limbaj valoarea “orice limbaj de programare ”
        Afisati din nou text1+limbaj si vedeti ce rezulta.*/
        System.out.println("Ex optional 1,2,3");
        String limbaj="orice limbaj de programare ";
        String text1= "este usor sa inveti ";
        System.out.println(text1+limbaj);

        //Exercitiul 4:
        //Declarati o noua variabila cu numele text2 si valoarea “atata timp cat iti dai silinta ”
        //Afisati impreuna text1+limbaj+text2 si observati outputul.
        System.out.println("Ex optional 4");
        String text2= "atata timp cat iti dai silinta ";
        System.out.println(text1 +limbaj+text2);

        //ex 5: Acum afisati variabilele in ordine inversa text2+limbaj+text1 si observati outputul.
        System.out.println("Ex optional 5");
        System.out.println(text2+limbaj+text1);

        //Ex suplimentare
        int nr=2;
        String text=" un text";
        System.out.println(nr+text);
        System.out.println(text1+text);
        System.out.print(text2);


    }
}