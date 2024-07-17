
package com.mycompany.azucenaesteticacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTutor;
    private String nombreTutor; 
    private String celTutor;

    public Tutor() {
    }

    public Tutor(int idTutor, String nombreTutor, String celTutor) {
        this.idTutor = idTutor;
        this.nombreTutor = nombreTutor;
        this.celTutor = celTutor;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getCelTutor() {
        return celTutor;
    }

    public void setCelTutor(String celTutor) {
        this.celTutor = celTutor;
    }
    
    
}
