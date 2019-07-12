
package controldeasistencia;

public class ControlDeAsistencia 
{

    public static void main(String[] args) 
    {
        Personas personita = new Personas();
        
        personita = personita.DatosPersonales(personita);
        
        Archivo lectura = new Archivo();
      
        
        lectura.AbrirArchivo();
       // lectura.MostrarDatos();
        lectura.escrituta(personita);
    }
    
}























