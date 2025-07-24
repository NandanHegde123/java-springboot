package org.example;



import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tabbble {

    @Id
    private int tid;
    //@Column(name = "table_name")
    private String tname;
    //@Transient//doesnt put column in database
    private String tech;
    @OneToMany
    private List<Laptop> laptops;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Tabbble{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
