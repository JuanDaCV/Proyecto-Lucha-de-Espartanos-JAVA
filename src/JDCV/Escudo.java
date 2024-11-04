package JDCV;  

class Escudo {  
    private static final double REDUCCION_DANO = 0.45; // Reducir daño en un 45%  

    public double aplicarReduccion(double dano) {  
        return (double) (dano * (1 - REDUCCION_DANO));  
    }  
}