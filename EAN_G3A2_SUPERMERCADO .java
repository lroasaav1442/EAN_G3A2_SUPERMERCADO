import java.util.Scanner;

public class Supermercado
{
	public static void main(String[] args) // Metodo principal
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 3 Actividad 2");
		System.out.println("Proyecto en Grupo");
		System.out.println("Arreglos - SUPERMERCADO");
		System.out.println();
		inicio(); // Lanza el método inicio
	}
	public static void inicio() // Metodo inicio, despliega las opciones y direcciona segun menu
	{
		Scanner tecla = new Scanner(System.in);
		System.out.println("Opción 1 - NO digitar la base");
		System.out.println("Opción 2 - SI digitar la base");
		System.out.print("Digite la opcion que desea: ");
		int opcion_0 = tecla.nextInt();
		
		System.out.println();
		
		if (opcion_0 == 1)
		{
			opcion_1(); // Lanza el metodo opcion_1
		}
		else if (opcion_0 == 2)
		{
			opcion_2(); // Lanza el metodo opcion_2
		}
		else
		{
			error(); // Lanza el metodo error
		}
	}
	public static void opcion_1() // Metodo opcion_1
	{
		System.out.println("Digito la opcion 1, NO digitar los datos");
		System.out.println("El sistema toma los datos previamente cargados.");
		
		String [][] basedatos_1;
		basedatos_1 = baseDatos_1_metod(); // Lanza el metodo baseDatos_metod()
		imprimirArreglo(basedatos_1);
	}
	public static void opcion_2() // Metodo opcion_2
	{
		System.out.println("Digito la opcion 2, SI digitar los datos");
		String [][] basedatos_2;
		basedatos_2 = baseDatos_2_metod(); // Lanza el metodo baseDatos_metod() 
		imprimirArreglo(basedatos_2);
	}
	public static void error() // Metodo error
	{
		System.out.println("Digito una opcion incorrecta, lo siento! :(");
		System.out.println("Volvera la incio...");
		System.out.println();
		inicio();
	}
	public static String[][] baseDatos_1_metod() // Metodo de carge de datos a la memoria
	{
		String [][] basedatos;
		basedatos = new String [10][10]; // Filas - Columnas
		
		basedatos [0][0] = "EMPLE_01";
		basedatos [0][1] = "JUAN";
		basedatos [0][2] = "MONSALVE";
		basedatos [0][3] = "PLANEACION COMERCIAL";
		basedatos [0][4] = "ANALISTA";
		basedatos [0][5] = "	3000000";
		
		basedatos [1][0] = "EMPLE_02";
		basedatos [1][1] = "ANDREA";
		basedatos [1][2] = "RAMIREZ";
		basedatos [1][3] = "FIDELIZACION";
		basedatos [1][4] = "ANALISTA";
		basedatos [1][5] = "3000000";
		
		basedatos [2][0] = "EMPLE_03";
		basedatos [2][1] = "CARMENZA";
		basedatos [2][2] = "TORRES";
		basedatos [2][3] = "PRESIDENCIA";
		basedatos [2][4] = "ASISTENTE";
		basedatos [2][5] = "2500000";
		
		basedatos [3][0] = "EMPLE_04";
		basedatos [3][1] = "GLORIA";
		basedatos [3][2] = "ORDOÑEZ";
		basedatos [3][3] = "RECURSOS HUMANOS";
		basedatos [3][4] = "DOCENTE";
		basedatos [3][5] = "2500000";
		
		basedatos [4][0] = "EMPLE_05";
		basedatos [4][1] = "FERNANDO";
		basedatos [4][2] = "RAMIREZ";
		basedatos [4][3] = "COMERCIAL";
		basedatos [4][4] = "DIRECTOR";
		basedatos [4][5] = "12000000";
		
		basedatos [5][0] = "EMPLE_06";
		basedatos [5][1] = "CRISTIAN";
		basedatos [5][2] = "RAMIREZ";
		basedatos [5][3] = "DESARROLLO";
		basedatos [5][4] = "DESARROLLADOR";
		basedatos [5][5] = "5000000";
		
		basedatos [6][0] = "EMPLE_07";
		basedatos [6][1] = "LUIS";
		basedatos [6][2] = "RAMIREZ";
		basedatos [6][3] = "MERCADEO";
		basedatos [6][4] = "GERENTE";
		basedatos [6][5] = "16000000";
		
		basedatos [7][0] = "EMPLE_08";
		basedatos [7][1] = "NUVIA";
		basedatos [7][2] = "FAJARDO";
		basedatos [7][3] = "MERCADEO";
		basedatos [7][4] = "ESPECIALISTA";
		basedatos [7][5] = "9000000";
		
		basedatos [8][0] = "EMPLE_09";
		basedatos [8][1] = "CAMILO";
		basedatos [8][2] = "PERDOMO";
		basedatos [8][3] = "PUBLICIDAD";
		basedatos [8][4] = "ESPECIALISTA";
		basedatos [8][5] = "9000000";
		
		basedatos [9][0] = "EMPLE_10";
		basedatos [9][1] = "JOAQUIN";
		basedatos [9][2] = "VILLENA";
		basedatos [9][3] = "PRESIDENCIA";
		basedatos [9][4] = "PRESINDENTE";
		basedatos [9][5] = "20000000";
			
		return basedatos;
	}
	public static String[][] baseDatos_2_metod() // Metodo de carge de datos a la memoria
	{
		Scanner tecla = new Scanner(System.in);
		System.out.println();
		System.out.println("Ha escojido digitar la base manualmente");
		System.out.print("Cuantos registros va a digitar: ");
		int cantRegitros = tecla.nextInt();
		System.out.println();
		
		String [][] basedatos_2;
		basedatos_2 = new String [cantRegitros][10]; // Filas - Columnas
		
		for(int i=0;i<cantRegitros;i++) // Fila
		{
			for(int y=0;y<=5;y++) // Columna
			{
				String nomColumna = nombreColumna(y);	
				
				System.out.print("Del registro "+(i+1)+" escriba "+nomColumna+": ");
				basedatos_2 [i][y] = tecla.next();
				if(basedatos_2 [i][y]== "")
				{
					System.out.println("No digito infomación, vuelva a intentarlo");
					System.out.print("Del registro "+(i+1)+" escriba "+nomColumna+": ");
					basedatos_2 [i][y] = tecla.next();
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Gracias");
		return basedatos_2;
	}
	public static String nombreColumna(int a)
	{	
		String columna = null;
		switch (a)
		{
			case 0: columna = "Codigo del empleado";
			break;
			
			case 1: columna = "Nombre";
			break;
			
			case 2: columna = "Apellio";
			break;
			
			case 3: columna = "Area";
			break;
			
			case 4: columna = "Cargo";
			break;
			
			case 5: columna = "Remuneración";
			break;
		}
		return columna;
	}
	public static void imprimirArreglo(String [][] baseDatos_Imprimir)
	{
		System.out.println();
		int tamaño = baseDatos_Imprimir.length;
		System.out.println("La base de datos es: ");
		for(int a = 0;a<tamaño;a++) // Columnas
		{
			for(int b = 0;b<=5;b++) // Filas 
			{
				String nomColumna = nombreColumna(b);
				System.out.println(nomColumna+": "+baseDatos_Imprimir [a][b]);
			}
			System.out.println();
		}
	}
}