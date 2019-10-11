package com.shadowdrone.abmpersona.excepciones;

import com.shadowdrone.abmpersona.Persona;

/**
 * PersonaInfoException
 */
public class PersonaInfoException extends Exception {

    private Persona persona;
    public PersonaInfoException(Persona p, String mensaje) {
        
        super(p.getNombre()+":"+ mensaje);
        this.persona = p;
    }
}
