/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_bridge;

import java.util.Scanner;

/**
 *
 * @author Ricardo Carmona
 */
public class FormAppletImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dibujaTexto(String texto) {
        System.out.println("Applet: " + texto);
    }

    @Override
    public String administraZonaIndicada() {
        return reader.next();
    }
}
