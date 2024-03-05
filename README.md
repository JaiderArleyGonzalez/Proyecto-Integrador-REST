# 📦 Proyecto Integrador: Implementa el controlador y servicio de tu API REST.
El tema principal del proyecto es el desarrollo de una aplicación web basada en Spring Boot para la gestión de usuarios. El proyecto se centra en la implementación de un backend que proporciona servicios RESTful para crear, leer, actualizar y eliminar (CRUD) usuarios, así como para autenticar usuarios registrados en el sistema.

## Estructura
El proyecto está organizado en varios paquetes que contienen clases con diferentes responsabilidades. A continuación se presentan las partes principales del proyecto:

### Model
El paquete edu.ieti.integrador.model contiene la clase Usuario, que representa la entidad de usuario con los siguientes campos:

* id: Identificador único del usuario.
* userName: Nombre de usuario.
* nombre: Nombre completo del usuario.
* email: Dirección de correo electrónico del usuario.
* password: Contraseña del usuario.
### Repository
El paquete edu.ieti.integrador.repository contiene la interfaz UsuarioRepository, que extiende JpaRepository de Spring Data JPA. Esta interfaz define métodos para realizar operaciones de persistencia sobre la entidad Usuario, como buscar usuarios por nombre de usuario y contraseña, verificar la existencia de usuarios por nombre de usuario e ID, eliminar usuarios por nombre de usuario, y buscar usuarios por nombre de usuario.

### Services
El paquete edu.ieti.integrador.services contiene la clase UsuarioService, que proporciona métodos para realizar operaciones de negocio relacionadas con los usuarios, como eliminar un usuario por nombre de usuario, actualizar un usuario, realizar el login de un usuario, obtener un usuario por nombre de usuario, obtener todos los usuarios y registrar un nuevo usuario.

### Controller
El paquete edu.ieti.integrador.controller contiene la clase UsuarioController, que define los puntos de acceso REST para interactuar con la funcionalidad relacionada con los usuarios. Este controlador expone endpoints para obtener la lista de usuarios, registrar un nuevo usuario, eliminar un usuario, actualizar un usuario y realizar el login de un usuario.

## Instalación

Clona el proyecto con el siguiente comando en consola:

```
    git clone https://github.com/JaiderArleyGonzalez/Proyecto-Integrador-REST.git
```

Navega dentro de los directorios:

![](/img/directorio.png)

Ahora ejecuta el siguiente comando

```
    mvn spring-boot:run
```

## Pruebas

Para el registro de usuarios, se realiza la prueba en postman:

* Método POST hacia la dirección http://localhost:8080/usuario/registrar
*  raw Json:
    ```
   {
   "userName":"jaiderG",
   "nombre":"jaider",
   "email":"jaider@gmail.com",
   "password":"contraseñaFalsa"
   }
   ```
   
![](/img/registrar.png)

Para listar
* Método GET a la dirección http://localhost:8080/usuario/lista

![](/img/listar.png)

Para eliminar
* Método DELETE a la dirección http://localhost:8080/usuario/eliminar/{userName}

![](/img/delete.png)