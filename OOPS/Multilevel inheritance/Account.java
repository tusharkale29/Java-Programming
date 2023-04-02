class Account
{
        String cust_name;
        int acc_no;
        Account(String a, int b)
        {
                cust_name=a;
                acc_no=b;
        }
        void display()
        {
                System.out.println ("Customer Name: "+cust_name);
                System.out.println ("Account No: "+acc_no);
        }
}
class Saving_Acc extends Account
{
        int min_bal,saving_bal;
        Saving_Acc(String a, int b, int c, int d)
        {
                super(a,b);
                min_bal=c;
                saving_bal=d;
        }
        void display()
        {
                super.display();
                System.out.println ("Minimum Balance: "+min_bal);
                System.out.println ("Saving Balance: "+saving_bal);
        }
}
class Acct_Details extends Saving_Acc
{
        int deposits, withdrawals;
        Acct_Details(String a, int b, int c, int d, int e, int f)
        {
                super(a,b,c,d);
                deposits=e;
                withdrawals=f;
        }
        void display()
        {
                super.display();
                System.out.println ("Deposit: "+deposits);
                System.out.println ("Withdrawals: "+withdrawals);
        }
}
class Multilevel
{
        public static void main(String args[])
        {
                Acct_Details A = new Acct_Details("Aditya",17920,1000,5000,500,4000);
                A.display();
        }
}