public class exceptions {
    public static void main(String[] args) {
        int numbers [] = {2,6,9,18};
        try{
            System.out.println(numbers[4]);
        }
        catch (Exception e){
            System.out.println("a aparut o eroare");
        }
    }
}
