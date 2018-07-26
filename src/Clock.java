import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {

	public long returnAngleClock(GregorianCalendar time) {
		System.out.println("Horario Digitado - "
				+ time.get(Calendar.HOUR_OF_DAY) + ":"
				+ time.get(Calendar.MINUTE));

		// transforma para radianos
		double hourRad = time.get(Calendar.HOUR) * (Math.PI / 6);
		double minuteRad = time.get(Calendar.MINUTE) * (Math.PI / 30);
		System.out.println("Horario em Radianos - Hora: " + hourRad
				+ " | Minuto: " + minuteRad);

		// transforma para angulo
		double hourAngle = Math.round(hourRad * (180 / Math.PI));
		double minuteAngle = Math.round(minuteRad * (180 / Math.PI));
		System.out.println("Horario em Angulo - Hora: " + hourAngle
				+ " | Minuto: " + minuteAngle);

		// retorna a diferença dos angulos
		long angleDiff = (long) (minuteAngle - hourAngle);

		if (angleDiff < 0) { // se o valor do da diferenca dos angulos for
								// negativo, quer dizer
								// que o angulo das horas é maior que a dos
								// minutos.
			return angleDiff + 360;
		} else {
			return angleDiff;
		}

	}

}
