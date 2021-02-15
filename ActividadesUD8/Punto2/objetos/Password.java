package objetos;

import java.util.Random;

public class Password {

	
	//ATRIBUTOS
	protected int longitud;
	protected String contrase�a;
	
	//CONSTRUCTOR POR DEFECTO
	public Password() {
		this.longitud=8;
		this.contrase�a=generarContra();
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a="";//generar una clave aleatoria
	}
	
	public int getLongitud() {
		return longitud;
	}
	public String generarContra() {
		Random r=new Random();
		String valores= "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,w,x,y,z,1,2,3,4,5,6,7,8,9,0";
		StringBuilder sb=new StringBuilder(valores);
		int tama�o=sb.length();
		
		String password="";
		
		
		for(int i=0;i<getLongitud();i++) {
			int numa=r.nextInt(tama�o)+1;
			password+=sb.charAt(numa);
		
		}
		return password;
	
	}
	
}
