package w18comp1008s3feb14;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class CommissionEmployee extends Employee
{
    private double commissionRate, sales;

    public CommissionEmployee(double commissionRate, String firstName, String lastName, String socialInsuranceNum, LocalDate dateOfBirth, int employeeNum)
    {
        super(firstName, lastName, socialInsuranceNum, dateOfBirth, employeeNum);
        setCommissionRate(commissionRate);
        sales = 0;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }

    public double getSales()
    {
        return sales;
    }

    public void setSales(double sales)
    {
        this.sales = sales;
    }

    @Override
    public double calculatePay()
    {
        return this.commissionRate * this.sales;
    }
    
    /**
     * This returns a String from the parent class followed by the 
     * commission rate
     */
    public String toString()
    {
        return String.format("%s commission rate: $%.2f", super.toString(), 
                                                        commissionRate);
    }
    
}
