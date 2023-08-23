package lecture2;

public class pattern3 {
    public static void main(String[] args) {
        //pattern 3 --> triangle
        int i=1;
        int n=5;
        while(i<=n){
            int j=n+1-i;
            while(j>0){
                System.out.print("* ");
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
