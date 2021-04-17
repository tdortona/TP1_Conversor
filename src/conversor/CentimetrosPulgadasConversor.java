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
public class CentimetrosPulgadasConversor extends Conversor {

    private static final double UNA_PULGADA = 2.54;
    
    @Override
    public String getLabelValor1() {
        
        return "Centímetros";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Pulgadas";
    }
    
    @Override
    public String toString() {
        return "Centímetros - Pulgadas";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        return valorAConvertir / UNA_PULGADA;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        return valorAConvertir * UNA_PULGADA;
    }
}
