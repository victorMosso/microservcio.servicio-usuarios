FROM openjdk:12
VOLUME /tmp
ADD ./target/springboot.microservicio.usuarios-v.1.0.jar microservicio-usuarios.jar
ENTRYPOINT [ "java","-jar","microservicio-usuarios.jar" ]