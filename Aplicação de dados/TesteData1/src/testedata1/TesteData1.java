/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testedata1;

/**
 *
 * @author unifysouza
 */
public class TesteData1 {

   
    public static void main(String[] args) {
       Data d1 = new Data(){
            d1.setMes(08);
            d1.setDia(02);
            d1.setAno(2003)
       }
       Data d2 = new Data("Março", 02, 2019){
           d2.setMes("Março");
           d2.setDia(02);
           d2.setAno(2019)
       }
       Data d3 = new Data(29, 2016){
           d3.setDia(210);
           d3.setAno(1990);
       }
        
    }
    
}
