package conversor.entities;

import conversor.base.Conversor;

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
