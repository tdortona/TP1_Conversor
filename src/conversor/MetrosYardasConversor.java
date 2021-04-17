/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author tdortona
 */
public class MetrosYardasConversor extends Conversor {
    
    public static final Double UNA_YARDA = 0.91;

    @Override
    public String getLabelValor1() {
        
        return "Metros";
    }

    @Override
    public String getLabelValor2() {
        
        return "Yardas";
    }
    
    @Override
    public String toString() {
        return "Metros - Yardas";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        
        return valorAConvertir / UNA_YARDA;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        
        return valorAConvertir * UNA_YARDA;
    }
    
}
