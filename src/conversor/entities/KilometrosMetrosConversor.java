package conversor.entities;

import conversor.base.Conversor;

public class KilometrosMetrosConversor extends Conversor {
    
    private static final double UN_KILOMETRO = 1000;
    
    @Override
    public String getLabelValor1() {
        
        return "Kilómetros";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Metros";
    }
    
    @Override
    public String toString() {
        return "Kilómetros - Metros";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        return valorAConvertir * UN_KILOMETRO;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        return valorAConvertir / UN_KILOMETRO;
    }
}
