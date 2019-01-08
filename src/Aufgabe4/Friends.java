package Aufgabe4;

import javax.swing.*;

public class Friends {

    private String name;

    public void friends()
    {
        this.name = JOptionPane.showInputDialog("Namen bitte: ");
    }
    public Friends(){}

    public Friends(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Freund ist: " + name;
    }
}
