package umg.edu.progra.bst;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Walter Cordova
 */
public class Ejemplo {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ejemplo.class);

    public static void main(String[] args) {
        Empleado e1 = new Empleado(20, "Walter Cordova", "IT", "A-255");
        Empleado e2 = new Empleado(45, "Leo Mesi", "RRHH", "A-255");
        Empleado e3 = new Empleado(25, "Tony Roy", "Ventas", "A-255");
        Empleado e4 = new Empleado(53, "Angel Nunez", "Logistica", "A-255");
        Empleado e5 = new Empleado(15, "Salazar Ali", "IT", "A-255");
//        Empleado e6 = new Empleado(50, "Jonny Bravo", "RRHH", "A-255");
//        Empleado e7 = new Empleado(54, "Sergio Espinoza", "Marketing", "A-255");
        Empleado e8 = new Empleado(19, "Beatriz Alay", "Contabilidad", "A-255");


        BST bst = new BST();
        System.out.println("Esta vacio: " + bst.estaVacio() + " y es hoja " + bst.esHoja());
        //LOGGER.info("Esta vacio: {} y es hoja {}", bst.estaVacio(), bst.esHoja());


        bst.insertar(e1);
        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());
        bst.insertar(e2);
        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());
        bst.insertar(e3);
        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());
        bst.insertar(e8);
        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());

        bst.insertar(e5);
        System.out.println("Esta vacio: " + bst.estaVacio() + " y es hoja " + bst.esHoja());


//        localizar(bst,20);
//        localizar(bst,45);
//        localizar(bst,25);
//        localizar(bst,19);
//        localizar(bst, 15);

       // Arrays.asList(e1, e2, e3, e4, e5, e6, e7).forEach(bst::insertar);

        //bst.inOrden();

//        bst.eliminar(25);
//        bst.eliminar(19);
//        bst.eliminar(2);
//        bst.eliminar(20);
//        bst.eliminar(15);
        System.out.println("Su arbol actualmente: (false: vacio, true: con datos): ");
        bst.estaVacio();







//        BST bst = new BST();
//        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());
//        bst.insertar(e1);
//        LOGGER.info("Esta vacio: {} y es hoja {}", bst.esVacio(), bst.esHoja());
    }




    private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
            LOGGER.info("Obtener {}: {}", id, bst.obtener(id));
        } else {
            LOGGER.error("No encuentro el empleado: {}", id);
        }
    }
}