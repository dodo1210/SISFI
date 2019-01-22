/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafinanceiro;

/**
 *
 * @author douglas
 */
public class Valores {
    
    private int dia,mes,id;
    private String tipo,descricao;
    private float valor;
    
    public Valores(){
        
    }
    
    public Valores(String descricao,String tipo,int dia, int mes,float valor,int id){
        
        dia = this.dia;
        mes = this.mes;
        tipo = this.tipo;
        descricao = this.descricao;
        valor = this.valor;
        
    }
    
    public Valores(int id){
        
        dia = this.dia;
        
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
