package Aufgabe5;

public class Student {
    private int martikelnummer;
    private String name;
    private int jahrgang;


    @Override
    public String toString() {
        return "Student{" +
                "martikelnummer = " + martikelnummer +
                ", name = '" + name + '\'' +
                ", jahrgang = " + jahrgang +
                '}';
    }

    public Student() {

    }

    public Student(int martikelnummer, String name, int jahrgang) {
        this.martikelnummer = martikelnummer;
        this.name = name;
        this.jahrgang = jahrgang;
    }

    public int getMartikelnummer() {
        return martikelnummer;
    }

    public void setMartikelnummer(int martikelnummer) {
        this.martikelnummer = martikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}
