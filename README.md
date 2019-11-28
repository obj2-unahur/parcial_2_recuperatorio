# Recuperatorio Parcial 2 - 28/11/2019

## Entrega

La solución y entrega de este examen se va a realizar en el repositorio asignado por los profesores https://github.com/obj2-unahur-2019s2/recuperatorio-parcial2-2019-s2-{usuario-alumno}.

Se deben subir los cambios en un branch llamado `solucion` y se debe crear el pull request correspondiente en Github.

El código debe compilar y debe tener test unitarios que verifiquen la funcionalidad desarrollada.

### Creación del branch

El siguiente comando nos crea el nuevo branch y luego nos deja ya parados en el mismo

```console
  git checkout -b solucion
```

### Subida de los cambios

Primero hay que hacer commit en el repositorio local
```console
  git commit -m"mensaje del commit"
```

La primera vez que subimos los cambios, se crea el branch en el repositorio remoto, para eso hay que ejecutar el siguiente comando:

```console
  git push -u origin solucion
```

Luego si es necesario subir nuevos commits, ejecutamos:

```console
  git push
```

### Crear Pull Request

Siempre que comiteamos sobre un branch, github nos ofrece crear un pull request.
También podemos crearlo usando el botón `New pull request`.


### Condiciones de aprobación
* Ejercicio 1 - 1   punto
* Ejercicio 2 - 2,5 punto
* Ejercicio 3 - 1   puntos
* Ejercicio 4 - 2,5 puntos
* Ejercicio 5 - 3   puntos

### ENUNCIADOS


## Ejercicio 1 - Login usuarios

Para el sistema de la universidad estamos creando una validación de usuarios con distintos roles. Necesitamos hacer más eficiente 
el código para poder agregar muchos roles nuevos.

## Ejercicio 2 - Café expresso
En la oficina tenemos modelada una máquina de café expreso pero el sistema es muy lento y nos hace perder mucho tiempo en el 
desayuno por lo que algunos empleados se quedan sin desayunar. 

*¿Se te ocurre cómo mejorar el sistema que la maneja?
*¿Podés agregar algún test para saber si funciona bien?
     
## Ejercicio 3 - Mercería
La tía Coca tiene una mercería y le vendieron un sistema para registrar los movimientos de la caja chica. El sistema no es muy eficiente
*¿Podés darle una mano para que funcione mejor?*

## Ejercicio 4 - Horno de pan
_Olga_, una famosa fábrica de hornos automáticos de pan quiere actualizar su sistema para mejorar su producto y nos pidió que 
le hagamos una propuesta
*¿Qué mejora le harías?*

## Ejercicio 5
Estamos armando una aplicación para una conocida cadena de hostels que ofrece distnto tipo de habitaciones según las preferencias de los turistas.
El sistema que tienen hoy en día no les permite agregar con facilidad nuevas opciones. 
*¿Cómo lo mejorarías para darle esa posibilidad?*