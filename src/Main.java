import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		Clock angleClock = new Clock();
		// input
		GregorianCalendar time = new GregorianCalendar();

		System.out.print("Digite a hora desejada: \n");
		int hourPointer = input.nextInt();

		System.out.println("Digite os minutos desejado: ");
		int minutePointer = input.nextInt();

		time.set(Calendar.HOUR_OF_DAY, hourPointer);
		time.set(Calendar.MINUTE, minutePointer);
		long angleDiff = angleClock.returnAngleClock(time);
		System.out.println("Angulo entre os ponteiros: " + angleDiff
				+ "º\n-----------------------------------------------");

	}

}
