/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polivoto.main;

import com.polivoto.vistas.Acceso;
import com.polivoto.vistas.AnalistaD;
import com.polivoto.vistas.Consultor;

/**
 *
 * @author azaraf
 */
public class BackBone {

    private Acceso acceso;
    
    public BackBone() {
        acceso = new Acceso(this);
    }
    
    public void iniciarSesion(){
        acceso.setVisible(true);
    }
    
    public void iniciarAnalista(){
        AnalistaD analista = new AnalistaD(this);
        analista.iniciar();
    }
    
    public void iniciarConsultor(){
        Consultor consultor = new Consultor(this);
        consultor.iniciar();
    }
}
