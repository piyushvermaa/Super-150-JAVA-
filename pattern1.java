package lecture2;

public class pattern1 {
    public static void main(String[] args) {
        // pattern 1 - 5*5 box
        int i=1;
        int n=5;
        while(i<=5){
            int j=1;
            while(j<=5){
            System.out.print("* ");
            j++;
            }
            System.out.println();
            i++;
        }
    }
}
