package lecture1;

public class hellojava {
    public static void main(String[] args) {
        
        //    int a = 9;
        //    int b = 7;
    //    int c = a+b;
    //    System.out.println(c);
    //    c=a-b;
    //    System.out.println(c);
    //    System.out.println(a++); //a=a+1
    //    System.out.println(a);
    //    System.out.println(b--);
    //    System.out.println(b);
    
    // int a=9;
        // int x=a++ + 8 + a-- - --a + --a + ++a;
        // System.out.println(x);

    //even-odd
    // int n=89;
    // if (n%2==0) {
        //     System.out.println("even");
    // } else {
    //     System.out.println("odd");
    // }

//max of 2

    // int n1=10;
    // int n2=20;

    // if (n1>n2) {
    //     System.out.println(n1 + " is greater than " + n2);
    // } else {
        //     System.out.println(n2 + " is greater than " + n1);        
        // }

//max of 3
        // int a=10,b=20,c=30;
        // if (a>=b && a>=c){
            //     System.out.println("the grestest among them is "+a);
            // }
            // else if(b>=a && b>=c){
                //     System.out.println("the greatest among them is "+b);
        // }
        // else{
        //     System.out.println("the greatest among them is "+c);
        // }
        
//Grade system
            // int marks=67;
            // if(marks>=75){
            //     System.out.println("A");
            // }
            // else if(marks>=65){
                //     System.out.println("B");
            // }
            // else if(marks>=55){
            //     System.out.println("C");
            // }
            // else if(marks>=45){
                //     System.out.println("Pass");
            // }
            // else{
            //     System.out.println("Fail");
            // }

            //loops

            // int n=5;
            // int i=1;
            // while(i<=n){
            //     System.out.println(i);
            //     i++;
            // }

//sum of n number

            // int n=5;
            // int i=1;
            // int sum=0;
            // while(i<=n){
                //     sum+=i++;
                // }
            // System.out.println(sum);
            
//sum of digit;
                // int n=2348;
                // int ans=0;
                // while(n!=0){
                //     ans+=n%10;
                //     n/=10;
                // }
                // System.out.println(ans);
//reverse a no.
                int n=2348;
                int ans=0;
                while(n!=0){
                    int rem=n%10;
                    ans = ans*10+rem;
                    n/=10;
                }
                System.out.println(ans);
}


}