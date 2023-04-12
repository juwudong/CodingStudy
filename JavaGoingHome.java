import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Secyuriy;
import org.opentutorials.iot.Lighting;
public class JavaGoingHome {

	public static void main(String[] args) {
		

		//elevator call
		Elevator myElevator = new Elevator("Java Apt 507");
		myElevator.callForUp(1); //앨리베이터 1층으로 올려보내
		//myElevator는 변수이다. 그럼 앞에 있는 Elevator는 멀까 데이터 타입!!! 
		// 그럼 Elevator 데이터타입에 해당하는 변수만 해당값에 해당된다.
		
		//security turn off
		Securiy mySecurity = new Security("Java Apt 507");
		mySecurity.off
		
		//light on
		Lighting hallLampOn = new Lighting("Java Apt 507");
		hallLampOn.on();
		
		
	}

}
