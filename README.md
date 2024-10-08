# CRUD API con Java Spring Boot, Hibernate y PostgreSQL

## Descripción

Este proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) desarrollada en Java utilizando Spring Boot como framework, Hibernate como ORM (Object-Relational Mapping) y PostgreSQL como base de datos. La aplicación permite gestionar recursos de forma sencilla y eficiente a través de una API RESTful.

## Funcionalidades

- **Crear**: Permite añadir nuevos recursos a la base de datos.
- **Leer**: Permite obtener una lista de todos los recursos o un recurso específico.
- **Actualizar**: Permite modificar los datos de un recurso existente.
- **Eliminar**: Permite eliminar un recurso de la base de datos.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para el desarrollo de la aplicación.
- **Spring Boot**: Framework que simplifica el desarrollo de aplicaciones Java.
- **Hibernate**: ORM para la gestión de la persistencia de datos.
- **PostgreSQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar los datos.

## Requisitos Previos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes:

- **Java JDK** (versión 11 o superior)
- **Maven** (para gestionar las dependencias del proyecto)
- **PostgreSQL** (base de datos)

## Configuración

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/Pipe-Garcia/java-crud-api-rest.git
   ```
2. **Configura la base de datos**:

   - Crea una base de datos en PostgreSQL.
   - Modifica el archivo application.properties (o application.yml) en el directorio src/main/resources para configurar la conexión a la base de datos:

		```properties
	    spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_de_tu_base_de_datos
	    spring.datasource.username=nombre_de_tu_usuario
	    spring.datasource.password=contraseña_de_tu_usuario
	    spring.jpa.hibernate.ddl-auto=update
		```

3. **Ejecuta la aplicación:**

	Desde el directorio raíz del proyecto, ejecuta el siguiente comando:

	```bash
	 mvn spring-boot:run
	```

	
## Endpoints		
| Método |Endpoint  |Descripción|
|--|--|--|
| POST |/api/recursos  |Crear un nuevo recurso|
|GET|/api/recursos|Obtener todos los recursos|
|GET|/api/recursos/{id}|Obtener un recurso específico|
|PUT|/api/recursos/{id}|Actualizar un recurso existente|
|DELETE|/api/recursos/{id}|Eliminar un recurso|


## Contribuciones
Si deseas contribuir a este proyecto, siéntete libre de enviar un pull request o abrir un issue para discutir cambios o mejoras.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
```csharp
Puedes personalizarlo según sea necesario, pero esta plantilla te dará una buena base para documentar tu proyecto. ¡Espero que te sea útil!```
