public class EmpWAgeBuildUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to wage computation program");

System.out.println("welcome to wage computation program");
        int full=1;
        int part=2;
        
        
        int WagePerHour= 20;
        //int fullDayHour=12;
       // int partDayHour=8;
        int time =0;
        
        for(int i=1 ; i<=20 ; i++) {
        	int check = (int) (Math.floor(Math.random()*10)%3);
        	System.out.println(check);
        if(check==full)
        {   
        	System.out.println("employee is present in full time");
        	time=time+12;
        }
        
        else if(check==part)
        {
        	System.out.println("employee present is part time");
        	time=time+8;
        }
        
        else
        {
        	System.out.println("employyee is absent");
        	time=time+0;
        }
        }
        int totalsalary=time*WagePerHour;
        System.out.println("salary per day of u is " +totalsalary);
  
}
}