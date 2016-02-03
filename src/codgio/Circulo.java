// Mi primera clase suuuuuuuuuu

// La clase circulo permite almacenar un circulo
//ademas de su posicion en la pantalla, si esta relleno o no
//, su color, etc.

package codgio;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Alejandro Dietta 
 * 
 */

public class Circulo extends Ellipse2D.Double {
    
        public Color color = null;
        public boolean relleno = false;
        
        public Circulo(int _x, int _y, int _width, Color _color, boolean _relleno){
            this.x = _x;
            this.y = _y;
            this.width = _width;
            this.height = _width;
            this.color = _color;
            this.relleno = _relleno;
                    
                    
        }
   
            }