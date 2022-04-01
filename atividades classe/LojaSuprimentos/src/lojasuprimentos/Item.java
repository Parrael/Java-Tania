/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojasuprimentos;

/**
 *
 * @author aluno
 */
public class Item {
    private String code;
    private String desc;
    private int quant;
    private float price;

    //costrutores
    public Item (){
        code = "";
        desc = "";
        quant = 0;
        price = 0;
    }
    
    //método ou função
    public double getTotal(){
        double total;
        total = this.quant*this.price; 
        return total; 
    }
    
    
    //gets e sets
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuant() {
        if (quant<0){
            System.out.println("Erro");
        quant = 0;
        }
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
