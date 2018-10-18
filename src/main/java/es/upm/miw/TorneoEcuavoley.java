package es.upm.miw;

import java.time.LocalDateTime;

public class TorneoEcuavoley {

    private String id;
    private String place;
    private LocalDateTime date;

    public TorneoEcuavoley() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TorneoEcuavoley(String place, LocalDateTime date){
        this.date = date;
        this.place = place;
    }

    @Override
    public String toString() {
        return "TorneoEcuavoley{" +
                "id='" + id + '\'' +
                ", place='" + place + '\'' +
                ", date=" + date +
                '}';
    }
}
