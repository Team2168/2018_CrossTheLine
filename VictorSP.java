
public class VictorSP
{
	
	private int motorPin;
	
	VictorSP(int PWM) {
		
		this.motorPin = PWM;
		
	}

	public void set(double speed) {
		
		System.out.format("The speed is %.2f and the pin is %d%n", speed, motorPin);
		
	}
	

	
}
