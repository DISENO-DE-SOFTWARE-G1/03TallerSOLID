/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03tallersolid;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Main {
    int iva;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

    
    // solucion 1
    public class Receipt{
        public void sendReceipt(){//"Sending receipt by email..."        
        }
    }
    }

    // solucion 2
    class FisicoProduct implements fisico{
        // el resto de atributos y métodos ...
        @Override
        public void calcularPesoEnKg() {}
    }
    
    class DigitalProduct implements digital{
        // el resto de atributos y métodos ...
        @Override
        public void calcularTamañoEnBytes() {}
        }
    
    interface fisico {
        public void calcularPesoEnKg();
    }
    
    interface digital{
        public void calcularTamañoEnBytes();
    }


    // solucion 3
    abstract class Producto{
        abstract double calculateIVA();
    }
    
    class IvaCalculator{ 
        List<Producto> productos = new LinkedList();
        
        for(Producto p:productos){
            p.calculateproductosIVA(); //resto de la lógica ... 
        
        }
    }
    
    class Book extends Producto{
    @Override
    public double calculateIVA() {
        return 0; //Resto de la lógica ...
        }
    }
    
    class Clothing extends Producto{
    @Override
    public double calculateIVA() {
        return 0; //Resto de la lógica ...
        }
    }

    class Technology extends Producto{
    @Override
    public double calculateIVA() {
        return 0; //Resto de la lógica ...
        }
    }
 

}
