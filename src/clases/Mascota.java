package clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;  // Nuevo campo para la clave primaria

    private String raza;
    private String nombre;
    private String dateBirth;
    private String color;
    private String edad;
    private String mascota;
    
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int id, String raza, String nombre, String dateBirth, String color, String edad, String mascota, Duenio unDuenio) {
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
        this.dateBirth = dateBirth;
        this.color = color;
        this.edad = edad;
        this.mascota = mascota;
        this.unDuenio = unDuenio;
    }
    
    
    
    
    
    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
}
