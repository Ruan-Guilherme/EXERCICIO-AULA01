/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class PRINCIPAL {
  
    public static void main(String[] args){
        
        Fogão fogão = new Fogão();
        
       fogão.setModelo("Tramontina");
       fogão.setMaterial("inox");
       fogão.setVoltage(220);
       fogão.setBocas(4);
       
       fogão.impreçãoDeDadosFogão();
       
       Mesa mesa = new Mesa();
       
       mesa.setModelo("Mesa de Jantar");
       mesa.setMaterial("Madeira de Carvalho");
       mesa.setTipoDeMesa("Retangular");
       mesa.setQuantosLugares(4);
       
       mesa.impreçãoDeDadosMesa();
       
       
       
    }
          
}
