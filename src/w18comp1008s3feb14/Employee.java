package w18comp1008s3feb14;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class Employee
{
    private String firstName, lastName, socialInsuranceNum;
    private LocalDate dateOfBirth;
    private int employeeNum;

    public Employee(String firstName, String lastName, String socialInsuranceNum, LocalDate dateOfBirth, int employeeNum)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNum(socialInsuranceNum);
        setDateOfBirth(dateOfBirth);
        setEmployeeNum(employeeNum);
    }   

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSocialInsuranceNum()
    {
        return socialInsuranceNum;
    }

    public void setSocialInsuranceNum(String socialInsuranceNum)
    {
        this.socialInsuranceNum = socialInsuranceNum;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public int getEmployeeNum()
    {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum)
    {
        this.employeeNum = employeeNum;
    }
    
    
    
    
}
