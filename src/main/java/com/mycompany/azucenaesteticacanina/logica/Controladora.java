
package com.mycompany.azucenaesteticacanina.logica;

import com.mycompany.azucenaesteticacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String colorPelaje,
            String alergias, String observaciones, String nombreTutor, 
            String contacto, String alergico, String especial) {
        
        
        Tutor tutor = new Tutor(); 
        tutor.setNombreTutor(nombreTutor);
        tutor.setCelTutor(contacto);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreTutor);
        masco.setRaza(raza);
        masco.setColor(colorPelaje);
        masco.setAlergico(alergias);
        masco.setObservaciones(observaciones);
        masco.setTutor(tutor);
        masco.setAlergico(alergico);
        masco.setAtenEspe(especial);
                
        
        
        controlPersis.guardar(tutor,masco);
        
        
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
        
        controlPersis.borrarMascota(numCliente);
        
    }

    

    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String colorPelaje, String alergias, String observaciones, String nombreTutor, String contacto, String alergico, String especial) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(colorPelaje);
        masco.getAlergico();
        masco.getObservaciones();
        masco.getAtenEspe();
        
        controlPersis.modificarMascota(masco);
        
        Tutor tutor = this.buscarTutor(masco.getTutor().getIdTutor());
        tutor.setCelTutor(contacto);
        tutor.setNombreTutor(nombreTutor);
        
        this.modificarTutor(tutor);
       
    }

    private Tutor buscarTutor(int idTutor) {
       return controlPersis.traerTutor(idTutor);
        
    }

    private void modificarTutor(Tutor tutor) {
        controlPersis.modifcarTutor(tutor);
    }
    
    
    
}
