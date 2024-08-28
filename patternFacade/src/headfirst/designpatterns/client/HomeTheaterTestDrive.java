package headfirst.designpatterns.client;

import headfirst.designpatterns.facade.HomeTheaterFacade;
import headfirst.designpatterns.facade.hometheater.Amplifier;
import headfirst.designpatterns.facade.hometheater.CdPlayer;
import headfirst.designpatterns.facade.hometheater.PopcornPopper;
import headfirst.designpatterns.facade.hometheater.Projector;
import headfirst.designpatterns.facade.hometheater.Screen;
import headfirst.designpatterns.facade.hometheater.StreamingPlayer;
import headfirst.designpatterns.facade.hometheater.TheaterLights;
import headfirst.designpatterns.facade.hometheater.Tuner;

public class HomeTheaterTestDrive {
	
	public static void main(String[] args) {
		
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, player, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		
		System.out.println("****************");
		
		homeTheater.endMovie();
	}
}
