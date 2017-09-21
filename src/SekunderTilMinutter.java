import java.util.Scanner;

public class SekunderTilMinutter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antal Sekunder");
        int IndsatSekunder;
        IndsatSekunder =input.nextInt();
        int Minutter;
        Minutter =(IndsatSekunder / 60);
        int Sekunder;
        Sekunder =(IndsatSekunder % 60);
                System.out.println(IndsatSekunder + " Lig med " + Minutter + " Minutter " + Sekunder + " Sekunder");
    }
}
