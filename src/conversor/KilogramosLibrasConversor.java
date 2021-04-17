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
public class KilogramosLibrasConversor extends Conversor {
    
    private static final double UN_KILOGRAMO = 2.2;
    
    @Override
    public String getLabelValor1() {
        
        return "Kilogramos";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Libras";
    }
    
    @Override
    public String toString() {
        return "Kilogramos - Libras";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        return valorAConvertir * UN_KILOGRAMO;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        return valorAConvertir / UN_KILOGRAMO;
    }
}
