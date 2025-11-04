# FitManager: Sistema de Gestión de Membresías 

## Sobre el Proyecto

**FitManager** es un **Sistema de Gestión** diseñado para gimnasios. Su objetivo principal es **automatizar y optimizar** los procesos administrativos críticos relacionados con las membresías de los clientes.

Este sistema busca resolver la falta de un control unificado y eficiente de la asistencia, membresías y pagos, centralizando la información y automatizando tareas repetitivas para reducir la carga administrativa y mejorar la precisión operativa del gimnasio.

### Objetivo General

Desarrollar un Sistema de Gestión de Membresías para gimnasios que permita la administración eficiente de clientes, planes, entrenadores, asistencia, pagos y equipos.

### Alcance del Sistema

El sistema cubrirá la **administración completa** de la información de **Clientes** y sus **Membresías**, incluyendo la gestión de **Entrenadores**, la programación de **entrenamientos**, el registro de **Asistencia** y la gestión de **Pagos Recurrentes**.

---

## ✨ Funcionalidades Clave (Requerimientos Funcionales)

El sistema implementará módulos esenciales de gestión:

* **CRUD** (Crear, Leer, Actualizar, Eliminar) de **Clientes**, **Planes de Membresía** y **Entrenadores**.
* **Asignación de Membresías:** Permitir asignar una membresía a un cliente, especificando la fecha de inicio y fin.
* **Registro de Asistencia:** Desarrollar la funcionalidad para el registro rápido de la presencia de los clientes.
* **Gestión de Pagos Recurrentes:** Modelar el flujo de pagos recurrentes asociados a los planes de membresía, asegurando su trazabilidad.

---

## 💻 Arquitectura y Recursos

Este proyecto se está desarrollando como parte de la asignatura **Metodología y Programación Orientada a Objetos 1** de la Universidad Americana.

### Entidades Clave del Dominio

Las entidades principales que componen el modelo de negocio son:
`Cliente`, `Membresia`, `Clase`, `Entrenador`, `Asistencia`, `Equipo`, `Pago`.

### Tecnología y Herramientas

| Tipo | Recurso | Descripción |
| :--- | :--- | :--- |
| **Framework Principal** | **OpenXava** | Motor de *frontend* automático para desarrollo basado en Java/JPA. |
| **Lenguaje/Entorno** | **Java Development Kit (JDK 18)** | Entorno de desarrollo para la lógica de negocio. |
| **Base de Datos** | **PostgreSQL** | Sistema de Gestión de Base de Datos relacional. |

---

## 👤 Actores del Sistema

| Actor / Usuario | Rol Principal |
| :--- | :--- |
| **Administrador** | Gestiona los datos principales (planes, equipos, clases), usuarios, y tiene acceso total a reportes y configuraciones. |
| **Recepcionista** | Gestiona alta/modificación de clientes y membresías, registra la asistencia y procesa los pagos. |
| **Entrenador** | Consulta la lista de clientes asignados, la programación de clases, y registra potencialmente la asistencia a sus clases. |

---

## 👥 Equipo de Desarrollo

| Cif | Nombre Completo | Rol |
| :--- | :--- |
| Inti Alexander Montalván Góngora | Desarrollador |
| Kristel Geraldine Villalta Porras | Desarrollador |
| William Alberto Torres Moreira | Desarrollador |
| Yubelkis de los Ángeles Rodriguez Montenegro | Desarrollador |
| Walter Javier López Villega | Desarrollador |
