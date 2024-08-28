package comandos;

import accesorios.Tv;

public class CommandTvPause implements Command {
	
	Tv tv;

	public CommandTvPause(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.activatePause();;
	}

	@Override
	public void undo() {
		tv.desactivatePause();
	}

}
