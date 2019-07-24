
package t_05_ej09;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_05_ej09
 *
 * Funcion: 
 *          
 */
public class Clase {
    int variable = 5;
    void metodo1()
    {
        int variable = 6;
        System.out.println(this.variable);
        System.out.println(variable);
        metodo2();
        this.metodo2();
    }
    void metodo2()
    {
        int variable = 4;
        System.out.println(variable + "hola");
    }
}