Secuencia de elementos donde cada elemento tiene un único predecesor (excepto el primero que no tiene predecesor) y un único sucesor (excepto el último que no tiene sucesor).

Las operaciones básicas de un TAD Lista son:
Agregar un elemento a la lista.
Eliminar un elemento de la lista.
Consultar un elemento de la lista.

Operaciones para AGREGAR:
addFirst(Object e): Agregar al principio de la lista.
addLast(Object e): Agregar al final de la lista.
insertAt(int index, Object e): Agregar elemento en un sitio en específico de la lista.

Operaciones de CONSULTA:
isEmpty(): devuelve true si la lista está vacía; en otro caso, false.
contains(Object elem): devuelve true si en la lista se encuentra el elemento 'elem'; en otro caso, false.
getSize(): devuelve el número de elementos de la lista.
getIndexOf(Object elem): devuelve la posición en la que se encuentra el elemento 'elem'.
getFirst(): devuelve el primer elemento.
getLAst(): devuelve el último elemento.
getAt(int index): devuelve el elemento de la posición 'index'.
toString(): 

Operaciones de BORRADO:
removeFirst(): eliminar el primer elemento.
removeLast(): eliminar el último elemento.
removeAll(Object elem): eliminar el elemento 'elem'.
removeAt(int index): eliminar elemento de la posición 'index'.