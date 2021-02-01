public class EmpWAgeBuildUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to wage computation program");

System.out.println("welcome to wage computation program");
        int full=1;
        int part=2;
       
        
        int WagePerHour= 20;
       
        int time =0;
        int days=0;
        
        for(int d=0 ; d<=20 ; d++)
           {
        	while(time<=100)
        	{
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
        	
           }
        
        
       
        int totalsalary=time*WagePerHour;
        System.out.println("employee total salary is " +totalsalary);
  
}
}