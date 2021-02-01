public class EmpWAgeBuildUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to wage computation program");


              int full=1;
        int part=2;
        double check = Math.floor(Math.random()*10)%3;
        System.out.println(check);
        int WagePerHour= 20;
        int fullDayHour=12;
        int partDayHour=8;
        
        if(check==full)
        {
        	System.out.println("employee is present");
        	int salary=WagePerHour*fullDayHour;
        	System.out.println(salary);
        }
        else if(check==part)
        {
        	System.out.println("employee is present in part time");
        	int salary=WagePerHour*partDayHour;
        	System.out.println(salary);
        	
        }
        
        else
        {
        	System.out.println("employee is absent");
        	System.out.println("no salary without work");
        }

}
}