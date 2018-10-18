package es.upm.miw;

public class Jugador {
    private String id;
    private String equipo;
    private Integer dorsal;

    public Jugador() {
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Jugador(String equipo, Integer dorsal) {
        this.equipo = equipo;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id='" + id + '\'' +
                ", equipo='" + equipo + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
}
