package ejemplos;

public abstract class Empleado {
	
	private String primerNombre;//Primer Nombre del empleado
	private String apellidoPaterno;//apellido del empleado
	private String numeroSeguroSocial;//seguro social
	
	public Empleado(String nombre, String apellido, String nss)
	{
		this.primerNombre = nombre;
		this.apellidoPaterno = apellido;
		this.numeroSeguroSocial = nss;
	}
	
	//establece el primerNombre
	public void setNombre(String nombre)
	{
		this.primerNombre = nombre;
	}
	
	//obtiene el nombre
	public String getNombre()
	{
		return this.primerNombre;
	}
	
	//establece el apellido
	public void setApellido(String apellido)
	{
		this.apellidoPaterno = apellido;
	}
	
	//obtiene el apellido
	public String getApellido()
	{
		return this.apellidoPaterno;
	}
	
	//establece el nss
	public void setNumeroSeguro(String nss)
	{
		this.numeroSeguroSocial = nss;
	}
	
	//obitne el nss
	public String getNumeroSeguro()
	{
		return this.numeroSeguroSocial;
	}
	
	//metodo toString
	public String toString()
	{
		return String.format("%s %s\nnumero de seguro social: %s", 
				this.getApellido(), this.getNombre(), this.getNumeroSeguro());
	}
	
	//metodo abstracto
	public abstract double ingresos();

}



