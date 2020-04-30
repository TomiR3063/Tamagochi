package domain;

import domain.estados.Contenta;
import domain.estados.EstadoMascota;

public class Mascota {
    private String nombre;
    private Integer nivelDeFelicidad;
    private EstadoMascota estado;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.nivelDeFelicidad = 5;
        this.estado = new Contenta(this);
    }

    public void come(){
        this.estado.come();
    }

    public void juga(){
        this.estado.juga();
    }

    public Boolean podesJugar(){return this.estado.podesJugar();}

    public void cambiarEstado(EstadoMascota estado){
        this.estado = estado;
    }

    public void incrementarNivelDeFelicidadEn(int i) {
        this.nivelDeFelicidad+=i;
    }
}
