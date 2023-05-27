// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (Colours colour:Colours.values()) {
            System.out.println(colour.toString());
            System.out.println(colour.convertRGBtoHEX());
        }
    }
}