package command.comandos;

import accesorios.Radio;

public class CommandRadioOff implements Command {
	
	Radio radio;

	public CommandRadioOff(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.apagar();
	}

}
