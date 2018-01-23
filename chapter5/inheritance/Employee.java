package inheritance;

import java.time.*;

import org.omg.CORBA.IntHolder;

public class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;


   public Employee(){


   }

   public Employee(String name, double salary, int year, int month, int day)
   {
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   protected int getProtectedMethod(){
      return 9;
   }

   public void triple(IntHolder x){
       x.value = 3 * x.value;

   }
}
