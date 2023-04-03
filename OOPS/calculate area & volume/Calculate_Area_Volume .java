import java.io.*;
class Calculate_Area_Volume
{
     public static void main(String[] args) throws Exception
     {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Shape shape = null;
          double r = 0;
          double h = 0;
          int ch;
          do
          {
               System.out.print("\n1.Sphere"+"\n2.Cone"+"\n3.Cylinder"+ "\n4.Exit "+"\nEnter your choice : ");
               ch = Integer.parseInt(br.readLine());
               switch (ch)
               {
                    case 1:
                         System.out.print("Enter radius of sphere:");
                         r = Double.parseDouble(br.readLine());
                         shape = new Sphere(r);
                         break;
                    case 2:
                         System.out.print("Enter radius of Cone:");
                         r = Double.parseDouble(br.readLine());
                         System.out.print("Enter height of cone:");
                         h = Double.parseDouble(br.readLine());
                         shape = new Cone(r,h);
                         break;
                    case 3:
                         System.out.print("Enter radius of cylinder:");
                         r = Double.parseDouble(br.readLine());
                         System.out.print("Enter height of cylinder:");
                         h = Double.parseDouble(br.readLine());
                         shape = new Cylinder(r,h);
                         break;
                    case 4:
                         System.exit(0);
               }
               System.out.println("Area = "+shape.calcArea()+"\nVolume = "+shape.calcVolume());
          }
          while (ch!=4);
     }
}