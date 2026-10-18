# Sistema de Control de Rescate y Adopción Animal

Proyecto académico de la asignatura **Desarrollo de Sistemas Informáticos** (Tecnologías de la Información, quinto semestre, Universidad Técnica de Manabí). Periodo septiembre 2026 - enero 2027.

**Autor:** Jorge Idrovo

## Descripción

Sistema para gestionar los casos de un refugio animal: registrar rescates de perros, gatos y fauna silvestre, asignar voluntarios o veterinarios, seguir el estado de cada caso (Rescatado, En Tratamiento, Adopción, Adoptado) y gestionar las solicitudes de adopción.

El repositorio se desarrolla de forma progresiva a lo largo de varias actividades de la asignatura.

## Actores

- **Ciudadano / Reportante:** reporta animales en situación de riesgo.
- **Voluntario / Veterinario:** atiende los casos y registra el historial médico.
- **Administrador del Refugio:** asigna voluntarios, aprueba adopciones y genera reportes.
- **Adoptante:** solicita la adopción de un animal disponible.

## Patrones de diseño aplicados

| Patrón | Clases | Propósito |
|---|---|---|
| Singleton | `GestorCasos` | Una única instancia que centraliza la gestión de casos |
| Observer | `Sujeto`, `Observador`, `Voluntario` | Notificar automáticamente a los voluntarios ante un nuevo rescate |
| Factory Method | `ExpedienteFactory` y sus fábricas | Crear el expediente adecuado según la especie |
| MVC | Controladores, modelo y vista | Separar interfaz, control y lógica de negocio |

## Estructura del repositorio

```
docs/   Diagramas (casos de uso, clases, arquitectura y secuencia)
src/    Código fuente Java de los patrones de diseño
```

## Flujo de trabajo (Gitflow)

| Rama | Función |
|---|---|
| `main` | Versiones estables y etiquetadas |
| `develop` | Integración de las funcionalidades terminadas |
| `feature/*` | Desarrollo aislado de cada avance |

`main` es la rama de producción, equivalente a `master` en el modelo Gitflow original.

Convención de commits: `feat` (código nuevo), `docs` (documentación y diagramas), `fix` (correcciones) y `chore` (mantenimiento).

## Versiones

| Versión | Contenido |
|---|---|
| `v1.0.0` | Actividad 1: diagramas, patrones Singleton, Observer y Factory Method |