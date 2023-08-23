package lecture2;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int i=1;

        while(i<=n){
            int j=i;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            int k=1;
            while(k<=i){
                System.out.print("  ");
                k++;
            }
            i++;
        }
    }
}
