# java8-spring-cloud-microservice-demo
A Java 8 Spring Cloud scalable microservice demo

Ejemplo de uso de microservicios con Spring Cloud y Spring 1.5.9. basado en https://www.tristanperry.com/java8/spring/2017/12/23/java8-spring-cloud-microservice-demo.html

El ejemplo consta de cuatro microservicios:

   - eureka-server: Servidor Eureka escuchando en el puerto 8001, donde se registrarán el resto de microservicios
   - jwt-auth-server: Servicio Spring Security OAuth2 (single-sign-on), sobre el puerto 8002, el cual utiliza JWT (JSON Web Tokens). JWT es sin estado y se basa en una clave de secreto firmada (para evitar que cualquiera pueda generar su propia sesión).
   - business-logic-api: Aplicación Spring Boot en el puerto 8003 (Resource server en terminos OAuth2). Microservicio autenticado (requiere un token JWT válido para usar sus endpoints). Esto una "API", no un "servidor", ya que aquí es donde vivirán varios puntos finales de API de tipo "servidor de recursos".
   - reports-api:  Aplicación Spring Boot en el puerto 8004

Este ejemplo tiene dos resource servers para demostrar el uso de Feign en la comunicación entre microservicios.
