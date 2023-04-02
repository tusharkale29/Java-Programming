class Child1
{  
   void display()
   {
       System.out.println("class X display method ");
   }  
}  
class Child2
{  
   void display()
   {
       System.out.println("class Y display method ");
   }  
}  
public class Parent extends Child1, Child2
{
    public static void main(String args[])
    {  
        Parent obj=new Parent();  
        obj.display();  
   }  
}