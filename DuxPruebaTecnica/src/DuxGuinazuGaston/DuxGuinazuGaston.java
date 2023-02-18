
package DuxGuinazuGaston;

import DuxGuinazuGaston.Controlador.ControladorPartido;
import DuxGuinazuGaston.Vistas.Inicio;


public class DuxGuinazuGaston {

   
    public static void main(String[] args) throws ClassNotFoundException {
       
       try{
            
           
            new Inicio(new ControladorPartido()).setVisible(true);

            
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
               
         
    }
    
}
