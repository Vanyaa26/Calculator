package Calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int button = sc.nextInt();

      //     switch(button) {
      //         case 1: System.out.println(a+b);
      //         break;
      //         case 2: System.out.println(a-b);
      //         break;
      //         case 3:System.out.println(a*b);
      //         break;
      //         case 4:System.out.println(a/b);
      //         break;
      //         case 5:System.out.println(a%b);
      //         break;
               
      // }
      if (button==1) {
               System.out.println(a+b);
      } else if (button==2) {
               System.out.println(a-b);

      }else if (button==3) {
               System.out.println(a*b);

      }else if (button ==4) {
               System.out.println(a/b);
      }
        }
       
   }
    
}
