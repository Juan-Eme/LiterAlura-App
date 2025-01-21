# LiterAlura-App

README
LITERALURA - Sistema de Gestión de Libros y Autores
Este proyecto es una aplicación Java desarrollada con Spring Framework para gestionar libros y autores utilizando datos obtenidos de la API de Gutendex. Los usuarios pueden buscar libros, registrar información y consultar autores y libros ya registrados.

Requisitos previos
Java intalado.
Maven instalado.
API de Gutendex accesible (https://gutendex.com).
Configuración básica de Spring Framework.

Arquitectura
El sistema utiliza una estructura basada en componentes de Spring:
Servicios: Gestión de lógica de negocio y comunicación con la API.
DTOs (Data Transfer Objects): Transferencia de datos entre componentes.
Modelos: Representación de entidades (Libro y Autor).
Componente Principal: Punto de entrada para interactuar con las funcionalidades.

Funcionalidades
1. Buscar libros por título
Consulta la API de Gutendex para buscar libros por título.
Si el libro ya existe en la base de datos local, se indica al usuario.
Registra automáticamente los libros y sus autores si no existen.

2. Listar libros registrados
Muestra todos los libros almacenados en la base de datos local, incluyendo detalles como:
Título.
Autor.
Idioma.
Número de descargas.

3. Listar autores registrados
Muestra una lista de autores con información como:
Nombre.
Año de nacimiento.
Año de fallecimiento.
Libros asociados.

4. Listar autores vivos en un año específico
Busca y muestra los autores que estuvieron vivos en un año específico, basado en su fecha de nacimiento y fallecimiento.

5. Listar libros por idioma
Filtra y muestra los libros según su idioma. Los idiomas soportados son:
Español (es)
Inglés (en)
Francés (fr)
Portugués (pt)

Estructura del Código
Principal: Contiene el menú interactivo para el usuario.
Servicios:
LibroService: Operaciones CRUD para libros.
AutorService: Operaciones CRUD para autores.
ConsumoAPI: Comunicación con la API de Gutendex.
ConvierteDatos: Conversión de datos entre JSON y DTOs.
DTOs: Representaciones ligeras de entidades para transferencia de datos.
Modelos:
Libro: Representación de un libro.
Autor: Representación de un autor.

Uso del Menú
Al iniciar el programa, se presenta un menú con las siguientes opciones:

1: Buscar libro por título.
2: Listar libros registrados.
3: Listar autores registrados.
4: Listar autores vivos en un año.
5: Listar libros por idioma.
0: Salir del programa.

Ingrese el número correspondiente a la opción deseada y siga las instrucciones en la consola.

Notas
La búsqueda en la API es sensible a los espacios y caracteres especiales; estos son codificados automáticamente.
Los registros duplicados son prevenidos con validaciones en la base de datos local.
El proyecto utiliza componentes @Autowired de Spring para inyección de dependencias.

¡Disfrute explorando libros y autores con LITERALURA! 📚
