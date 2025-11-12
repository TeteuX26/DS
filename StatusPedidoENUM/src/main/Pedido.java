/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mathe
 */
public class Pedido {

    private StatusPedido status; // atributo do tipo Enum

    // Construtor inicializa o pedido como NOVO
    public Pedido() {
        this.status = StatusPedido.NOVO;
    }

    // Método que retorna o status atual
    public StatusPedido getStatus() {
        return status;
    }

    // Método que avança o status do pedido conforme o fluxo
    public void avancarStatus() {
        switch (status) {
            case NOVO:
                status = StatusPedido.PROCESSANDO;
                break;
            case PROCESSANDO:
                status = StatusPedido.ENVIADO;
                break;
            case ENVIADO:
                status = StatusPedido.ENTREGUE;
                break;
            case ENTREGUE:
                System.out.println("O pedido já foi entregue.");
                break;
            case CANCELADO:
                System.out.println("O pedido foi cancelado e não pode ser alterado.");
                break;
        }
    }
}
