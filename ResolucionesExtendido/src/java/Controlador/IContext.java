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
public interface IContext {
    public void getTraduccionMacro(String macro);
    public String getOutput();
    public void setOutput(String output);
}
