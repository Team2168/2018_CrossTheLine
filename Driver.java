//Driver.java will be utilized to test our code
public class Driver
{
  public static void main(String[] args) throws InterruptedException
    {
      int iteration = 0;
      while (iteration<750)
      {
        System.out.println("Iterated");
        iteration++;
        Thread.sleep(20);//sleep for 20ms
      }
    }
}
