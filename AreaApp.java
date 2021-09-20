import java.util.Scanner;
 public class AreaApp
 { 
public static void main(String args[]) 
{ 
System.out.println("select the shape of which area has to calculate"); 
System.out.println("1.Tringle");
 System.out.println("2. Circle"); 
Scanner sc=new Scanner(System.in); 
int ch=sc.nextInt(); 
if(ch==1)
{ 
System.out.println("Enter the base and heigth for the Tringle");
float b=sc.nextFloat(); 
float h=sc.nextFloat();
Tringle t=new Tringle(); 
t.area(b,h);
 } 
if(ch==2) 
{ System.out.println("Eneter the radius of the circle"); 
float r=sc.nextFloat(); Circle c=new Circle(); c.area(r);
} 
}
}
class Shapes
{
void area()
{
System.out.println("you may calculate area of various shapes by choosing shape");
}
}
class Tringle extends Shapes
{ 
float AoT;
 void area(float b, float h)
 { 
AoT = (float) (0.5 * b * h);
 System.out.println("Area of tringle is" + AoT);
 } 
} 
class Circle extends Shapes
{ 
float AoC; void area(float r)
 { AoC = (float) (3.14 * r * r); 
System.out.println("Area of Circle is"+AoC);
 } 
}