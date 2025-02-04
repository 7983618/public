import java.time.LocalDateTime;
import java.util.Scanner;
public class Principal { 
    public static void main(String[] args) { 
        System.out.println("Hola mundo"); 
        System.out.println("Fecha y hora actual:");
        System.out.println(LocalDateTime.now());
        Usuario[] lista = generarUsuarios(2);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Usuario "+i);
            System.out.println("Nombre..."+lista[i].nombre);
            System.out.println("Apellidos..."+lista[i].apellidos);
            System.out.println("Email..."+lista[i].email);
            System.out.println("-------------------------");
            
        }
    }
    public static Usuario[] generarUsuarios(int n) {
        Usuario[] usuarios = new Usuario[n];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario();
        }
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Nombre usuario " + i + "..." );
            String nombre = teclado.nextLine();
            usuarios[i].nombre = nombre;
            System.out.println("Apellidos usuario " + i + "..." );
            String apelliidos = teclado.nextLine();
            usuarios[i].apellidos = apelliidos;
            System.out.println("Email" + i + "..." );
            String email = teclado.nextLine();
            usuarios[i].email = email;
        }
        teclado.close();
        return usuarios;

    }
}
