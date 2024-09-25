public class Main {
    public static void main(String[] args) {
        // Create an Instrument object
        Instrument instrument = new Instrument("Piano", "Percussion");
        
        // Create a Guitar object
        Guitar guitar = new Guitar("Acoustic Guitar", "String", 6);
        
        // Call play method for the instrument
        instrument.play();
        
        // Call play method for the guitar
        guitar.play();
    }
}
