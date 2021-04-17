/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg1;

import java.util.Scanner;

/**
 *
 * @author uzmar
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d,e,tot;
float per;

Scanner input = new Scanner(System.in);
System.out.println("Enter marks of art:");
a = input.nextInt();
System.out.println("Enter marks of sports:");
b = input.nextInt();
System.out.println("Enter marks of maths:");
c = input.nextInt();
System.out.println("Enter marks of reading:");
d = input.nextInt();
System.out.println("Enter marks of writing:");
e = input.nextInt();

tot = a + b + c;
per = tot/3;

System.out.println("Percentage = "+per);

if(per>90)
System.out.println("Grade : A");
else
{
if(per>70)
System.out.println("Grade : B");
else
{
if(per>50)
System.out.println("Grade : C");
else
System.out.println("Grade : D");
}
}
}
}
    


