package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arraysize = Integer.parseInt(JOptionPane.showInputDialog(null,"Wie groß soll Ihre Array sein?"));

        int[] nutzerarray = new int[arraysize];

        for (int i = 0;i<nutzerarray.length;i++)
        {
            Random rand = new Random();
            int rnumber = rand.nextInt(1000) + 1;

            nutzerarray[i]= rnumber;
            System.out.println("Array: "+ i + " " +  nutzerarray[i]);
        }

        System.out.println("_____________________________________________________");;

        //-1 weil das Array bei 0 beginnt. Ansonsten würde das erst Array auf der 0 Stelle nicht ausgegeben werden.
        for (int j = nutzerarray.length-1;j>=0;j--)
        {

            System.out.println("Array: " + j + " " + nutzerarray[j]);
        }
    }
}
