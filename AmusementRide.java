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
		 String input = sc.next();
		 
		 if (input.equals("1")) {
			 BumperCars bc = new BumperCars();
			 bc.run();
			 } else if (input.equals("2")) {
				 JumpAndSmile js = new JumpAndSmile();
				 js.run();
				 } //else if 

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
	
	// test
	
	
	
	
	
