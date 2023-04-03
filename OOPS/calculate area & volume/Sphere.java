class Sphere extends Shape
{
     Sphere(double r)
     {
          super(r, 0);
     }
     double calcArea()
     {
          return 4*3.14*r*r;
     }
     double calcVolume()
     {
          return 4*3.14*Math.pow(r,3)/3;
     }
}