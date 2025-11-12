/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Criação de um objeto Pedido e exibição do status atual
        Pedido pedido = new Pedido();
        System.out.println("Status inicial do pedido: " + pedido.getStatus());

        // Avança o status do pedido
        pedido.avancarStatus();
        System.out.println("Status após avanço: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Status após novo avanço: " + pedido.getStatus());
    }
}
