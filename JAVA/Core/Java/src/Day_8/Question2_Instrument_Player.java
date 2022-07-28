/**
 2. Create an abstract class Instrument which has the abstract function play.
 Create three more subclasses from Instrument which are Piano, Flute, Guitar.
 Override the play method inside all three classes printing a message.
 "Piano is playing tan tan tan tan" for Piano class "Flute is playing toot toot toot toot"
 for Flute class "Guitar is playing tin tin tin" for Guitar class
 */

package Day_8;

import java.util.Scanner;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {

    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {

    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {

    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class Question2_Instrument_Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instrument[] instruments = new Instrument[10];
        System.out.println("Playing instruments ");
        for(int i=0; i < 10; i++){
            int input = (int)(Math.random()*100);
            if(input >= 0 && input <=33) {
                instruments[i] = new Piano();
                instruments[i].play();
            }
            else if(input >= 34 && input <= 66) {
                instruments[i] = new Flute();
                instruments[i].play();
            }
            else if(input >= 67 && input <=100) {
                instruments[i] = new Guitar();
                instruments[i].play();
            }
        }
    }
}

/*
Output

Playing instruments
Piano is playing tan tan tan tan
Flute is playing toot toot toot toot
Guitar is playing tin tin tin
Guitar is playing tin tin tin
Piano is playing tan tan tan tan
Flute is playing toot toot toot toot
Piano is playing tan tan tan tan
Piano is playing tan tan tan tan
Flute is playing toot toot toot toot
Flute is playing toot toot toot toot

 */