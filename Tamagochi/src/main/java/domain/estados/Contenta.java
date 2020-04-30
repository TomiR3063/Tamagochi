package domain.estados;

import domain.Mascota;

public class Contenta extends EstadoMascota{

    private int cantidadDeVecesJugadas;


    public Contenta(Mascota mascota){
        super(mascota);
        this.cantidadDeVecesJugadas = 0;
    }

    @Override
    public void juga() {
        cantidadDeVecesJugadas ++;
        super.mascota.incrementarNivelDeFelicidadEn(2);
        this.cambiarDeEstadoSiEsNecesario();
    }

    private void cambiarDeEstadoSiEsNecesario() {
        if (this.cantidadDeVecesJugadas > 5){
            super.mascota.cambiarEstado(new Hambrienta(super.mascota));
        }
    }

    @Override
    public void come() {
        super.mascota.incrementarNivelDeFelicidadEn(1);


    }

    @Override
    public Boolean podesJugar() {
        return true;
    }
}
