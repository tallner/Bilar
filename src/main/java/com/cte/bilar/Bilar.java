package com.cte.bilar;

public class Bilar {
    private int id;
    private static int num = 0;



    private String namn;
    private String modell;
    private String color;
    private int year;
    private boolean radioRunning;
   



    public Bilar() {
        id = num++;
    }


    public Bilar(String namn, String modell, String color, int year) {
        
        this.namn = namn;
        this.modell = modell;
        this.color = color;
        this.year = year;
      
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return this.namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getModell() {
        return this.modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namn='" + getNamn() + "'" +
            ", modell='" + getModell() + "'" +
            ", color='" + getColor() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }


    
}
