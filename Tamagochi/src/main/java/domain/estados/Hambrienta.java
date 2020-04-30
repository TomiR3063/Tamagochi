package domain.estados;

import domain.Mascota;

public class Hambrienta extends EstadoMascota {

    public Hambrienta(Mascota mascota) {
        super(mascota);
    }

    @Override
    public void juga() {

    }
    @Override
    public void come() {
        super.mascota.cambiarEstado(new Contenta(super.mascota));
    }

    @Override
    public Boolean podesJugar() {
        return false;
    }
}
