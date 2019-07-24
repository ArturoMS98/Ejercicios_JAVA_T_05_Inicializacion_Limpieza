package t_05_ej11;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 23, 2019 2:32:58 AM<p>                                                               *
 * <p>nombre del proyecto: T_05_Ej11.java<p>                                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_05_Inicializacion_Limpieza.git">GIT</a></p>        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>11. Crear una clase con una referencia String sin inicializar. Demostrar que Java inicializa esta referencia a    *
 *        null.</p>                                                                                                     *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 09 minutos 45 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_05_Ej11 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar a la referencia String sin inicializar, viendo qué contiene</p>                                         *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Clase clase = new Clase();
        System.out.println(clase.cadena);
    }
}