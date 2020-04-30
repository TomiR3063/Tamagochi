package domain.estados;

import domain.Mascota;

public abstract class EstadoMascota {
    protected Mascota mascota;

    public EstadoMascota(Mascota mascota){
        this.mascota = mascota;
    }

    public abstract void juga();
    public abstract void come();
    public abstract Boolean podesJugar();
}
