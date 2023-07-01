package sp.senai.br.poo;

public class Volume {

    
    
    private double altura;
    
    private double comprimento;

    private double largura;
    
    private double volume;

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double getComprimento() {
        return comprimento;
    }
    
     public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    

    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getVolume() {
        return comprimento * largura * altura;
    }
    
    


}
