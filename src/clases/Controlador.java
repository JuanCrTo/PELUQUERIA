package clases;

import java.util.List;
import persistencia.Persistencia;

public class Controlador {
    Persistencia persistencia = new Persistencia();

    public void guardar(String raza, String edadMascota, String colorMascota, String dateBirthMascota, String nameMascota, String Mascota, String nameMen, String phoneMen) {
        Duenio duenio = new Duenio();
        duenio.setNameDuenio(nameMen);
        duenio.setCelDuenio(phoneMen);
        
        Mascota mascota = new Mascota();
        mascota.setColor(colorMascota);
        mascota.setDateBirth(dateBirthMascota);
        mascota.setEdad(edadMascota);
        mascota.setNombre(nameMascota);
        mascota.setRaza(raza);
        mascota.setMascota(Mascota);
        mascota.setUnDuenio(duenio);
        
        persistencia.guardar(duenio,mascota);
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

    public void modificarDatos(Mascota mascota, String edadMascota, String colorMascota, String dateBirthMascota, String nameMascota, String tipoMascota, String nameMen, String phoneMen, String raza) {
        mascota.setEdad(edadMascota);
        mascota.setColor(colorMascota);
        mascota.setDateBirth(dateBirthMascota);
        mascota.setNombre(nameMascota);
        mascota.setMascota(tipoMascota);
        
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
