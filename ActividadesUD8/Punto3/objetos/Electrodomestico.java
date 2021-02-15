package objetos;

public class Electrodomestico {
	
	//CONSTANTES
	protected final String COLOR_CONST="Blanco";
	protected final char CONSUMOE_CONST='F';
	protected final double PRECIOB_CONST=100;
	protected final double PESO_CONST=5;
	
	//ATRIBUTOS
	protected double precioBase;
	protected String color;
	protected char consumoE;
	protected double peso;
	
	
	//Lista de colores
	String colores[]= {"blanco","negro","rojo","azul","gris"};
	
	//CONSTRUCTOR POR DEFECTO
	public Electrodomestico() {
		this.precioBase=PRECIOB_CONST;
		this.color=COLOR_CONST;
		this.consumoE=CONSUMOE_CONST;
		this.peso=PESO_CONST;
	}
	
	//CONSTRUCTOR QUE RECIBA PRECIO Y PESO, LO DEMÁS POR DEFECTO
	public Electrodomestico(double preciob,double peso) {
		this.precioBase=preciob;
		this.color=COLOR_CONST;
		this.consumoE=CONSUMOE_CONST;
		this.peso=PESO_CONST;
	}
	
	//CONSTRUCTOR QUE RECIBA TODOS LOS ATRIBUTOS
	public Electrodomestico(double preciob,String color,char consumoE,double peso) {
		this.precioBase=preciob;
		this.color=color;
		this.consumoE=consumoE;
		this.peso=peso;
		
	}
}
