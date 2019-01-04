package Aufgabe4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Neue Array List erstellt mit dem Datentyp Friends
        List<Friends> friends = new ArrayList<>();

        for (int j = 1;j<=5;j++)
        {
            //5 Freunde vom Typ "Friends" werden Hinzugefügt.
            friends.add(new Friends(JOptionPane.showInputDialog(null,"Geben sie den Namen des " + j + " Freundes ein: ")));
        }

        for (int i = 0;i<5;i++ )
        {
            //Die Liste wird mittels for-schleife ausgegeben.
            System.out.println("Der Name des " + (i+1) + " Freundes ist: " + friends.get(i).toString());
        }
    }
}
