import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        int cantidadUsuarios = 0;

        System.out.print("Ingrese el tamaño del Array");
        cantidadUsuarios = teclado.nextInt();

        Usuario[] usuarios = new Usuario[cantidadUsuarios];

        for (int i = 0; i < cantidadUsuarios; i++) {
            Usuario usuario = new Usuario();

            System.out.println("USUARIO " + (i + 1));
            System.out.print("Nombre: ");
            usuario.nombre = teclado.next();
            System.out.print("Apellidos: ");
            usuario.apellidos = teclado.next();
            System.out.print("Email: ");
            usuario.email = teclado.next();

            usuarios[i] = usuario;
        }

        System.out.println("USUARIOS:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println("---------------------------------");
        }

        System.out.println("\nHola mundo");

        fechaHora();
    }

    public static void fechaHora() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaHora = new Date();
        System.out.println("Fecha y hora actual: " + dateFormat.format(fechaHora));
    }
}

class Usuario {
    public String nombre;
    public String apellidos;
    public String email;
}
