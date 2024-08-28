package command.dispositivo;

import accesorios.*;
import command.comandos.*;

public class Configuracion {
	
	public static void configurar(ControlInteligente ci) {
		Luz luz = new Luz();
		Tv tv = new Tv();
		Radio radio = new Radio();
		
		ci.setBoton3(new CommandLuzOn(luz));
		ci.setBoton4(new CommandLuzOff(luz));
		ci.setBoton1(new CommandRadioOn(radio));
		ci.setBoton2(new CommandRadioOff(radio));
		ci.setBoton5(new CommandTvOn(tv));
		ci.setBoton6(new CommandTvOff(tv));

	}

}
