import java.util.*;
class Parameterized
{
int id;  
String name;  

Parameterized (int i,String n)
{  
    id = i;  
    name = n;  
}  

void display()
{
    System.out.println(id+"  "+name);
}  

public static void main(String args[])
{  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. and name");
  
    Parameterized p = new Parameterized(sc.nextInt(),sc.nextLine());  

p.display();  

}  














}