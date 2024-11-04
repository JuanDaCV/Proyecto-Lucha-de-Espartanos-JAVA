package JDCV;  

abstract class Arma {  
    protected double dano;  

    public abstract double getDano();  
}  

class Espada extends Arma {  
    public Espada() {  
        this.dano = 0.37; // Daño adicional por espada  
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
}  

class Lanza extends Arma {  
    public Lanza() {  
        this.dano = 0.36; // Daño adicional por lanza  
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
}  

class Hacha extends Arma {  
    public Hacha() {  
        this.dano = 0.42; // Daño adicional por hacha  
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
}

class ArcoFlecha extends Arma {  
    public ArcoFlecha() {  
        this.dano = 0.35; // Daño adicional por arco  
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
} 
class MartilloGuerra extends Arma {  
    public MartilloGuerra() {  
        this.dano = 0.4; // Daño adicional por martillo  
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
} 
class Chancla extends Arma {  
    public Chancla() {  
        this.dano = 0.5; // Daño adicional por chancla 
    }  

    @Override  
    public double getDano() {  
        return dano;  
    }  
} 