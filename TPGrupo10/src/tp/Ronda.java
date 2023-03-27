package tp;

import java.util.ArrayList;

public class Ronda {

    private String nombre;
    private ArrayList<Partido> partidos;




//constructor

    public Ronda(String nombre, ArrayList<Partido> partidos) {
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }


// setters and getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
}