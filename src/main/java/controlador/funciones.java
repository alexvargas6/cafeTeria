
package controlador;

import javax.swing.JLabel;

/**
 *
 * @author Alexvargas6
 */
public class funciones {
    
    public void mostrarCafe(int cafe, JLabel lblCantidad){
    
        String cof = "USTED TIENE: " + cafe + " ML DE CAFÉ";
        lblCantidad.setText(cof);
      }
    
    public boolean validarNumero(String cantidad){
    
        try {
		Integer.parseInt(cantidad);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
        }
    
}
