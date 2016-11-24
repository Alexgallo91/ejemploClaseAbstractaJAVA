package ejemplos;

public class EmpleadoPorHoras extends Empleado{
	
	private double sueldo;
	private double horas;
	
	//constructor con cinco argumentos
	public EmpleadoPorHoras(String nombre,
			String apellido, String nss, double sueldo,
			double horasTrabajadas)
	{
		super(nombre, apellido, nss);
		this.setHorasTrabajadas(horasTrabajadas);
		this.setSueldoPorHoras(sueldo);
	}
	
	//establece el sueldo por horas
	public void setSueldoPorHoras(double sueldo)
	{
		this.sueldo = (sueldo >= 0.0) ? sueldo : 0.0;
	}
	
	//obtiene el sueldo por horas
	public double getSueldoPorHoras()
	{
		return this.sueldo;
	}
	
	//establece las horas trabajadas
	public void setHorasTrabajadas(double horas)
	{
		this.horas = ((horas >= 0.0 && horas <= 168.0)
				? horas : 0.0);	
	}
	
	//obtiene las horas trabajadas
	public double getHorasTrabajadas()
	{
		return this.horas;
	}
	
	//sobreescribe el metodo abstracto de la super clase
	//ingresos
	public double ingresos()
	{
		if(this.getHorasTrabajadas() <= 40)
		{
			return (this.getHorasTrabajadas() * this.getSueldoPorHoras());
		}
		else
		{
			return (40 * this.getSueldoPorHoras()) + 
					((this.getHorasTrabajadas() - 40) * (this.getSueldoPorHoras() * 1.5));
		}
	}
	
	//devuelve representacion en String
	public String toString()
	{
		return String.format(
				"empleado por horas: %s\n%s: $%,.2f; "
				+ "%s: %,.2f", super.toString(),
				"sueldo por hora", this.getSueldoPorHoras(),
				"horas trabajadas", this.getHorasTrabajadas());
	}
	
}








