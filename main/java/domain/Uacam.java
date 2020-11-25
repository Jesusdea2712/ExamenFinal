/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jesus
 */
public class Uacam {
    
    public int hashSimple(String matricula){
        int suma = 0;
        for(int i = 0; i<matricula.length(); i++ ){
            suma += Integer.parseInt(matricula.charAt(i)+"");
        }
        
        if(suma>0 && suma<20){
            return 0;
        }else if(suma>19 && suma<30){
            return 1;
        }else if(suma>29){
            return 2;
        }
        
        return 3;
    }
    
    public String sumaCaracteres(String matricula){
        int suma = 0;
        for(int i = 0; i<matricula.length(); i++ ){
            suma += Integer.parseInt(matricula.charAt(i)+"");
        }
        String caracteres = String.valueOf(suma);
        int sumaCaracteres = 0;
        for(int i=0; i<caracteres.length(); i++){
            sumaCaracteres += Integer.parseInt(caracteres.charAt(i)+"");
        }
        
        if(sumaCaracteres > 0 && sumaCaracteres < 7){
            return "Reprobado";
        }else if(sumaCaracteres > 6 && sumaCaracteres < 10){
            return "Aprobado";
        }else if (sumaCaracteres > 9){
            return "Excelente";
        }
        
        return null;
    }
}
