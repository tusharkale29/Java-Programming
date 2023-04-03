class Cylinder extends Shape
{
     Cylinder(double r, double h)
     {
          super(r, h);
     }
     double calcArea()
     {
          return 2*3.14*r*(h+r);
     }
     double calcVolume()
     {
          return 3.14*r*r*h;
     }
