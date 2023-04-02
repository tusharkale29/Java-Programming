public class TestVehicle
{    
        public static void main(String args[])
        {    
                Vehical bike = new Bike();
                Vehical car = new Car();
                int bikespeed = bike.getSpeed();    
                int carspeed = car.getSpeed();
                System.out.println("Speed of Bike is: "+bikespeed+" Km/h");
                System.out.println("Speed of Car is: "+carspeed+" Km/h");
    }
}