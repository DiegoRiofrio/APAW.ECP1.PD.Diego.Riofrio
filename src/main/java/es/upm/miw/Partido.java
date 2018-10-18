package es.upm.miw;

import java.time.LocalDateTime;

public class Partido {

    private String id;
    private LocalDateTime date;
    private String equipoLocal;
    private String equipoVisitante;

    public Partido() {
    }

    public Partido(LocalDateTime date, String equipoLocal, String equipoVisitante) {
        this.date = date;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                '}';
    }
}
