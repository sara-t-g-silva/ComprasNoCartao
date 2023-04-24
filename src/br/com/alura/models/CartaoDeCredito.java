package br.com.alura.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;

    private List<Compras> compras;

    public double getLimite() {
        return limite;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(Compras compras){

        if(this.saldo>compras.getValor()){
            this.saldo-= compras.getValor();
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
