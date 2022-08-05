
package idades;


public class Pessoa {
    private int age;
    private int day;
    private int month;
    private int year;
    private String name;

    
    //construtores
    public Pessoa (){
          
    }
    public Pessoa(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Pessoa (int day, int month, int year, String name){
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
        age = ageCalculator();
        
    }
    
    //métodos
    public int ageCalculator(){
        age = 2022 - year; 
        return age;
    }
    public int informAge(){
        return age;
    }
    
    public String informName(){
        return name;
    }
  
    //getter e setter 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        if (day<1 || day>31){
            System.out.println("Dia inválido");
            day = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if (month<1 || month>12){
            System.out.println("Mês invalido");
            month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year<1000){
            System.out.println("Ano inválido");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
