# Ejercicios Adicionales Patrones de Diseño

## 1. File Manager

Existe un File Manager que permite crear nuevos archivos, la cantidad que fuere y listarlos. De los archivos se conoce:

- Nombre
- Extensión
- Tamaño
- Fecha de creación
- Fecha de modificación
- Permisos (Lectura solo o lectura/escritura)

Implemente la clase Archivo para que gestione estas propiedades. En el File Manager el cliente debe poder elegir cómo se
muestra un archivo (instancia de la clase Archivo), es decir, cuáles de las propiedades mencionadas anteriormente se
muestran, y en qué orden. Esto quiere decir que un cliente podría querer ver los archivos de muchas maneras. Algunas de
ellas son:

- nombre - extensión
- nombre - extensión - fecha de creación
- permisos - nombre - extensión - tamaño

Para esto, el objeto o los objetos que representen a los archivos debe o deben entender el mensaje prettyPrint(). Es
decir, un objeto cliente (digamos el FileManager) le enviará al objeto que Ud. determine, el mensaje prettyPrint(). De
acuerdo a cómo el usuario lo haya configurado se deberá retornar un String con los aspectos seleccionados por el usuario
en el orden especificado por éste. En una misma ejecución del programa la misma lista de archivos debería poder
mostrarse de dos maneras diferentes segun elija el cliente.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la clase FileManager, Archivo y la o las clases necesarias para permitir que los archivos se impriman según
  elección del cliente.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.

## 2. Exportador

Refactorice el código que se encuentra en el paquete `ejercicio2` para permitir realizar la exportacion a json además de
con la implementación actual, con la librería [gson](https://github.com/google/gson). El diseño debe permitir a los
clientes elegir que implementacion utilizar.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la solución.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.

## 3. Media Player

Usted ha implementado las clases que se encuentran en el paquete `ejercicio3`, para reproducir archivos de audio y video
en formatos que usted ha diseñado. Cada `Media` se puede reproducir con el mensaje `play()`. Para continuar con el
desarrollo, usted desea incorporar la posibilidad de reproducir Video stream. Para ello, dispone de la clase
`VideoStream` que pertenece a una librería de terceros y usted no puede ni debe modificarla. El desafío que se le
presenta es hacer que la clase MediaPlayer pueda interactuar con la clase VideoStream.

Se pide:

- Indique qué patrón de diseño sería adecuado para la solución y justifique la respuesta.
- Implemente la solución.
- Escriba una Main que muestre cómo se utilizará su implementación.
- Diagrama de clases de la solución implementada.

Fuente: Ejercicio tomado de la materia Objetos 2 de la UNLP.
