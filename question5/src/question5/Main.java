package question5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a String a ser invertida: ");
        String original = input.nextLine();
        input.close();
        
        String invertida = "";
        
        for (int i = original.length()-1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        System.out.println("A String invertida �: " + invertida);

    }
}
