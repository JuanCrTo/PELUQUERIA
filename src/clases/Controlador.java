package clases;

import persistencia.Persistencia;

public class Controlador {
    Persistencia persistencia = new Persistencia();

    public void guardar(String edadMascota, String colorMascota, String dateBirthMascota, String nameMascota, String razaMascota, String nameMen, String phoneMen) {
        Duenio duenio = new Duenio();
        duenio.setNameDuenio(nameMen);
        duenio.setCelDuenio(phoneMen);
        
        Mascota mascota = new Mascota();
        mascota.setColor(colorMascota);
        mascota.setDateBirth(dateBirthMascota);
        mascota.setEdad(edadMascota);
        mascota.setNombre(nameMascota);
        mascota.setRaza(razaMascota);
        
        persistencia.guardar(duenio,mascota);
    }
}
