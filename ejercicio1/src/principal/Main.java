package principal;
import java.util.Scanner;
import entidades.Tramo;
import entidades.Doctor;
import entidades.Persona;

public class Main {

	public static void main(String[] args) {
		int entero=2777;
		int prueba2;
		long idPersona;
		float reales=0.77F;
		double realesdobles= 0.8;
		double realesdobles2= 0.78;

		Doctor facu = new Doctor();
		
		System.out.println ("\n" + facu);
		
		Persona shiro = new Persona();
		shiro.setId(1);
		String nombreShiro = "Shiro Nai";
		shiro.setNombre(nombreShiro);
		int edad = shiro.getEdad();
		shiro.setEdad(21);
		
		String aux;
		aux = shiro.getNombre();
		shiro.setNombre(aux);
		
		System.out.println ("El nombre es: " + shiro.getNombre());
		System.out.println ("\nLa edad es: " + shiro.getEdad());
		System.out.println ("\n" + aux);
		System.out.println ("\n" + shiro);
		
		Tramo tramo1 = new Tramo ();
		long idTramo1 = tramo1.getId();
		int puntodeFinTramo1 = tramo1.getPuntodeFin();
		int puntodeInicioTramo1 = tramo1.getPuntodeInicio();
		
		Tramo tramo2 = new Tramo();
		long idTramo2 = tramo2.getId();
		int puntodeFinTramo2 = tramo2.getPuntodeFin();
		int puntodeInicioTramo2 = tramo2.getPuntodeInicio();
		
		idTramo1 = 101;
		puntodeInicioTramo1 = 22;
		puntodeFinTramo1 = 27;
		
		tramo1.setId(idTramo1);
		tramo1.setPuntodeInicio(puntodeInicioTramo1);
		tramo1.setPuntodeFin(puntodeFinTramo1);
		
		tramo1.setId(312790);
		tramo1.setPuntodeFin(47);
		tramo1.setPuntodeInicio(25);

		System.out.println ("\nValor de id tramo1 es: " + tramo1.getId());
		System.out.println ("Valor de id tramo1 es: " + tramo1.getPuntodeFin());
		System.out.println ("Valor de id tramo1 es: " + tramo1.getPuntodeInicio());
		
		
		Scanner scanf;
		scanf = new Scanner (System.in);
		
		System.out.println ("Introduzca un número entero");
		int prueba = scanf.nextInt();
		System.out.println ("Su número entero es:\t" + prueba + "\n");
		
		scanf = new Scanner (System.in);
		
		System.out.println ("Introduzca un número entero");
		prueba2 = scanf.nextInt();
		System.out.println ("Su número entero es:\t" + prueba2 + "\n");
		
		scanf = new Scanner (System.in);
		
		System.out.println ("Introduzca una frase");
		String prueba4 = scanf.nextLine();
		System.out.println ("Su frase es:\t" + prueba4 + "\n");
		
		scanf = new Scanner (System.in);
		
		System.out.println ("Introduzca un solo caracter");
		char prueba3 = scanf.nextLine().charAt(0);
		System.out.println ("Su caracter es:\t" + prueba3 + "\n");
		
		char letra= 'ª';
		boolean valores;
		String kekw= "Quiero hacer programas más difíciles :(\n";
		String xd;

		System.out.println (kekw);
		System.out.println (letra);
		xd= "\nQue alguien me pegue un tiro en las pelotas por favor xd";
		System.out.println ("\ntengo autismo?, lo tengo bro xd\n" + xd);
		System.out.println ("\nShiro" + entero + " " + letra);
		System.out.println ("\n" + realesdobles + " " + realesdobles2);
	}
}