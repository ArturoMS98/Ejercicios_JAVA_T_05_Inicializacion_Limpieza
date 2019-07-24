package t_05_ej08;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 23, 2019 1:58:05 AM<p>                                                               *
 * <p>nombre del proyecto: T_05_Ej08.java<p>                                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_05_Inicializacion_Limpieza.git">GIT</a></p>        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>8. Crear una clase sin constructor, y crear un objeto de esa clase en main() para verificar que el constructor    *
 *       por defecto se invoca automáticamente.</p>                                                                     *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 04 minutos 23 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_05_Ej08 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Invocar a la clase sin constructor</p>                                                                         *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Constructores n = new Constructores();
        
        //FRONTEND//
        System.out.println(n.n);
    }
}