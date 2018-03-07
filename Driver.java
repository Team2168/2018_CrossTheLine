//Driver.java will be utilized to test our code
//==============================================================================
/**
 * @file    Driver.java
 * @date    2/26/2018
 * @author  Cierra
 * @author  Ricardo
 *
 */
//==============================================================================
/**
 * @class Driver
 *
 * File utilized to test and simulate the implementation for CrossTheLine auto
 */
public class Driver
{
  public static void main(String[] args) throws InterruptedException
    {
      /// Functions shall be placed inside the while loop to simulate the
      /// number of iterations and the iteration speed it will encounter
      /// while running auto mode on RoboRio

      /// The iteration variable will count the number of iterations that occur
      /// in 15 seconds (750 at the 20ms per iteration rate of RoboRio)
      int iteration = 0;
      while (iteration<750)
      {
        /// Place function to be tested between here...
    	VictorSP leftmotor1 = new VictorSP(0);
    	VictorSP leftmotor2 = new VictorSP(1);
    	VictorSP leftmotor3 = new VictorSP(2);
    	
    	VictorSP rightmotor1 = new VictorSP(3);
    	VictorSP rightmotor2 = new VictorSP(4);
    	VictorSP rightmotor3 = new VictorSP(5);
    	
    	VictorSP[] leftmotors = new VictorSP[3];
    	leftmotors[0] = leftmotor1;
    	leftmotors[1] = leftmotor2;
    	leftmotors[2] = leftmotor3;
    	
    	VictorSP[] rightmotors = new VictorSP[3];
    	rightmotors[0] = rightmotor1;
    	rightmotors[1] = rightmotor2;
    	rightmotors[2] = rightmotor3;
    	
    	drive(3, leftmotors, rightmotors, 0.10, 0.10, "right", 250);
        /// ... and here!
        iteration++;
        /// Sleep the thread for 20ms to simulate iteration time of RoboRio
        Thread.sleep(20);
      }
    }
  
  
  static int counter = 0;

  // number_of_motors is the number of motors per side, not in total
  public static void drive(int number_of_motors, VictorSP[] left, VictorSP[] right, double leftspeed, double rightspeed, String reverse, int durationOfTravel) {
	  
	  if(counter<=durationOfTravel) {
		  
		  for (int i = 0; i < number_of_motors; i++) {
			  if(reverse.equalsIgnoreCase("left"))
				  leftspeed = -leftspeed;
			  left[i].set(leftspeed);
			  
			  if(reverse.equalsIgnoreCase("right"))
				  rightspeed = -rightspeed;
			  right[i].set(rightspeed);
			  
			  System.out.println("The robot is moving.");
		  }
		  
	  }
	  else {
		  
		  for (int i = 0; i < number_of_motors; i++) {
		  left[i].set(0.0);
		  right[i].set(0.0);
		  }
		  
		  System.out.println("The robot has stopped.");
		  
	  }
	  
	  counter++;
	  System.out.format("%d%n", counter);
	  
  }
  
  
  
}
