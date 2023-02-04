
package practise1.task4;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r, area;
        System.out.println("Enter radius of circle:");
        r = input.nextDouble();
        area = Math.PI*r*r;
        System.out.println("Area of circle:"+String.format("%.2f", area));
    }
    
}
