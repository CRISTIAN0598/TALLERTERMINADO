/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldeasistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archivo 
{
     public Scanner entrada;  
 public BufferedReader ENTRADABF;  
    FileWriter ftxt;
    PrintWriter ptxt;
    private double prom;
    
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
             ptxt.println(personita.nombre+";"+personita.apellido+";"+personita.cedula+";"+personita.edad+";"+personita.HoraE);
             
             ptxt.flush();
             
            
         } 
        
         catch (Exception e)
         {
             System.err.println("se presento un error al abrir el archivo"+e);
         }
     }
     
    public double entregarPromedio(){
        int j=0;
      double promedio=0;
    StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Usuario\\Documents\\ejemplo.txt"))) {

            // read line by line
            String line;
            String edad = "";
            int i, puntoycomas;
            //leer cada linea
            while ((line = br.readLine()) != null) {
                i = 0;
                puntoycomas=0;
                //leer letra por letra
                while (puntoycomas<3 ) {
                    if (line.charAt(i)==';'){
                        puntoycomas++;
                    }
                    i++;
                }
                //saltar un caracter para pasarse el ;

                while (line.charAt(i) != ';') {
                    edad += line.charAt(i);
                    i++;
                }
                 //System.out.println(edad);
                promedio += Double.parseDouble(edad);
               

                edad="";
                //incrementar la fila de los arreglos o de la tabla
                j++;
                 
            }




        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            System.out.println("Error en la lectura del archivo");
        }

        System.out.println("el promedio de edad es " + promedio/j);
       return promedio/j;
        
       //
        
    }
 
    
}





































