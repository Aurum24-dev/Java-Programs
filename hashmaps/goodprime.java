/*A prime number is a number which is divisible by one and itself. 
Also a number is called a good  prime number if the sum of its digits is a prime number. 
For example a number 23 is a good prime number because the sum of 2 and 3 ( 2+3=5) is 5 which is a prime number. 
You are given an integer K. Your task is to find the kth good prime number that is greater than a provided number N. */ 


//import java.util.Scanner;

public class goodprime {

    static boolean isPrime(int num)
    {
        int i;
        boolean f=true;
       if(num==0 || num==1)
        f=false;
       else
       {
         for(i=2;i<num;i++)
          {
            if(num% i==0)
             {
                f=false;
             }
          }
       }
       return f;
    }

    static int find(int n, int k)
    {
        int c=0,sum=0,d,i;
        int j=n+1;
        while( j>0 )
        {
            i=j;
            while(i!=0)
            { 
                d=i%10;
                sum=sum+d;
                i=i/10;        
            }
            if(isPrime(sum))
            {
               c++;
               if(c==k)
                break;
            }
             
            j++;
            sum=0;
        }      

        
        return j;
    }

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=4;
        int k=4;
        int result=find(n,k);
        System.out.println(result);
    }
    
}
