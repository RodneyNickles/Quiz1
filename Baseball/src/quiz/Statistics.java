package quiz;
import java.util.Scanner;
import java.text.NumberFormat;
class Statistics {    
	public static void main(String[] arg){  
	   Scanner sc=new Scanner(System.in);
	   NumberFormat nf = NumberFormat.getInstance();
	     
	   System.out.println("Enter the First name of the player");  
	   String nameFirst=sc.next(); 
	   System.out.println("Enter the Last name of the player");  
	   String nameLast=sc.next(); 
	   System.out.println("Enter number of at bats");  
	   double AB=sc.nextInt();  
	   System.out.println("Enter number of hits");  
	   double H=sc.nextInt();  
	   System.out.println("Enter number of doubles");  
	   double Double=sc.nextInt();  
	   System.out.println("Enter number of triples");  
	   double Triple=sc.nextInt(); 
	   System.out.println("Enter number of home runs");  
	   double HR=sc.nextInt();
	   System.out.println("Enter number of runs");  
	   double R=sc.nextInt();
	   System.out.println("Enter number of walks");  
	   double BB=sc.nextInt(); 
	   
	   nf.setMaximumFractionDigits(3);
	   
	   double OBP = ((H+Double+Triple+HR+BB)/(AB+BB));
	   double BatAvg = ((H+Double+Triple+HR)/AB);
	   double SlugPercent = ((H+(2*Double)+(3*Triple)+(4*HR))/AB);
	   double OBS = (((AB*(H+BB))+(((H+(2*Double)+(3*Triple)+(4*HR))*(AB+BB)))))/(AB*(AB+BB));
	   double TB = (H+Double+(2*Triple)+(3*HR));
	   
	   System.out.println("The batting average of "+nameFirst+" "+nameLast+" is "+nf.format(BatAvg));
	   System.out.println("The on base percentage of "+nameFirst+" "+nameLast+" is "+nf.format(OBP));
	   System.out.println("The slugging percentage of "+nameFirst+" "+nameLast+" is "+nf.format(SlugPercent));
	   System.out.println("The on base and slugging percentage of "+nameFirst+" "+nameLast+" is "+nf.format(OBS));
	   System.out.println("The total bases of "+nameFirst+" "+nameLast+" is "+nf.format(TB));

	    
	   sc.close();  
	   
	  
	}
}