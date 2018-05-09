import java.util.Scanner;

public class AmusementRide {

	public void run() {}

	public static void main(String[] args) {

		System.out.println("Please Select your Ride\r");
		System.out.println("press 1 for the BumperCars");
		System.out.println("press 2 for the JumpAndSmile");
		System.out.println("press 3 for the MirrorMaze");
		System.out.println("press 4 for the HauntedHouse");
		System.out.println("press 5 for the TopSpin");
		System.out.println("press 6 for the Tornado");
		System.out.println("press Q to quit");
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
		 
		/* if (input.equals("1")) {
			 BumperCars bc = new BumperCars();
			 bc.run();
			 } else if (input.equals("2")) {
				 JumpAndSmile js = new JumpAndSmile();
				 js.run();
				 } //else if 
*/
	}
}

	
	class BumperCars extends AmusementRide{
	
		public void run() {
			System.out.println("BumperCars is running");
			
				
			}
		}

	class JumpAndSmile extends AmusementRide{
		
		public void run() {
			System.out.println("JumpAndSmile is running");
			
				
			}
		}	
	
	class MirrorMaze extends AmusementRide{
		
		public void run() {
			System.out.println("MirrorMaze is running");
			
				
			}
		}	
	
	class HauntedHouse extends AmusementRide{
		
		public void run() {
			System.out.println("HauntedHouse is running");
			
				
			}
		}		
	
	class TopSpin extends AmusementRide{
		
		public void run() {
			System.out.println("TopSpin is running");
			
				
			}
		}
	
	class Tornado extends AmusementRide{
		
		public void run() {
			System.out.println("Tornado is running");
			
				
			}
		}
