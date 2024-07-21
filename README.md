# Sistema de Gestión de Hospital Veterinario

Este programa en Java gestiona las operaciones de un hospital veterinario a través de una interfaz de consola. Implementa diversas funcionalidades para manejar clientes, mascotas, veterinarios y consultas médicas.

## Funcionalidades

1. **Crear Historial Clínico**: Permite registrar la historia clínica de una mascota. El usuario ingresa los datos del propietario (cedula, nombre, apellido, edad) y los datos de la mascota (ID, especie, raza, nombre). Estos datos se almacenan en listas para su posterior consulta.

2. **Consultar Clientes**: Muestra la información de un cliente específico. El usuario proporciona el índice del cliente que desea consultar, y el sistema muestra sus datos, incluyendo las mascotas registradas bajo su nombre.

3. **Listar Todos los Clientes**: Imprime una lista de todos los clientes registrados junto con sus detalles. Esto incluye la información personal del cliente y la información de sus mascotas.

4. **Mostrar Datos Estáticos de una Factura**: Demuestra cómo se generan y muestran los detalles de una factura. Incluye información sobre productos, cantidad de productos y el salario del veterinario. Este caso de uso está precargado con datos de ejemplo para ilustrar la funcionalidad.

5. **Salir**: Termina la ejecución del programa.

## Pilares de Poo Utilizados

1. **Encapsulamiento**: Los datos de clientes, mascotas, veterinarios y consultas están encapsulados en sus respectivas clases. Se accede y modifica a través de métodos específicos, protegiendo la integridad de los datos.

2. **Herencia**: Se podría inferir que algunas clases como `Cliente`, `Mascota`, `Veterinario`, etc., podrían compartir características comunes y utilizar herencia para reducir la redundancia de código.

3. **Polimorfismo**: Permite que objetos de diferentes clases sean tratados como objetos de una clase común. Por ejemplo, se puede tener una lista de `Consultas` donde cada consulta puede tener un detalle clínico diferente.

4. **Abstracción**: El programa maneja conceptos complejos como facturas, historiales clínicos y consultas a través de clases abstractas que simplifican la interacción del usuario con el sistema.

## Diseño Basado en UML

El diseño del sistema está guiado por un diagrama UML, el cual detalla las relaciones entre las clases y sus métodos. A continuación, se ilustra cómo se interconectan los diferentes componentes del sistema, desde la creación de clientes y mascotas hasta la gestión de consultas y facturas.

![image](https://github.com/user-attachments/assets/00f7a818-084f-4783-a197-b711516f94a5)


---

Este programa ofrece una forma estructurada y eficiente de gestionar un hospital veterinario, facilitando tanto la administración interna como la experiencia del usuario.

## Vista General

![image](https://github.com/user-attachments/assets/fd730ed7-721a-4fdf-b2ff-3834dfe48d8f)
