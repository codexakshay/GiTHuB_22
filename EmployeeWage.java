import java.util.Scanner;
class WageCalculation
{
                public static final int FULL_TIME=1;
                public static final int PART_TIME=0;

        public static void calculateEmpWage(String EmployeeName,int wagePerHr,int NumberOfWorkingDays,int NumberWorkingHrs)
        {
                        int currentWorkingHour=0;
                        int currentWorkingday=0;
                        int salary,workingHr=0;
                        int totalSalary=0;

                        while( NumberOfWorkingDays>=currentWorkingday && NumberWorkingHrs>=currentWorkingHour )
                        {
                                int random=(int)Math.floor(Math.random()*10)%3;
                                switch(random)
                                {
                                        case FULL_TIME:
                                                workingHr=8;
                                                break;
                                        case PART_TIME:
                                                workingHr=4;
                                                break;
                                        default:
                                                workingHr=0;
                                 }
                                        currentWorkingday++;
                                        salary=workingHr*wagePerHr;
                                        totalSalary+=salary;
                        }
                                        System.out.println("Total computed salary of "+EmployeeName+" is "+totalSalary);
        }
}

public class EmployeeWage extends WageCalculation
{
                                public static void main(String[] args)
                                {
                                        for(int i=1;i<=3;i++)
                                        {
                                        System.out.println("\nEnter Employee Name : ");
                                        Scanner sc=new Scanner(System.in);
                                        String EmployeeName=sc.nextLine();
                                        System.out.println("Enter Numberer of Working Days : ");
                                        int NumberOfWorkingDays=sc.nextInt();
                                        calculateEmpWage(EmployeeName,NumberOfWorkingDays,20,30);
                                        }
                                }
}
