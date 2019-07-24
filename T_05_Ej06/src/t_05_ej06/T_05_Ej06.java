package t_05_ej06;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 21, 2019 9:58:53 PM<p>                                                               *
 * <p>nombre del proyecto: T_05_Ej06.java<p>                                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_05_Inicializacion_Limpieza.git">GIT</a></p>        *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>6. Crear una clase Perro con un método ladrar() sobrecargado. Este método debería sobrecargarse en base a         *
 *       varios tipos de datos primitivos, e imprimir distintos tipos de ladridos, aullidos, etc., dependiendo de la    *
 *       versión sobrecargada que se invoque. Escribir un método main() que llame a todas las distintas versiones.</p>  *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 13 minutos 20 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_05_Ej06 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar a todas las versiones de la clase Perro</p>                                                             *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        Perro aullido = new Perro(1);
        Perro ladrido = new Perro("GUAU");
        Perro DCANE = new Perro(false);
    }
}