/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_bridge;

/**
 *
 * @author Ricardo Carmona
 */
public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

    public FormularioMatriculacionEspaña(FormularioImpl implementacion) {
        super(implementacion);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }
}
