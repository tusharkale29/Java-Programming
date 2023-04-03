class Employee
{
     String name;
     int salary;
     Employee()
     {
          name = null;
          salary = 0;
     }
     Employee (String name, int salary)
     {
          this.name = name;
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
}