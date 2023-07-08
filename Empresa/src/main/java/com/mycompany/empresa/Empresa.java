/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empresa {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
        Cep cep = new Cep();
        Cnpj cnpj = new Cnpj();
        
        System.out.println("Digite seu CEP:");
        cep.consultaCep(teclado.next());
        
        
        System.out.println(cep.bairro);
        System.out.println(cep.cep);
        System.out.println(cep.cidade);
        System.out.println(cep.logradouro);
        System.out.println(cep.uf);
        
        System.out.println("Digite seu CNPJ:");
        
        String busca = teclado.next();
        
        if (ValidarCNPJ.validar(busca)) {
            System.out.println("CNPJ válido!");
        } else {
            System.out.println("CNPJ inválido!");
        }
        
        cnpj.consultaCnpj(busca);
        
        
        System.out.println(cnpj.id);
        System.out.println(cnpj.nI);
        System.out.println(cnpj.tipo);
        System.out.println(cnpj.abertura);
        System.out.println(cnpj.nome);
        System.out.println(cnpj.complemento);
        System.out.println(cnpj.cep);
        System.out.println(cnpj.bairro);
        System.out.println(cnpj.municipio);
        System.out.println(cnpj.uf);
        System.out.println(cnpj.email);
        System.out.println(cnpj.tel);
        System.out.println(cnpj.entidadeFR);
        System.out.println(cnpj.SC);
        System.out.println(cnpj.SE);
        System.out.println(cnpj.dataSE);
        System.out.println(cnpj.capitalS);
        System.out.println(cnpj.origem);
        System.out.println(cnpj.created);
        System.out.println(cnpj.updated);

    }
}
