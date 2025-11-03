# KD-ELECTRONICS

Este proyecto es un sistema completo de gestión de inventario para una tienda de electrónica, diseñado con la arquitectura **Modelo-Vista-Controlador (MVC)** en Java.
Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de productos, gestionar el stock, y persiste los datos mediante una conexión **JDBC** a una base de datos relacional.

## Características Principales
- Gestión Completa de Inventario (CRUD): Control total sobre la base de productos.
- Arquitectura MVC: Separación clara de responsabilidades para facilitar el mantenimiento y la escalabilidad.
- Persistencia de Datos: Conexión robusta a una base de datos vía JDBC.

## Validaciones
- Validación estricta de campos de entrada utilizando **Expresiones Regulares (Regex)** para garantizar la integridad de los datos.
- Control de errores y mensajes detallados en la consola para depuración.

## Estructura
- `model/`: Clases de Entidad
- `controller/`: Lógica de Negocio
- `view/`: Interfaz de Usuario

## Tecnologías
- Java 17+
- Maven 3.11.0
- JDBC 9.5.0
- NetBeans 25
- Base de Datos MySQL

## Instalación
1. Clonar el repositorio: `git clone git@github.com:NH04H/KD-ELECTRONICS.git`
2. Configura la Base de Datos
3. Configura Conexión JDBC
4. Abrir en NetBeans
5. Ejecutar con Maven
   
## Autor
Juan Sandoval – UNIMINUTO - NRC-3692 Programación Orientada a Objetos - Semana 8

## Repositorio
https://github.com/NH04H/KD-ELECTRONICS.git
