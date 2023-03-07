
package aff;

import java.util.Scanner;

public class Aff {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter A Number : ");
        System.out.println("\n 1. For  Area of Circle "
                + "\n 2. For  Peremiter of a Circle \n 3. For  Area of Trapezium \n"
                + " 4. For  Peremiter of Trapezium \n 4. For  Area of a Square \n 5. For  Peremiter of a Square");
        
        double a,b,area, x,y,square;
        int shapes;
        shapes = input.nextInt();
         
         switch (shapes){
             case 1:
                 
                 System.out.println("Enter a Value For Your Radius");
                 a = input.nextDouble();
                 b = 3.142;
                 area = (a * a) * b;
                 
                 System.out.println("The area of a Circle = " + area);
                 
                 break;
                 
             case 2:
                 System.out.println("Enter a Value For Your Radius");
                 double  t,v,m;
                 t = input.nextDouble();
      
                 v = 3.142;
                 m = 2 * 3.142 * t;
                 System.out.println("Peri = " + m);
                 break;
            
             case 3:
                 System.out.println("Enter a Value For Your a");
                 double fn,sn,dd,rr;
                 fn = input.nextDouble();
                 
                 System.out.println("Enter a Values For Your b");
                 sn = input.nextDouble();
                 
                 System.out.println("Enter a Values For Your b");
                 dd = input.nextDouble();
                 
                 rr = 1/2 * (fn + sn ) * dd;
                 
                 System.out.println("The Area Of peremiter = " + rr);
                 
                 
             
             case 4
                     :
                 System.out.println("Enter a Value For Your Lenght");
                  x = input.nextDouble();
                  
                  System.out.println("Enter a Value For Your breath");
                  y = input.nextDouble();
                  
                  square = x * y;
                  
                  System.out.println("The Area of a Square = " + square);
             case 5
                     :
                 System.out.println("Enter length");
                 x = input.nextDouble();
                         square = 4 * x;
                  System.out.println("The perimeter of the square is" + square);
                  
                  break;
             default:
                 System.out.println("The number you Enter is Invalid");
              
               
                 
         }
        
    }
    
}
