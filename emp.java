import java.util.*;
abstract class Employee{
	abstract void getAmount(double x,double y);
}
class WeeklyEmployees extends Employee{
	void getAmount(double nw,double wa)
	{
		System.out.println("Amount paid to WeeklyEmployees: "+(nw*wa));
	}
}
class HourlyEmployees extends Employee{
	void getAmount(double nh,double ha)
	{
		System.out.println("Amount paid to HourlyEmployees: "+(nh*ha));
	}
}
class emp{
	public static void main(String args[])
	{
		HourlyEmployees h=new HourlyEmployees();
		WeeklyEmployees w=new WeeklyEmployees();
		Scanner sc=new Scanner(System.in);
		//hourly employee
		System.out.println("enter no. of hours: ");
		double nh=sc.nextDouble();
		System.out.println("enter amount per hour: ");
		double ha=sc.nextDouble();
		h.getAmount(nh,ha);
		//weekly employee
		System.out.println("enter no. of weeks: ");
		double nw=sc.nextDouble();
		System.out.println("enter amount per week: ");
		double wa=sc.nextDouble();
		w.getAmount(nw,wa);
	}
}
