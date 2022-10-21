/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Retangulo {private double base;
    private double altura;
   
    public Retangulo (){
        this.base = 1;
        this.altura = 1;
    }

    public double getBase() {
        return base;
    }
   
    public double getAltura() {
        return altura;
    }
   
    public void setBase(double base) {
        if (base < 1 || base > 20){
            System.out.println("Valor para a base invalído");
            return;
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura < 1 || altura > 20){
            System.out.println("Valor para a altura invalído");
            return;
        }
        this.altura = altura;
    }
   
    public double getPerimetro(){
        return (this.altura*2)+(this.base*2);
    }
   
    public double getArea(){
        return this.altura*this.base;
    }
}
