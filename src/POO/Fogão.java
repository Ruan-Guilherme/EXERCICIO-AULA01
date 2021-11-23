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
public class Fogão {
    
    String modelo;
    String material;
    int voltage;
    int bocas;

    void impreçãoDeDadosFogão(){
        System.out.println("----------FOGÂO---------");
        System.out.println("Modelo: "+modelo);
        System.out.println("Material: "+material);
        System.out.println("voltagem: "+voltage);
        System.out.println("Bocas: "+bocas);
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getBocas() {
        return bocas;
    }

    public void setBocas(int bocas) {
        this.bocas = bocas;
    }
    
    
    
}
