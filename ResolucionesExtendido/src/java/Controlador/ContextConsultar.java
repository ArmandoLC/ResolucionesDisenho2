/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Armando
 */


// Definiremos el ContextConsultar, que nos permitirá gestionar las
// entradas y salidas del sistema
public class ContextConsultar implements IContext{
    private String output;
    private final String nombreDirectorEscuela;
    private final String nombreCoordinador;
    private final String nombreDirectorAdmYReg;
    
    public ContextConsultar(String nombreDirectorEscuela, String nombreCoordinador, String nombreDirectorAdmYReg) {
        this.nombreDirectorEscuela = nombreDirectorEscuela;
        this.nombreCoordinador = nombreCoordinador;
        this.nombreDirectorAdmYReg = nombreDirectorAdmYReg;
        this.output = "";
    }
    
    @Override
    public void getTraduccionMacro(String macro){
        Pattern ER;
        Matcher matcher;
        
        ER = Pattern.compile("#nombreDirectorEscuela*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(nombreDirectorEscuela);
        
        ER = Pattern.compile("#nombreDirectorAdmYReg*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(nombreDirectorAdmYReg);
        
        ER = Pattern.compile("#nombreCoordinador*");
        matcher = ER.matcher(macro);
        
        output = output.concat(matcher.replaceAll(nombreCoordinador)) + " ";
    }
    
    @Override
    public String getOutput() {
        return output;
    }

    @Override
    public void setOutput(String output) {
        this.output = output;
    }
    
    
}
