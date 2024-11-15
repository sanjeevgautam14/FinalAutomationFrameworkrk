package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * This method is used to capture current system date and time
 * @return
 */

public class JavaUtility {
	/**
	 * This method is used to capture current system date and time
	 * @return String
	 */
	
	public String getSystemTime() {
		return  LocalDateTime.now().toString().replace(":", "-");
	}
	public int getRandomNumber() {
		Random ran =new Random();
		return ran.nextInt(1000);
	}

}
