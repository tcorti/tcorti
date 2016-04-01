package Lego;

public class Ladrillito {

	private int ancho;
	private int largo;
	private String color;
	private float alto;
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	
	
	public void muestraLadrillito(){
	System.out.println("Ladrillito");
	System.out.println("Alto  :"+this.getAlto());
	System.out.println("Largo  :"+this.getLargo());
	System.out.println("Color  :"+this.getColor());
	System.out.println("Ancho  :"+this.getAncho());
}
}
