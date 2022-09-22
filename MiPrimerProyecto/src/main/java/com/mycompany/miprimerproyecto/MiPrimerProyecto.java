package com.mycompany.miprimerproyecto;
import javax.swing.JOptionPane;

public class MiPrimerProyecto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Clase 1, declaracion de variables
        String nombre;
        int edad;
        float salario;
        double temperatura;
        char inicial;
        
        //Asignarle valor a las variables
        salario =14500.78f;
        inicial= 'D';
        edad = 26;    
        
        //Solicitar el dato por medio de una caja de dialgo, unicamente recibe variables tipo String
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        String temperaturaLectura =JOptionPane.showInputDialog("Ingrese el temperatura");
        temperatura= Double.parseDouble(temperaturaLectura); //convertir una variable tipo String a double 
   
        
        //Imprimir en consola
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(salario);
        System.out.println(temperatura);
        
        //Mostrar información en el cuadro de dialogo
         JOptionPane.showMessageDialog(null,"Su nombre es: " + nombre);
        JOptionPane.showMessageDialog(null,"Su Edad es: " + edad+"su nombre es"+ nombre);
        
        
        /************************EJERCICIO*********************/
        
        String edadLectura = JOptionPane.showInputDialog("Ingrese su edad"); //
        edad = Integer.parseInt(edadLectura);
        edad = edad + 5;
        JOptionPane.showMessageDialog(null,"Dentro de 5 años tendrá: " + edad);
          
    }    
}

