package ejemplos;

public class EmpleadoAsalariado extends Empleado{
	
	private double salarioSemanal;
	
	//constructor
	public EmpleadoAsalariado(String nombre, String apellido,
			String nss, double salario)
	{
		super(nombre, apellido, nss);
		this.setSalarioSemanal(salario);
	}
	
	//establece el salario semanal
	public void setSalarioSemanal(double salario)
	{
		this.salarioSemanal = (salario >= 0.0) ? salario : 0.0;
	}
	
	//obtiene el salario semanal
	public double getSalarioSemanal()
	{
		return this.salarioSemanal;
	}
	
	//sobreescribe el metodo ingresos de la super clase abstracta
	//y obtenemos los ingresos semanales de la clase empleado asalariado
	public double ingresos()
	{
		return this.getSalarioSemanal();
	}
	
	public String toString()
	{
		return String.format("empleado asalariado: %s\n%s: $%,.2f", 
				super.toString(), "salario semanal", this.getSalarioSemanal());
	}

}






