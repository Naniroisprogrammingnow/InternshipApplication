package DevCampLogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desired base width: ");
        int n = Integer.parseInt(scanner.nextLine());
        try {
            Logo logo = new MentorMateLogo(n);
            logo.execute();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
