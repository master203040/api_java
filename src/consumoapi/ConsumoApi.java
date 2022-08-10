
//CONSUMO DE API EN JAVA 
package consumoapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;





public class ConsumoApi {

    
    public static void main(String[] args){
        
       final String URL_API= "https://jsonplaceholder.typicode.com/users";
       
        try {
            //inicio de la conexion 
            URL url= new URL(URL_API);
            URLConnection conexion = url.openConnection();
            
            //lectura del contenido de la respuesta
            Reader r = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(r);
            
            String linea;
            
            while((linea = br.readLine()) !=null) {                
                System.out.println(linea);
            }
            
        } catch (Exception e) {
            
            System.err.print("Error de ingreso y salida " + e.getMessage());
        }
        
        
        
    }
    
}
