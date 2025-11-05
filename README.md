# 🔨 FerreControl: Sistema de Gestión Comercial y de Existencias (SGC)

## 📍 Información del Proyecto y Cliente

| Campo | Detalle |
| :--- | :--- |
| **Título del proyecto** | **FerreControl para Ferretería Vanessa** |
| **Nombre del Cliente** | **Ferretería Vanessa** |
| **Ubicación** | La Dalia, Matagalpa (De la Alcaldía de la Dalia media cuadra arriba) |
| **Contacto** | Byron Daniel Palacios Hernández (Tel: +505 8624 4743) |
| **Tipo de Sistema** | Sistema de Gestión Comercial y de Existencias (SGC) |

---

## 📝 Sobre el Proyecto

**FerreControl** es un Sistema de Gestión diseñado para la Ferretería Vanessa. Su objetivo principal es **automatizar y optimizar** los procesos operativos críticos de **gestión de existencias (inventario) y ventas (Punto de Venta)**.

El sistema busca eliminar errores de *stock* y demoras en el proceso de venta, centralizando el catálogo de productos y los movimientos de inventario en tiempo real.

### Objetivo General

Desarrollar un Sistema de Gestión Comercial y de Existencias que permita la administración eficiente del *stock* y la agilización del proceso de venta a través de un Punto de Venta (TPV).

### Alcance del Sistema

El sistema cubrirá la administración completa del **Inventario de Productos**, la gestión de **Clientes** y el módulo principal de **Punto de Venta (TPV)**. Incluirá la **gestión de ajustes de inventario** y **reportes básicos** de ventas.

---

## ✨ Funcionalidades Clave (Requerimientos Funcionales)

El sistema implementará módulos esenciales de gestión:

* **CRUD de Catálogo:** Gestión de **Productos** (con *stock*, precio de venta y categoría) y **Clientes**.
* **Registro de Ventas (TPV):** Permitir registrar transacciones de venta de forma rápida, actualizando el inventario automáticamente.
* **Ajustes de Inventario:** Desarrollar la funcionalidad para registrar **Entradas y Salidas (Ajustes)** de *stock* manuales.
* **Seguridad:** Autenticación por usuario y contraseña, con control de acceso basado en roles.

---

## 🏗️ Arquitectura y Recursos

Este proyecto se está desarrollando como parte de la asignatura **Metodología y Programación Orientada a Objetos 1** de la Universidad Americana.

### Entidades Clave del Dominio

Las entidades principales que componen el modelo de negocio son:
`Producto`, `Venta`, `Cliente`, `Usuario`.

### Tecnología y Herramientas

| Tipo | Recurso |
| :--- | :--- |
| **Framework Principal** | **OpenXava** (Motor de frontend automático para Java/JPA) |
| **Lenguaje/Entorno** | **Java Development Kit (JDK 18)** |
| **Base de Datos** | **PostgreSQL** |

---

## 👥 Actores del Sistema

| Actor / Usuario | Rol Principal |
| :--- | :--- |
| **Administrador** | Gestión de la configuración, usuarios, y acceso total a reportes. |
| **Vendedor (Cajero)** | Utiliza el **Punto de Venta (TPV)** para registrar ventas y procesar pagos. |
| **Encargado de Almacén** | Gestiona el registro de entradas/ajustes de inventario. |

---

## 🧑‍💻 Equipo de Desarrollo

| Cif | Nombre Completo | Rol |
| :---: | :--- | :--- |
| 23020027 | **Kristel Geraldine Villalta Porras** | Coordinadora |
| 23021204 | **Inti Alexander Montalván Góngora** | Desarrollador |
| 24010011 | **William Alberto Torres Moreira** | Desarrollador |
| 24010243 | **Yubelkis de los Ángeles Rodriguez Montenegro** | Diseñadora |
| 24010243 | **Walter Javier López Villega** | Analista |

---
