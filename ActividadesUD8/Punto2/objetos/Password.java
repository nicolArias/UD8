package objetos;

import java.util.Random;

public class Password {

	
	//ATRIBUTOS
	protected int longitud;
	protected String contraseña;
	
	//CONSTRUCTOR POR DEFECTO
	public Password() {
		this.longitud=8;
		this.contraseña=generarContra();
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña="";//generar una clave aleatoria
	}
	
	public int getLongitud() {
		return longitud;
	}
	public String generarContra() {
		Random r=new Random();
		String valores= "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,w,x,y,z,1,2,3,4,5,6,7,8,9,0";
		StringBuilder sb=new StringBuilder(valores);
		int tamaño=sb.length();
		
		String password="";
		
		
		for(int i=0;i<getLongitud();i++) {
			int numa=r.nextInt(tamaño)+1;
			password+=sb.charAt(numa);
		
		}
		return password;
	
	}
	
}
