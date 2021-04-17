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
public class GalonesLitrosConversor extends Conversor {
    
    private static final double UN_GALON = 3.79;
    
    @Override
    public String getLabelValor1() {
        
        return "Galones";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Litros";
    }
    
    @Override
    public String toString() {
        return "Galones - Litros";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        return valorAConvertir * UN_GALON;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        return valorAConvertir / UN_GALON;
    }
}
