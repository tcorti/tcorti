import Lego.Ladrillito;


public class Prueba {

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ladrillito uno;
       Ladrillito dos;
       
       uno = new Ladrillito();
       uno.setAlto(1.2f);
       uno.setAncho(1);
       uno.setLargo(4);
       uno.setColor("Rojo");
       dos = uno;
      uno.muestraLadrillito();
       
	}
 
}
