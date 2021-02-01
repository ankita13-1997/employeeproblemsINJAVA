public class EmpWAgeBuildUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to wage computation program");


              int check = (int) (Math.floor(Math.random()*10)%3);
        System.out.println(check);
        int WagePerHour= 20;
        
        int time =0;
        switch(check)
        {
        case 1:
        
        	System.out.println("employee is present in full time");
        	
        	 time=time+12;
        	break;
        
        case 2:
        
        	System.out.println("employee is present in part time");
        	
        	time =time+8;
        	break;
        
        
        default:
        
        	System.out.println("employee is absent");
        	System.out.println("no salary without work");
        
	}
        int totalsalary=time*WagePerHour;
        System.out.println("salary per day of u is " +totalsalary);
  
}
}