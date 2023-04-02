class OverloadTest
{
    void sum (int a, int b)
    {
        System.out.println ("The sum of integer: "+(a+b));
    }
    void sum (double a, double b)
    {
        System.out.println ("The sum of double: "+(a+b));
    }
    void sum (int a, double b)
    {
        System.out.println ("The sum of int and double: "+(a+b));
    }
    void sum (String a, String b)
    {
        System.out.println ("The sum of String: "+(a+b));
    }
    public static void main(String args[])
    {
        OverloadTest over = new OverloadTest();
        over.sum(20,35);
        over.sum(21.3,18.7);
        over.sum(17, 24.6);
        over.sum("TutorialRide", " Info");
    }
}