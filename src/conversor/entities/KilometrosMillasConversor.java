package conversor.entities;

import conversor.base.Conversor;

public class KilometrosMillasConversor extends Conversor {
    
    private static final double UNA_MILLA = 1.61;
    
    @Override
    public String getLabelValor1() {
        
        return "Kilómetros";
    }
    
    @Override
    public String getLabelValor2() {
        
        return "Millas";
    }
    
    @Override
    public String toString() {
        return "Kilómetros - Millas";
    }

    @Override
    public Double convertirValor1AValor2(Double valorAConvertir) {
        return valorAConvertir / UNA_MILLA;
    }

    @Override
    public Double convertirValor2AValor1(Double valorAConvertir) {
        return valorAConvertir * UNA_MILLA;
    }
}
