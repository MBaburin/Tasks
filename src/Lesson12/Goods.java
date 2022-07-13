package Lesson12;

import java.time.LocalDate;

public class Goods {
    int id;
    String name;
    int prise;

    LocalDate date = LocalDate.now();



    Goods(int id, String name, int prise){
        this.id = id;
        this.name = name;
        this.prise = prise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
