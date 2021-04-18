package conversor.base;

public abstract class Conversor {
    
    public abstract String getLabelValor1();
    public abstract String getLabelValor2();
    public abstract Double convertirValor1AValor2(Double valorAConvertir);
    public abstract Double convertirValor2AValor1(Double valorAConvertir);
    
    @Override
    public String toString() {
        return "Conversor{" + '}';
    }
}
