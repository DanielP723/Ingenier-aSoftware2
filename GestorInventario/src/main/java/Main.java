import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        int id = 1;
        ArrayList<Producto> inventario = new ArrayList<>();
        do{
            try{
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un producto\n"
                        + "2. Revisar inventario\n"
                        + "3. Salir\n"
                        + "Elige una opción...","Inventario"
                        ,JOptionPane.QUESTION_MESSAGE));
                
                switch (eleccion){
                    
                    case 1:
                        
                        String nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del producto");
                        String categoria = JOptionPane.showInputDialog(null,
                                "Ingresa la categoría del prodcuto");
                        Producto p = new Producto(nombre,categoria);
                        id++;
                        inventario.add(p);
                        
                        break;
                        
                    case 2:
                        
                        if(!inventario.isEmpty()){
                            JOptionPane.showMessageDialog(null,inventario.toString()
                            ,"Inventario",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No ha agregado productos"
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
