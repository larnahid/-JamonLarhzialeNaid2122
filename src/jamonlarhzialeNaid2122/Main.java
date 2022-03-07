/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamonlarhzialeNaid2122;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonLarhzialeNaid2122 miJamonLarhzialeNaid2122;
        int stockActual;
        
        miJamonLarhzialeNaid2122 = new JamonLarhzialeNaid2122("5Jotas",580,100);
        vendeJamLarhzialeNaid2122(miJamonLarhzialeNaid2122);
        
        compraJamLarhzialeNaid2122(miJamonLarhzialeNaid2122);
        stockActual = miJamonLarhzialeNaid2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamLarhzialeNaid2122(JamonLarhzialeNaid2122 miJamonLarhzialeNaid2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonLarhzialeNaid2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamLarhzialeNaid2122(JamonLarhzialeNaid2122 miJamonLarhzialeNaid2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonLarhzialeNaid2122.vender(80, Espana);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
