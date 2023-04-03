class Overload_Demo implements IterF1
{
     public void add()
     {
          System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
     }
     public void sub()
     {
          System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
     }
     public static void main(String[] args)
     {
          Overload_Demo obj = new Overload_Demo();
          obj.add();
          obj.sub();
     }
}