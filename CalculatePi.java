package MyFile;
import java.util.*;

public class CalculatePi {

	public static void main(String[] args) {
		System.out.println(estimate_pi(10));
		System.out.println(estimate_pi(100));
		System.out.println(estimate_pi(1000));
		System.out.println(estimate_pi(10000));


	}	

	public static double RandomNumbers() {
		Random random = new Random();
		return random.nextFloat();
	}

	public static double estimate_pi(int InputNum) {
		double InCircle = 0.0;
		double OutCircle = 0.0;
		double distance;

		for (int a=0; a<InputNum; a++) {
			distance= Math.pow(RandomNumbers(),2) + Math.pow(RandomNumbers(),2);

			if(distance>=1) {
				OutCircle++;
			}else {
				InCircle++;
			}
		}
		double estim_pi = (4*InCircle)/(OutCircle+InCircle);
		return estim_pi;
	}
}
