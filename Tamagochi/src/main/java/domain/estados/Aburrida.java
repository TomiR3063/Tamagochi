package domain.estados;

import domain.Mascota;

import java.time.Duration;
import java.time.LocalTime;

public class Aburrida extends EstadoMascota {
    private LocalTime horaInicio;

    public Aburrida(Mascota mascota) {
        super(mascota);
        this.horaInicio = LocalTime.now();
    }

    @Override
    public void juga() {
        super.mascota.cambiarEstado(new Contenta(super.mascota));

    }

    @Override
    public void come() {
        if(this.haceMuchoEstaAburrida()){
            super.mascota.cambiarEstado(new Contenta(super.mascota));
        }

    }

    private boolean haceMuchoEstaAburrida() {
        LocalTime ahora = LocalTime.now();
        long diferencia = Duration.between(horaInicio, ahora).toMinutes();
        return diferencia > 80;
    }

    @Override
    public Boolean podesJugar() {
        return true;
    }
}
