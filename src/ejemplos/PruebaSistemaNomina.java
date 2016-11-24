package ejemplos;

public class PruebaSistemaNomina {
	
	public static void main(String []args)
	{
		//se crean 4 objetos de cada tipo de empleado
		
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado
				("Alexis Abraham", "Araujo Moreno", "456789321", 50000);
		
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras
				("Adrian", "Gutierrez Godinez", "456321654", 45.50, 
						.45);
		
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision
				("Brenda", "Mata Rangel", "987654321", 1000, .50);
		
		EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision
				("Jaime", "Zabal Perez", "654321456", 1000, .25, 3000);
		
		System.out.println("Empleado procesados por separado:\n");
		
		System.out.printf("%s\n%s: $%,.2f\n\n", 
				empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", 
				empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", 
				empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", 
				empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		
		//inicializa un arreglo de tipo Empleado
		Empleado empleados[] = new Empleado[4];
		
		//inicializa el arreglo
		empleados[0] = empleadoAsalariado;
		empleados[1] = empleadoBaseMasComision;
		empleados[2] = empleadoPorComision;
		empleados[3] = empleadoPorHoras;
		
		System.out.println("Empleados procesados en forma polimorfica:\n");
		
		for(Empleado empleadoActual : empleados)
		{
			System.out.println(empleadoActual);
			
			//determina si empleadoActual es de tipo EmpleadoBaseMasComision
			if(empleadoActual instanceof EmpleadoBaseMasComision)
			{
				//conversion descendente de la referencia de Empleado
				//a una referencia de EmpleadoBaseMasComision
				EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
				
				double salarioAnterior = empleado.getSalarioBase();
				empleado.setSalarioBase(salarioAnterior + (salarioAnterior * .10));
				
				System.out.println("El nuevo saldo para " + empleado.getClass().getSimpleName() + 
						" es: " + empleado.getSalarioBase());
			}
			System.out.println("Ingresos: " + empleadoActual.ingresos());
			System.out.println();
		}
	
		for(int i = 0; i < empleados.length; i++)
		{
			System.out.println("Empleado " + i + ": = " + empleados[i].getClass().getSimpleName());
		}
	}
}
















