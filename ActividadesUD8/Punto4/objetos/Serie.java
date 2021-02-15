package objetos;

public class Serie {

	//ATRIBUTOS
	protected String titulo;
	protected int numeroTemp;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//CONSTRUCTOR POR DEFECTO
	public Serie() {
		this.titulo="";
		this.numeroTemp=3;
		this.entregado=false;
		this.genero="";
		this.creador="";
	}
	
	//CONSTRUCTOR QUE RECIBE TITULO Y CREADOR
	public Serie(String titulo,String creador) {
		this.titulo=titulo;
		this.numeroTemp=3;
		this.entregado=false;
		this.genero="";
		this.creador=creador;
	}
	
	//CONSTRUCTOR QUE RECIBA TODOS LOS PARAMETROS EXCEPTO ENTREGADO
	public Serie(String titulo,int numTemp,String genero,String creador) {
		this.titulo=titulo;
		this.numeroTemp=numTemp;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}
}
