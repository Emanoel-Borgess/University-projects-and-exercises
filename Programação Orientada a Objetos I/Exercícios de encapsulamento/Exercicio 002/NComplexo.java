package br.main.appncomplexo;

/**
 *
 * @author Emanoel Borges
 */
public class NComplexo {
    private Double real;
    private Double img;

    public Double getImg() {
        return img;
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public void setImg(Double img) {
        this.img = img;
    }
    public NComplexo(){
        real = 0.0;
        img = 0.0;
    }
    public NComplexo(Double real, Double img){
        this.real = real;
        this.img = img;
    }
    public Double Modulo(){
        return Math.sqrt(Math.pow(real, 2)+Math.pow(img, 2));
    }
    public Double argumento(){
        return Math.toDegrees(Math.atan(img/real));
    }
    public NComplexo soma(NComplexo n){
        NComplexo soma = new NComplexo();
        soma.real = real + n.real;
        soma.img = img + n.img;
        return soma;
    }
    public NComplexo subtracao(NComplexo n){
        NComplexo sub = new NComplexo();
        sub.real = real - n.real;
        sub.img = img - n.img;
        return sub;
    }
    
    public void printComplexo(){
        System.out.println("Real: "+real);
        System.out.println("Imaginario: "+img);
    }
}
