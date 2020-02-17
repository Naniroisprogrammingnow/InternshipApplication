package DevCampLogo;

public class Printer {
    public static void printLetterPart(int letterPart) {
        for (int i = 0; i < letterPart; i++) {
            System.out.print("*");
        }
    }

    public static void printFreeSpace(int freeSpace) {
        for (int i = 0; i < freeSpace; i++) {
            System.out.print("-");
        }
    }
}
