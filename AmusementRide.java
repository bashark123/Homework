import java.util.Scanner;

public class AmusementRide {

	//public void run() {}
	static double revenue = 0 ;
	static int ticket = 0;
	
	public static void main(String[] args) {

		System.out.println("Please Select your Ride\r");
		System.out.println("press 1 for the BumperCars");
		System.out.println("press 2 for the JumpAndSmile");
		System.out.println("press 3 for the MirrorMaze");
		System.out.println("press 4 for the HauntedHouse");
		System.out.println("press 5 for the TopSpin");
		System.out.println("press 6 for the Tornado");
		System.out.println("press r for the revenue");
		System.out.println("press t for the teckets");
		System.out.println("press q to quit");
		 Scanner sc = new Scanner(System.in);
		
		 
		 while (true) {
			  String input = sc.next();
			 switch (input) {
			 
			 case "1":
				 BumperCars bc = new BumperCars();
				 bc.run();
				 break;
			 case "2":
				 JumpAndSmile js = new JumpAndSmile();
				 js.run();
				 break;
			 case "3":
				 MirrorMaze mm = new MirrorMaze();
				 mm.run();
				 break;
			 case "4":
				 HauntedHouse hh = new HauntedHouse();
				 hh.run();
				 break;
			 case "5":
				 TopSpin ts = new TopSpin();
				 ts.run();
				 break;
			 case "6":
				 Tornado to = new Tornado();
				 to.run();
				 break;
			 case "r":
				 System.out.println("Total revenue is "+revenue + " Euros" );
				 break;
			 case "t":
				 System.out.println("Total tickets sold are "+ticket);
				 break;
			 case "q":
				// sc.close();
				 System.out.println("Goodbye");
				 System.exit(0);
				 break;
			 default:
				 System.out.println("Invalid Entry");
				 break;
			 }
		 }
		 
	}
}

	
	class BumperCars extends AmusementRide{
	
		
		int bcTicket = 0;
		
		public void run() {
			double bcRevenue = 0;
			System.out.println("BumperCars is running");
			bcRevenue += 2.5;
			bcTicket ++;
			System.out.println(bcRevenue);
			revenue = bcRevenue + revenue;
			ticket = bcTicket + ticket;

						
			}

		}

	class JumpAndSmile extends AmusementRide{
		double jsRevenue = 0;
		int jsTicket = 0;
		
		public void run() {
			System.out.println("JumpAndSmile is running");
			jsRevenue += 2.25;
			jsTicket ++;
			revenue = jsRevenue + revenue;
			ticket = jsTicket + ticket;
							
			}
		}	
	
	class MirrorMaze extends AmusementRide{		
		double mmRevenue = 0;
    	int mmTicket = 0;
	
	    public void run() {
	    	System.out.println("MirrorMaze is running");
	    	mmRevenue += 2.75;
	    	mmTicket ++;
	    	revenue = mmRevenue + revenue;
	    	ticket = mmTicket + ticket;
		}	
	}
	
	class HauntedHouse extends AmusementRide{
		
		double hhRevenue = 0;
    	int hhTicket = 0;
	
	    public void run() {
	    	System.out.println("HauntedHouse is running");
	    	hhRevenue += 3.2;
	    	hhTicket ++;
	    	revenue = hhRevenue + revenue;
	    	ticket = hhTicket + ticket;
		}	
	}
	
	class TopSpin extends AmusementRide{
		
		double tsRevenue = 0;
    	int tsTicket = 0;
	
	    public void run() {
	    	System.out.println("TopSpin is running");
	    	tsRevenue += 2.9;
	    	tsTicket ++;
	    	revenue = tsRevenue + revenue;
	    	ticket = tsTicket + ticket;
		}
	}
	
	class Tornado extends AmusementRide{
		
		double toRevenue = 0;
    	int toTicket = 0;
	
	    public void run() {
	    	System.out.println("Tornado is running");
	    	toRevenue += 5.00;
	    	toTicket ++;
	    	revenue = toRevenue + revenue;
	    	ticket = toTicket + ticket;
		}
		
	
	}
	
	interface  CashkDesk {
		CashkDesk rideType();
		//rideType.
		
	}

	