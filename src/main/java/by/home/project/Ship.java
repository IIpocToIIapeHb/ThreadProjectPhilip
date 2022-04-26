package by.home.project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ship implements Runnable{

    private int id;
    private boolean loaded;

    public Ship(int id, boolean loaded) {
        this.id = id;
        this.loaded = loaded;
    }

    public Ship(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", loaded=" + loaded +
                '}';
    }
}
