package cliente;

import accesorios.Luz;
import accesorios.Tv;
import comandos.*;
import dispositivo.*;

public class Principal2 {

	public static void main(String[] args) {
		
		System.out.println("Sin archivo Configuración");
		
		Luz luz = new Luz();
		Tv tv = new Tv();

		ControlInteligente control = new ControlInteligente();
		
		control.setBoton1(new CommandTvOn(tv));
		control.setBoton2(new CommandTvOff(tv));
		control.setBoton3(new CommandLuzOn(luz));
		control.setBoton4(new CommandTvPause(tv));
		
		
		control.clickBoton1();
		control.clickBoton3();
		
		control.clickBoton2();
		control.clickBoton4();
		
		control.clickBotonUndo();


		
	}

}
