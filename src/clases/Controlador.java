package clases;

import java.util.Date;
import java.util.List;
import persistencia.Persistencia;

public class Controlador {

    Persistencia persistencia = new Persistencia();

    public void guardar(String raza, String edadMascota, String colorMascota, Date dateSignUpMascota, String nameMascota, String tipoMascota, String nameMen, String phoneMen, byte[] imagenMascota) {
        Duenio duenio = new Duenio();
        duenio.setNameDuenio(nameMen);
        duenio.setCelDuenio(phoneMen);

        Mascota mascota = new Mascota();
        mascota.setColor(colorMascota);
        mascota.setFechaSignUpMascota(dateSignUpMascota);
        mascota.setEdad(edadMascota);
        mascota.setNombre(nameMascota);
        mascota.setRaza(raza);
        mascota.setMascota(tipoMascota);
        mascota.setUnDuenio(duenio);
        mascota.setImagen(imagenMascota);

        persistencia.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return persistencia.traerMascotas();
    }

    public void borrarMascota(int id) {
        persistencia.borrarMascota(id);
    }

    public Mascota traerMascota(int id) {
        return persistencia.traerMascota(id);
    }

    public void modificarDatos(Mascota mascota, String raza, String edadMascota, String colorMascota, Date dateSignUpMascota, String nameMascota, String tipoMascota, String nameMen, String phoneMen, byte[] imagenMascota) {
        mascota.setEdad(edadMascota);
        mascota.setColor(colorMascota);
        mascota.setFechaSignUpMascota(dateSignUpMascota);
        mascota.setNombre(nameMascota);
        mascota.setMascota(tipoMascota);
        mascota.setImagen(imagenMascota);
        mascota.setRaza(raza);

        persistencia.modificarMascota(mascota);

        Duenio duenio = this.buscarDuenio(mascota.getUnDuenio().getIdDuenio());

        duenio.setCelDuenio(phoneMen);
        duenio.setNameDuenio(nameMen);

        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int idDuenio) {
        return persistencia.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
        persistencia.modificarDuenio(duenio);
    }
}
