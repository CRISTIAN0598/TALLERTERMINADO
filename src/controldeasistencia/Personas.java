/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeasistencia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Personas 
{
    public String nombre;
    public String apellido;
    public String cedula;
    public int edad;
    public Date HoraE; 
    
    
    public Personas DatosPersonales (Personas personita)
    {
        Scanner entrada = new Scanner(System.in);
       
        
        System.out.println("ingrese el nombre");
        personita.nombre= entrada.next();
        
         System.out.println("ingrese el apellido");
         personita.apellido= entrada.next();
        
         System.out.println("ingrese la cedula");
        personita.cedula= entrada.next();
        
         System.out.println("ingrese la edad");
        personita.edad= entrada.nextInt();
        
        SimpleDateFormat formato = new SimpleDateFormat("yy-MM-dd/HH:mm");
        
        HoraE = new Date();
        System.out.println("la fecha y horade entrada fue: "+ formato.format(HoraE));
        
        return personita;
    }
    
}

















