package pruebacommits;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCommits {

    public static void main(String[] args) {
        int a = 2, b = 3;
        JOptionPane.showMessageDialog(null, "Hula commit");
        JOptionPane.showMessageDialog(null, (a + b));
        JOptionPane.showMessageDialog(null, "Fin programa");
        
        Scanner dato = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String nombre;
            System.out.println("Introduce nombre");
            nombre=dato.next();
            nombre= nombre.toLowerCase();
            nombre=nombre.toUpperCase();
            
           // if(nombre=="Brais")
            if(nombre.equals("bRais"))
                System.out.println("está Brais");  
            else
                System.out.println("No esta Brais");
        }
    }

}
