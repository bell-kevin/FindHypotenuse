/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhypotenuse;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class FindHypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        double base, height, hypotenuse;
        System.out.print("Enter right triangle base: ");
        base = computerKeyboardInput.nextDouble();
        System.out.print("Enter right triangle height: ");
        height = computerKeyboardInput.nextDouble();
        hypotenuse = Math.sqrt(base * base + height * height);
        System.out.println("Hypotenuse length = " + hypotenuse);
    }
}
