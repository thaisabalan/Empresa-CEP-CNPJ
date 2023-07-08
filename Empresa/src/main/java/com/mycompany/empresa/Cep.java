/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *"cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
      "ibge": "3550308",
      "gia": "1004",
      "ddd": "11",
      "siafi": "7107"
 * @author aluno
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Cep {
    
    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String cidade;
    public String localidade;
    public String uf;
    public int ibge;
    public int gia;
    public int ddd;
    public int siafi;

       private static String request(String cep) 
    {
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
           return json;              
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    
    }
       public void consultaCep(String cep){
        
        String resposta = request(cep);
        
        resposta = resposta.replaceAll("[{},:]", "");
        
        resposta = resposta.replaceAll("\"", "\n");        
        
        String array[] = new String[30];
        
        array = resposta.split("\n");
            
//        JOptionPane.showMessageDialog(null, array);
        
        this.setCep(cep);
        this.setLogradouro(array[7]);
        this.setCidade(array[19]);
        this.setUf(array[23]);
        this.setBairro(array[15]);          
    }

       
       
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadrouro() {
        return logradouro;
    }

    public void setLogradouro(String logadrouro) {
        this.logradouro = logadrouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

     public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getSiafi() {
        return siafi;
    }

    public void setSiafi(int siafi) {
        this.siafi = siafi;
    }
    
}
