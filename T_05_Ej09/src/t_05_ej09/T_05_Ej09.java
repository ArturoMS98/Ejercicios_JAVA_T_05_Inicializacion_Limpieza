package t_05_ej09;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 23, 2019 2:03:23 AM<p>                                                               *
 * <p>nombre del proyecto: T_05_Ej09.java<p>                                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_05_Inicializacion_Limpieza.git">GIT</a></p>        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>9. Crear una clase con dos métodos. Dentro del primer método, invocar al segundo dos veces; la primera vez        *
 *       sin utilizar this, y la segunda, usando this.</p>                                                              *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 06 minutos 06 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_05_Ej09 {
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Invocar a los metodos de la clase Clase</p>                                                                    *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        Clase clase = new Clase();
        clase.metodo1();
        clase.metodo2();
    }
}