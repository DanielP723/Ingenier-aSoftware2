import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        int id = 1;
        ArrayList<Evento> eventos = new ArrayList<>();
        do{
            try{
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un evento\n"
                        + "2. Revisar lista de eventos\n"
                        + "3. Salir\n"
                        + "Elige una opción...","Eventos"
                        ,JOptionPane.QUESTION_MESSAGE));
                
                switch (eleccion){
                    
                    case 1:
                        
                        String nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del evento");
                        String direccion = JOptionPane.showInputDialog(null,
                                "Ingresa la dirección del evento");
                        String hora = JOptionPane.showInputDialog(null,
                                "Ingresa la hora del evento");
                        String fecha = JOptionPane.showInputDialog(null,
                                "Ingresa la fecha del evento");
                        Evento e = new Evento(id,nombre,direccion,hora,fecha);
                        id++;
                        eventos.add(e);
                        
                        break;
                        
                    case 2:
                        
                        if(!eventos.isEmpty()){
                            JOptionPane.showMessageDialog(null,eventos.toString()
                            ,"Eventos",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No ha agregado eventos"
                            ,"Cuidado",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    
                    case 3:
                        
                        JOptionPane.showMessageDialog(null,"Aplicación finalizada"
                        ,"Fin",JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                        
                    default:
                        
                        JOptionPane.showMessageDialog(null,"Opción incorrecta"
                        ,"Cuidado",JOptionPane.INFORMATION_MESSAGE);
                        
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(eleccion != 3);
    }
}
