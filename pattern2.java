package lecture2;

public class pattern2 {
    public static void main(String[] args) {
        //pattern 2 --> triangle
        int i=1;
        int n=5;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
