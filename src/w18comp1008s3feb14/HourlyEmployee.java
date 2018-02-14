package w18comp1008s3feb14;

import java.time.LocalDate;

/**
 * The "extends" keyword means that this is a child class or subclass of
 * the Employee class.  It will inherit all the instance variables and methods
 * of an Employee
 * @author JWright
 */
public class HourlyEmployee extends Employee
{
    private double hourlyRate;
    private int hoursWorked;
    private static final double MINIMUM_WAGE = 14;

    public HourlyEmployee(double hourlyRate, String firstName, String lastName, 
              String socialInsuranceNum, LocalDate dateOfBirth, int employeeNum)
    {
        super(firstName, lastName, socialInsuranceNum, dateOfBirth, employeeNum);
        setHourlyRate(hourlyRate);
        hoursWorked = 0;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate)
    {
        if (hourlyRate < MINIMUM_WAGE)
            throw new IllegalArgumentException("Hourly rate must be > "+MINIMUM_WAGE);
        else
            this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     * This method adds the amount of hours worked in 1 shift
     * @param hoursWorked must be 3-12
     */
    public void setHoursWorked(int hoursWorked)
    {
        if (hoursWorked >=3 && hoursWorked <=12)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("Hours worked must be 3-12");
    }

    @Override
    public double calculatePay()
    {
        return this.hoursWorked * this.hourlyRate;
    }
    
    
}
