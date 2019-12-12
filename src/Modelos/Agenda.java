package Modelos;
import Control.Persona;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Agenda {
    
    
    Vector vector = new Vector();
    Persona persona=new Persona();
    
    public void GuardarPersona(Persona persona){
     
       if(vector.add(persona)){
           
       JOptionPane.showMessageDialog(null,"Se ha agregado correctamente la persona");
       
       }
         
     }
    
    public String MostrarAgenda(){
     String Linea="",Linea2;
         
            for(int x=0;x<vector.size();x++){
                persona=(Persona)vector.get(x);
                Linea2="Nombre:"+persona.Nombre+"  ||  "+"Apellidos:"+persona.Apellidos+"  ||  "+"Edad:"+persona.Edad+"  ||  "+"Telefono:"+persona.Telefono;
                        
                
            Linea=Linea+Linea2+"\n";
            }
     
     return Linea;
     }
    
}
