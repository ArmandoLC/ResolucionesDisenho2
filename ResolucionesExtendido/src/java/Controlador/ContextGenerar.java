/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTOs.DTOSolicitud;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Armando
 */

// EDefiniremos el ContextConsultar, que nos permitirá gestionar las
// entradas y salidas del sistema
public class ContextGenerar implements IContext{

    private String output;
    private final DTOSolicitud dtoSolicitud;
    
    public ContextGenerar(DTOSolicitud dtoSolicitud) {
        this.output = "";
        this.dtoSolicitud = dtoSolicitud;
    }
    
    @Override
    public void getTraduccionMacro(String macro) {
        Pattern ER;
        Matcher matcher;

        ER = Pattern.compile("#idSolicitud*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getId()));
        
        ER = Pattern.compile("#fecha*");
        matcher = ER.matcher(macro);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        macro = matcher.replaceAll(df.format(dtoSolicitud.getFecha()));
        
        ER = Pattern.compile("#idSolicitante*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getIdSolicitante()));
        
        ER = Pattern.compile("#nombreSolicitante*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getNombreSolicitante()));

        ER = Pattern.compile("#periodo*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getPeriodo()));
        
        ER = Pattern.compile("#codigoCurso*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getCodigoCurso()));
        
        ER = Pattern.compile("#nGrupo*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getnGrupo()));
        
        ER = Pattern.compile("#idAfectado*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getIdAfectado()));
        
        ER = Pattern.compile("#nombreAfectado*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getNombreAfectado()));
        
        ER = Pattern.compile("#correoAfectado*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getCorreoAfectado()));
        
        ER = Pattern.compile("#telefonoAfectado*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getTelefonoAfectado()));
        
        ER = Pattern.compile("#inconsistencia*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getInconsistencia()));
        
        ER = Pattern.compile("#descripcionDetallada*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getDescripcionDetallada()));
        
        ER = Pattern.compile("#rutaArchivoAdjunto*");
        matcher = ER.matcher(macro);
        macro = matcher.replaceAll(String.valueOf(dtoSolicitud.getRutaArchivoAdjunto()));
        
        output =output.concat(macro) + " ";
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
