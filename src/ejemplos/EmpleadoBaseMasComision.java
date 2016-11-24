package ejemplos;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	
	private double salarioBase;
	
	public EmpleadoBaseMasComision(String nombre, String apellido, 
			String nss, double venta, double tarifa, 
			double salario)
	{
		super(nombre, apellido, nss, venta, tarifa);
		this.setSalarioBase(salario);
	}
	
	public void setSalarioBase(double salario)
	{
		this.salarioBase = (salario >= 0.0) ? salario : 0.0;
	}
	
	public double getSalarioBase()
	{
		return this.salarioBase;
	}
	
	
	public double ingresos()
	{
		return this.getSalarioBase() + super.ingresos();
	}
	
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f", 
				"con salario base", super.toString(),
				"salario con base", this.getSalarioBase());
	}
	

}
