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
public class Mesa {
    
    String material;
    String modelo;
    String TipoDeMesa;
    int QuantosLugares ;

    
    void impreçãoDeDadosMesa() {
       System.out.println("----------MESA---------");
        System.out.println("Modelo: "+modelo);
        System.out.println("Material: "+material);
        System.out.println("Tipo De Mesa: "+TipoDeMesa);
        System.out.println("Quantos Lugares: "+QuantosLugares);
}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeMesa() {
        return TipoDeMesa;
    }

    public void setTipoDeMesa(String TipoDeMesa) {
        this.TipoDeMesa = TipoDeMesa;
    }

    public int getQuantosLugares() {
        return QuantosLugares;
    }

    public void setQuantosLugares(int QuantosLugares) {
        this.QuantosLugares = QuantosLugares;
    }
    
    
    

            
    
    
}
