
TEST

/*
* @RunWith(SpringRunner.class): Le indica a JUnit que utilize el Runner de
* Spring al momento de correr los test (necesario para levantar el contexto de
* Spring).
*
* @SpringBootTest: Si utilizamos una aplicación con Spring Boot, nos da
* diversas features de Spring Boot (ver Javadoc). Si en la clase
* ApplicationConfig utilizamos la anotacion @SpringBootApplication, no hace
* falta pasarle la clase como parámetro
*
* @Transactional: Indica que cada uno de los métodos de esta clase es
* transaccional.
*/


APPLICATIONCONFIG

/*
 * En esta clase vemos las siguientes anotaciones:
 *
 * @Configuration: Indica que la clase es una clase de configuración de Spring
 *
 * @EnableAutoConfiguration: Habilita la autoconfiguración de Spring Boot.
 *
 * @ComponentScan: Esta anotación le indica a Spring desde que paquete empezar a
 * escanear. Si no se le indica ningún paquete, (como en este caso), toma como
 * paquete base el de esta clase
 *
 * Nota: Estas 3 anotaciones se pueden reemplazar por @SpringBootApplication.
 *
 */
 
 SERVLETINITIALIZER
 
 /**
  *
  * Esta clase es necesaria para poder desplegar la aplicación como war en un
  * contenedor de aplicaciones (en nuestro caso, Apache Tomcat).
  */