package Aufgabe3;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array100 = new int[100];

        for (int i = 0;i<array100.length;i++)
        {
            Random random = new Random();
            int rnumber = random.nextInt(1000) +1;
            array100[i] = rnumber;
        }
        //mit "a" wird das Array Feld ausgewählt
        //mit "b" wird das Array Feld befüllt

        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Welche Array Feld wollen Sie ändern?"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Das Array " + a + " hat den Wert: " + array100[a] + ".\nGeben Sie nun den neuen Wert ein: "));
        array100[a] = b;
        JOptionPane.showMessageDialog(null,"Das Array Feld " + a + " wurde erfolgreich geändert. \nDer aktuelle Wert ist: " + array100[a]);
    }
}
