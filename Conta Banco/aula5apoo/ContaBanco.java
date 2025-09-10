/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5apoo;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual()
    {
        System.out.println("-----------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status "+ this.isStatus());
    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean isStatus() {
        return this.status;
    }
    
    
    
    public  void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (tipo== "CC"){
            this.setSaldo(50);
        }
        else if(t == "CP"){
           this. setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() ==0){
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
        else if(this.getSaldo() >0){
            System.out.println("Conta com dinheiro");
        }
        else{
            System.out.println("Conta em debito");
        }
    }
    public void depositar(float v){
        if(this.isStatus()== true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso "+ this.getDono());
        }
        else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if(this.isStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC")
        {
            v = 12;
        }
        else if (this.getTipo()== "CP")
        {
            v = 20;
        }
        if (this.isStatus())
         {
            this.setSaldo(this.getSaldo()-v);
           
        }
        else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
