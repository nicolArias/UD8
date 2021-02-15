package objetos;

public class Persona {
	
	//CONSTANTES
	protected final char SEXO_CONST='M';
	
	//ATRIBUTOS
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String DNI;
	protected char sexo;
	protected double peso;
	protected double altura;
	
	//CONSTRUCTOR POR DEFECTO A EXCEPCION DEL DNI
	public Persona() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.sexo=SEXO_CONST;
		this.peso=0;
		this.altura=0;
	}
	
	//CONSTRUCTOR CON EL NOMBRE, EDAD Y SEXO, EL RESTO POR DEFECTO
	public Persona(String nombre,int edad,char sexo) {
		this.nombre=nombre;
		this.apellido="";
		this.edad=edad;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre,String apellido,int edad, String DNI,char sexo,double peso,double altura) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
}
