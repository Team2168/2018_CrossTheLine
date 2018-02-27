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

        /// ... and here!
        iteration++;
        /// Sleep the thread for 20ms to simulate iteration time of RoboRio
        Thread.sleep(20);
      }
    }
}
