package clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; 

    private String raza;
    private String nombre;
    private String color;
    private String edad;
    private String mascota;

    @OneToOne
    private Duenio unDuenio;
    
    @Lob
    private byte[] imagen;
    
    @Temporal(TemporalType.DATE)
    private Date fechaSignUpMascota;

    public Mascota() {
    }

    public Mascota(int id, String raza, String nombre, String color, String edad, String mascota, Duenio unDuenio, byte[] imagen, Date fechaSignUpMascota) {
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.mascota = mascota;
        this.unDuenio = unDuenio;
        this.imagen = imagen;
        this.fechaSignUpMascota = fechaSignUpMascota;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Date getFechaSignUpMascota() {
        return fechaSignUpMascota;
    }

    public void setFechaSignUpMascota(Date fechaSignUpMascota) {
        this.fechaSignUpMascota = fechaSignUpMascota;
    }

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
