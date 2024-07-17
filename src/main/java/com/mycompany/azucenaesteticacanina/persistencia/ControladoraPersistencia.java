
package com.mycompany.azucenaesteticacanina.persistencia;

import com.mycompany.azucenaesteticacanina.logica.Mascota;
import com.mycompany.azucenaesteticacanina.logica.Tutor;
import com.mycompany.azucenaesteticacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    TutorJpaController tutorJpa = new TutorJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Tutor tutor, Mascota masco) {
        
        //tutor en bd
        tutorJpa.create(tutor);
        
        //masco en bd
        mascoJpa.create(masco);
        
    }

    public List<Mascota> traerMascotas() {
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int numCliente) {
    
        try {
            mascoJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int numCliente) {
        return mascoJpa.findMascota(numCliente);
        
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tutor traerTutor(int idTutor) {
        return tutorJpa.findTutor(idTutor);
        
    }

    public void modifcarTutor(Tutor tutor) {
        try {
            tutorJpa.edit(tutor);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
}
