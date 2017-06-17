/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/**
 *
 * @author Armando
 */
public class InterpreteTerminal implements Expresion{
    
    private final String macro;
    
    public InterpreteTerminal(String macro) {
        this.macro = macro;
    }
    
    @Override
    public void interpretar(IContext context) {
        context.getTraduccionMacro(macro);
    }
}
