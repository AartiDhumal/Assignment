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

public class Instrument_Player {
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