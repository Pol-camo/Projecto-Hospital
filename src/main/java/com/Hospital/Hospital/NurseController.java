package com.Hospital.Hospital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    // Método que simula la búsqueda de un enfermero por su nombre completo o de usuario
    @GetMapping("/name/{name}")
    public Nurse findByName(@PathVariable("name") String name) {
        
        // Obtenemos o simulamos la lista de enfermeros registrados
        List<Nurse> nurses = getMockNurses();

        // Buscamos el enfermero cuyo nombre completo o nombre de usuario coincida con 'name'
        for (Nurse nurse : nurses) {
            if (nurse.getNombreCompleto().equalsIgnoreCase(name) || 
                nurse.getNombreUsuario().equalsIgnoreCase(name)) {
                return nurse;
            }
        }

        // Si no se encuentra ningún enfermero, devuelve null (o podrías personalizar la respuesta)
        return null;
    }

    // Datos estáticos de prueba (simulando almacenamiento temporal/JSON)

}
