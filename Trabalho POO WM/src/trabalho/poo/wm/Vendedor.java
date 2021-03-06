/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;

/**
 *
 * @author wilsonmielke
 */
public class Vendedor implements VendController{
    protected String nome;
    protected String sobrenome;
    protected String dataNasc;
    protected String phone;
    protected String CPF;
    protected String cidade;
    protected String estado;
    protected String pais;
    protected String endereco;
    protected int numero;
    protected String criado_em;
    private String login;
    private String senha;
    
    public Vendedor(String nome,String sn,String bd, String phone,String cpf,String cidade,String es
            ,String pa,String end, int num,String criado_em, String login,String senha, ArrayList acc){
        this.nome = nome;
        this.sobrenome =sn;
        this.CPF = cpf;
        this.estado =es;
        this.pais = pa;
        this.endereco = end;
        this.numero = num;
        this.criado_em = criado_em;
        this.phone = phone;
        this.cidade = cidade;
        this.login = login;
        this.senha = senha;
        acc.add(this);
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobre(){
        return this.sobrenome;
    }
    public String getNasc(){
       return this.dataNasc;
    }
    public String getPhone(){
       return this.phone;
    }
    public String getCPF(){
       return this.CPF;
    }
    public String getCid(){
       return this.cidade;
    }
    public String getEst(){
       return this.estado;
    }
    public String getEnd(){
       return this.endereco;
    }
    public String getPais(){
       return this.pais;
    }
    public String getCreate(){
       return this.criado_em;
    }
    public String getUser(){
        return this.login;
    }
    protected String getPass(){
        return this.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCriado_em(String criado_em) {
        this.criado_em = criado_em;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    public boolean Auth(String pass){
        return this.senha.equals(pass);
    }
    
    public void changePass(){
        System.out.println("Entre com a senha atual:");
        String t = s.next();
        if(Auth(t)){
            System.out.println("Senha atual correta!\nEntre com a nova senha!");
            t = s.next();
            this.setSenha(t);
        }else{
            System.out.println("Senha atual incorreta!");
            changePass();
        }
        
    }
}

