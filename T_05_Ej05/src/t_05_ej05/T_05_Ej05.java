package t_05_ej05;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 21, 2019 8:00:13 PM<p>                                                               *
 * <p>nombre del proyecto: T_05_Ej05.java<p>                                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_05_Inicializacion_Limpieza.git">GIT</a></p>        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>5. Crear un array de objetos String y asignar una cadena de caracteres a cada elemento. Imprimir el array         *
 *    utilizando un bucle for.</p>                                                                                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: excesivo, son las 21:42:40.. fallo estupido</p>                                 *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_05_Ej05 {
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p></p>
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String[] array = {"Hola", "has", "completado", "el", "Ejercicio!"};
        for (String elementos : array) {
         System.out.println(elementos + "  ");
        }
    }
}
