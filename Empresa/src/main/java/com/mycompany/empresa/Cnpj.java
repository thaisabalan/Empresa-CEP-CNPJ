/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *{"id":41, int
 * "numero_de_inscricao":"00776574000156", int
 * "tipo":"FILIAL", string
 * "abertura":"22\/08\/1995",int
 * "nome":"AMERICANAS S.A.",string
 * "fantasia":"********",string
 * "atividade_principal_nome":"Com\u00e9rcio varejista de outros produtos n\u00e3o especificados anteriormente",string
 * "atividade_principal_code":"47.89-0-99",int
 * "natureza_juridica":"204-6 - Sociedade An\u00f4nima Aberta",string
 * "logradouro":"R HENRY FORD",string
 * "numero":"643",int
 * "complemento":"GALPAO DE ESTOCAGEM DOCAS F03 A F18 L06 E L07",string
 * "cep":"06.210-108",string
 * "bairro":"PRESIDENTE ALTINO",string
 * "municipio":"OSASCO",string
 * "uf":"SP",string
 * "email":"FISCAL.NFE@B2WDIGITAL.COM",string
 * "telefone":"(11) 4003-4848\/ (11) 4003-5544",double
 * "entidade_federativo_responsavel":"",string
 * "situacao":"ATIVA",string
 * "dt_situacao_cadastral":"03\/11\/2005",int
 * "situacao_especial":"ATIVA",string
 * "data_situacao_especial":"********",int
 * "capital_social":"15440476360.81",double
 * "ie_origem":492513778117,int
 * "created_at":"2023-01-20T14:46:11.000000Z",double
 * "updated_at":"2023-01-20T14:46:11.000000Z"double}
 * @author aluno
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Cnpj {

    public String id;
    public String nI;
    public String tipo;
    public String abertura;
    public String nome;
    public String fantasia;
    public String atividadePN;
    public String atividadePC;
    public String naturezaJuri;
    public String logradouro;
    public String numero;
    public String complemento;
    public String cep;
    public String bairro;
    public String municipio;
    public String uf;
    public String email;
    public String tel;
    public String entidadeFR;
    public String situação;
    public String SC;
    public String SE;
    public String dataSE;
    public String capitalS;
    public String origem;
    public String created;
    public String updated;
    
    private String request(String cnpj)
    {
        String json;        

        try {
            URL url = new URL("https://sisdel.com.br/api/hub/cnpjHub/"+ cnpj);
           
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

        public void consultaCnpj(String cnpj){
       
        String resposta = request(cnpj);
       
        resposta = resposta.replaceAll("[{},:]", "");
       
        resposta = resposta.replaceAll("\"", "\n");        
       
        String array[] = new String[50];
       
        array = resposta.split("\n");
           
        this.setId(array[2]);
        this.setnI(array[5]);
        this.setTipo(array[9]);
        this.setAbertura(array[13]);
        this.setNome(array[17]);
        this.setFantasia(array[21]);
        this.setAtividadePN(array[25]);
        this.setAtividadePC(array[29]);
        this.setNaturezaJuri(array[33]);
        this.setLogradouro(array[37]);
        this.setNumero(array[41]);
        this.setComplemento(array[45]);
        this.setCep(array[49]);
        this.setBairro(array[53]);
        this.setMunicipio(array[57]);
        this.setUf(array[61]);
        this.setEmail(array[65]);
        this.setTel(array[69]);
        this.setEntidadeFR(array[71]);
        this.setSituação(array[77]);
        this.setSC(array[81]);
        this.setSE(array[85]);
        this.setDataSE(array[89]);
        this.setCapitalS(array[93]);
        this.setOrigem(array[96]);
        this.setCreated(array[97]);
        this.setUpdated(array[99]);
        }
        
        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getnI() {
        return nI;
    }

    public void setnI(String nI) {
        this.nI = nI;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getAtividadePN() {
        return atividadePN;
    }

    public void setAtividadePN(String atividadePN) {
        this.atividadePN = atividadePN;
    }

    public String getAtividadePC() {
        return atividadePC;
    }

    public void setAtividadePC(String atividadePC) {
        this.atividadePC = atividadePC;
    }

    public String getNaturezaJuri() {
        return naturezaJuri;
    }

    public void setNaturezaJuri(String naturezaJuri) {
        this.naturezaJuri = naturezaJuri;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEntidadeFR() {
        return entidadeFR;
    }

    public void setEntidadeFR(String entidadeFR) {
        this.entidadeFR = entidadeFR;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public String getSC() {
        return SC;
    }

    public void setSC(String SC) {
        this.SC = SC;
    }

    public String getSE() {
        return SE;
    }

    public void setSE(String SE) {
        this.SE = SE;
    }

    public String getDataSE() {
        return dataSE;
    }

    public void setDataSE(String dataSE) {
        this.dataSE = dataSE;
    }

    public String getCapitalS() {
        return capitalS;
    }

    public void setCapitalS(String capitalS) {
        this.capitalS = capitalS;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
