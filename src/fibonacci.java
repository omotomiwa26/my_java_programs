/*Write a program to find Fibonacci series of a given no.
 Example :
 Input - 8 
Output - 1 1 2 3 5 8 13 21 */ 


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fibonacci
{
    public static void main(String args[]) 
    {
        String str;
        int no,f1,f2,f3;
        f2=0;
        f3=1;

        try{
             System.out.print("Enter number to generate it's  Fibonacci Series : ");
             System.out.flush();
             BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
             str=obj.readLine();
             no=Integer.parseInt(str);

             System.out.print(f3+"  ");
             System.out.flush();
                  while(no>1)
                  {
                          f1=f2;
                          f2=f3;
                          f3=f1+f2;
                          System.out.print(f3+"  ");
                          System.out.flush();
                          no=no-1;
                 }
             }
        catch(Exception e)
        {}
    }
}

