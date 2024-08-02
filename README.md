![image](https://github.com/user-attachments/assets/c34f43d5-6b38-48ef-ab66-3a4008409a9a)

![image](https://github.com/user-attachments/assets/7ffafeea-09a7-4d79-9897-7ba6d2cc8517)

El modo en el que se mide el rendimiento es thrpt (rendimiento), y mide la cantidad de operaciones realizadas por
segundo.
Los resultados muestran que el uso de parallelStream tiene un mejor rendimiento en comparación con sequentialStream.
parallelStream logra una tasa de rendimiento de 14,493 operaciones por segundo, mientras que sequentialStream alcanza
11,950 operaciones por segundo. El error para parallelStream es mayor, lo que indica más variabilidad en las mediciones,
pero en general, parallelStream es más eficiente, lo que mejora el rendimiento.

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- En la prueba de Benchmark no se puede ejecutar el mismo, cómo es que lo ejecutaron?
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Se podría analizar qué Modo de Benchmark utilizaron, por qué lo
  eligieron (o incluso comparar los resultados entre los distintos modos), análizar qué representan los resultados, cómo
  influye la tasa de errores, etc.

## Adicionales:

- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- Se podrían optimizar los imports
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package
  correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear 
- En ésta misma línea, les sugiero que sigan buenas prácticas al realizar commits, tales como utilizar verbos en
  imperativo y emplear prefijos para aportar claridad semántica. Les recomiendo leer éste artículo sobre un
  desarrollador español que aborda estos aspectos y otros puntos relevantes. [1]
- Además, he notado que los archivos no han sido formateados adecuadamente y no se ha respetado el número máximo de
  caracteres por línea (la línea gris vertical que tienen en Intellij marca justamente ésto). Un ejemplo es en el
  archivo `README.md`, donde las líneas largas dificultan la lectura al exceder los límites visibles de la pantalla. En
  IntelliJ, pueden formatear el código utilizando el atajo de teclado Ctrl + Alt + L [2]. Con otros shortcuts pueden
  optimizar los imports, y muchas cosas más, aunque esto puede variar según el caso si han cambiado la configuración por
  default.

### Bibliografía:

- \[1]: https://midu.dev/buenas-practicas-escribir-commits-git/
- \[2]: https://www.jetbrains.com/guide/java/tutorials/reading-code/formatting/#:~:text=If%20we%20encounter%20code%20that,L%20(Windows%2FLinux).



