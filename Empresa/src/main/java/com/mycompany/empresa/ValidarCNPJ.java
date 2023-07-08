/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author aluno
 */
public class ValidarCNPJ {
    public static int primeiroDigito(int[] numeros){
        
        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];
        }
        
        resultado = 11 - (soma % 11);
        
        if ((resultado == 10) || (resultado == 11)){
            return 0;
        }
        return resultado;
    }
    
    public static int segundoDigito(int[] numeros){
        int[] multiplicadores = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        int soma = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];   
        }
        
        resultado = 11 - (soma % 11);
               
        if ((resultado == 10) || (resultado == 11)){
            return 0;
        }
        
        return resultado;
    }
    
     public static boolean validar(String CNPJ) {
      
        if (CNPJ.length() != 14) {
            return false;
        }
        
        int[] numeros = new int[14];
      
        for (int i = 0; i < 14; i++) {
            numeros[i] = Integer.parseInt(CNPJ.substring(i, i + 1));
        }
        
        if(primeiroDigito(numeros) != numeros[12] || segundoDigito(numeros) != numeros[13]){
            return false;
        }
        
        return true;
    }
}
