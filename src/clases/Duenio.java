package clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    
    private String nameDuenio, celDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nameDuenio, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nameDuenio = nameDuenio;
        this.celDuenio = celDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNameDuenio() {
        return nameDuenio;
    }

    public void setNameDuenio(String nameDuenio) {
        this.nameDuenio = nameDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
}
