package ejemplos;

public class EmpleadoPorComision extends Empleado{
	
	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String nombre, String apellido, 
			String nss, double venta, double tarifa)
	{
		super(nombre, apellido, nss);
		this.setVentasBrutas(venta);
		this.setTarifaComision(tarifa);
	}
	
	public void setTarifaComision(double tarifa)
	{
		this.tarifaComision = (tarifa >= 0.0 && tarifa < 1.0) ?
				tarifa : 0.0;
	}
	
	public double getTarifaComision()
	{
		return this.tarifaComision;
	}
	
	public void setVentasBrutas(double ventas)
	{
		this.ventasBrutas = (ventas >= 0.0) ? ventas : 0.0;
	}
	
	public double getVentasBrutas()
	{
		return this.ventasBrutas;
	}
	
	//calcula y sobreecribe el metodo abstracto ingresos
	public double ingresos()
	{
		return this.getTarifaComision() * this.getVentasBrutas();
	}
	
	public String toString()
	{
		return String.format("%s: %s\n%s: $%,.2f; %s: %,.2f", 
				"empleado por comision", super.toString(),
				"ventas brutas", getVentasBrutas(),
				"tarifa de comision", getTarifaComision());
	}

}


















