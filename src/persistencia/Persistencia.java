package persistencia;

import clases.Duenio;
import clases.Mascota;

public class Persistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        //Crear dueño y mascota en la BD
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }
}
