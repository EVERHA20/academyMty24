package command.comandos;

import accesorios.Radio;

public class CommandRadioOn implements Command {
	
	Radio radio;

	public CommandRadioOn(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.encender();
	}

}
