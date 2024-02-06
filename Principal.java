import java.text.SimpleDateFormat;
import java.util.Date;

public class Arrays {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
        	fechaHora();
	}

	public static void fechaHora() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        	Date fechaHora = new Date();
        	System.out.println("Fecha y hora actual: " + dateFormat.format(fechaHora));
    }	

}