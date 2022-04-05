package examen;
/**
 * Clase que dice que el formato de hora es valido
 * 
 * @author DAM108
 * @version "1.0"
 */

public class Hora {
	public static boolean horaValida;
/**
 * 
 * @param segundos variable para los segundos
 * @param minutos variable para los minutos
 * @param horas variable para las horas
 * @return true si el formato es correcto, false si no lo es 
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}