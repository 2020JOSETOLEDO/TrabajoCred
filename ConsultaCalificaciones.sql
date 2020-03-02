

 select *
  from Calificaciones
 /*
información de las calificaciones de alumnos. 
genera una consulta que regresa una lista con los mejores alumnos (top 10%),
 ordenados por su promedio. 
*/
     select TOP 10    estudiante,
    materia,
   (Calificacion1 + Calificacion2 + Calificacion3 + Calificacion4 + Calificacion5) / 5  promedio_alumno
    from Calificaciones
order by promedio_alumno desc 