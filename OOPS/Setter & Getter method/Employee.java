public class Employee
{
    public static void main(String args[])
    {
      EmpSetGet emp = new EmpSetGet();
      emp.setEmpId(101);
      emp.setName("ABC");
      emp.setAge(25);
      emp.setDept("Testing");
      System.out.println("Employee Id : "+emp.getEmpId() + "\nName : " + emp.getName() + "\nAge : " + emp.getAge() + "\nDepartment : "+emp.getDept());
   }
}