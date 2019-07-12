/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeasistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo 
{
     public Scanner entrada;  
 public BufferedReader ENTRADABF;  
    FileWriter ftxt;
    PrintWriter ptxt;
    
 public void AbrirArchivo()
 {
     String ruta = "C:\\Users\\Usuario\\Documents";
     
     try 
     {
         entrada = new Scanner(new File(ruta,"ejemplo.txt"));
     } 
     catch (Exception e) 
     {
        System.out.println("Revise la Direccion o Ruta del Archivo");
    System.out.println("Error" + e );
     }
     
 }
     public void MostrarDatos()
     {
        while(entrada.hasNext()){
    System.out.println(" " + entrada.next() );
    
      } 
        
     }
     public void escrituta (Personas personita)
             
          
     {
         try 
         {
             ftxt = new FileWriter("C:\\Users\\Usuario\\Documents\\ejemplo.txt",true);
             ptxt = new PrintWriter(ftxt);
             ptxt.println(personita.nombre+"\t"+personita.apellido+"\t"+personita.cedula+"\t"+personita.edad+"\t"+personita.HoraE);
             
             ptxt.flush();
             
            
         } 
        
         catch (Exception e)
         {
             System.err.println("se presento un error al abrir el archivo"+e);
         }
     }
     
}




































