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
public class CentimetrosMetrosConversor extends Conversor {
    
    public static final int UN_METRO = 100;

    @Override
    public String getLabelValor1() {
        
        return "Centímetros";
    }

    @Override
    public String getLabelValor2() {
        
        return "Metros";
    }
    
    @Override
    public String toString() {
        return "Centímetros - Metros";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        
        return valorAConvertir / UN_METRO;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        
        return valorAConvertir * UN_METRO;
    }
}
