
package AdmArchivos;



import Clases.Pedido;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase para manipular los clietes como archivos binarios
 **/
public class ArchPedido {
    static String fichero = "Archivos/Paquetes.dat";
    public static void GrabarPedido(ArrayList<Pedido> ArrayPaquetes) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Pedido ObjCliente:  ArrayPaquetes){
            // grabar todo el objeto
            oos.writeObject(ObjCliente);
        }
        oos.close();  // Se cierra al terminar.
    }
    
    public static void ImportarPedidos(ArrayList<Pedido> ArrayPaquetes) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Pedido aux = (Pedido) ois.readObject();
            while (aux!=null){
                if (aux instanceof Pedido) {               
                    //System.out.println(aux);
                    ArrayPaquetes.add((Pedido)aux);
                }
                aux = (Pedido) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo"); //solo con fines de seguimiento
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
}
