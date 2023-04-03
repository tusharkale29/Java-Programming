abstract class Shape
{
     double r, h;
     Shape(double r, double h)
     {
          this.r = r;
          this.h = h;
     }
     abstract double calcArea();
     abstract double calcVolume();
}