package cm.qa.solid;

public class Runner {
	  public static void main(String[] args) {
	        
	        Driver driver = new Driver("Blue", "AUDI", 40000);
	        System.out.println(driver);
	        driver.drive(20000);
	        System.out.println(driver);
	        Mechanic mechanic = new Mechanic("Blue", "AUDI", 40000, "Low", "Replace");
	        System.out.println(mechanic);

	   }
}
