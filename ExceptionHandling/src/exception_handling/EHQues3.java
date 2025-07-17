package exception_handling;

import java.util.Scanner;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Veena is playing...");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Saxophone is playing...");
    }
}

public class EHQues3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable instrument;

        System.out.println("Choose an instrument to play:");
        System.out.println("1. Veena");
        System.out.println("2. Saxophone");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Veena veena = new Veena();
            veena.play(); 
            instrument = veena;
        } else if (choice == 2) {
            Saxophone sax = new Saxophone();
            sax.play(); 
            instrument = sax; 
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        System.out.println("Playing again using Playable reference:");
        instrument.play();

        scanner.close();
    }
}
