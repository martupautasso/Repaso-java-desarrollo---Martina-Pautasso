/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio1JavaMartinaPautasso {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int precio_horas;
        int horas_trabajadas;
        int salario;
        System.out.println("Costo de las horas trabajadas");
        precio_horas = entrada.nextInt();
        System.out.println("Cantidad de horas trabajadas");
        horas_trabajadas = entrada.nextInt();
        salario = (precio_horas*horas_trabajadas);
        System.out.println("Su salario por dia es" + salario);
        salario = (precio_horas*horas_trabajadas)*30;
        System.out.println = ("Su salario por mes es" + salario);
        salario = (precio_horas*horas_trabajadas)*365;
        System.out.println = ("Su salario por ano es"+ salario);
    }
}
