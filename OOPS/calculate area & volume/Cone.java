class Cone extends Shape
{
     Cone(double r, double h)
     {
          super(r, h);
     }
     double calcArea()
     {
          return 3.14*r*(r+Math.sqrt(r*r+h*h));
     }
     double calcVolume()
     {
          return 3.14*r*r*h/3;
     }
}