package w18comp1008s3feb14;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JWright
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        //create a new HourlyEmployee and see that they have all the
        //attributes of an Employee
        HourlyEmployee emp1 = new HourlyEmployee(15, "Hank", "Kercheif", 
              "123 456 789", LocalDate.of(1999, Month.MARCH, 10), 100001);
        
        System.out.printf("Emp1 name: %s %s%n", emp1.getFirstName(), 
                                              emp1.getLastName());
        
        System.out.printf("Emp1 payrate: $%.2f%n", emp1.getHourlyRate());
        
        System.out.println("Emp1: " + emp1);
        
        CommissionEmployee emp2 = new CommissionEmployee(15, 
              "Jason", "Brody","123 456 790", 
                LocalDate.of(2000, Month.MARCH, 10), 100002);
        
        System.out.println("Emp2: " + emp2);
    }
}
