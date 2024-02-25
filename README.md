Api de restaurantes 
Recursos: El recurso para esta API es creado una base de datos de restaurantes. 
Los atributos que tiene la tabla de restaurantes son:

id 
nombre 
estrellas 
lugar 
gastronomia 
menu 
menuinfantil 
precio 

La tabla esta realizada con datos ficticios y cada uno tiene su respectivo endpoint.
![image](https://github.com/RaulHerreraXAG/ApiRestRestaurante2/assets/116809074/7db1b707-f07b-43c7-9dbe-ce2143c9ddae)


Endpoints Todos los Endpoints partne de la raíz @RequestMapping("/api/restaurante"), el controlador tiene los siguientes endpoints:

@GetMappping("/") -> Obtiene todos los datos 
@GetMappping("/id/{id}") -> Obtiene todos los datos del restaurante con el id indicado
@GetMappping("/nombre/{nombre}") -> Obtiene todos los datos del restaurante con el nombre indicado 
@GetMappping("/estrellas/{estrellas}") -> Obtiene todos los datos de los restaurantes con la estrellas indicada 
@GetMappping("/lugar/{lugar}") -> Obtiene todos los datos del restaurante con el lugar indicado 
@GetMappping("/gastronomia/{gastronomia}") -> Obtiene todos los datos de los restaurantes con el tipo de gastronomia indicado 
@GetMappping("/menuDia/{menuDelDia}") -> Obtiene todos los datos de los restaurantes que se le indique si quiere que tenga menu del dia o no 
@GetMappping("/menuInfantil/{menuInfantil}") -> Obtiene todos los datos de los restaurantes que se le indique si quiere que tenga menu infantil o no 
@GetMappping("/precioMedio/{precioMedio}") -> Obtiene una lista con todos los datos de los restaurantes que tengan el precio medio indicado 
@GetMappping("/listaNombres") -> Devuelve una lista con todos los nombres de los restaurantes 
@GetMappping("/cantidad") -> Devuelve la cantidad de restaurantes que hay en la base de datos 
@GetMappping("/estrellasMinima/{estrellasMinima}") -> Devuelve la lista de restaurantes que tengan como mínimo la estrellas indicada 
@GetMappping("/precioMaximo/{precioMax}") -> Devuelve la lista de restaurantes que tengan como máximo el precio indicado
@GetMappping("/precioMinimo/{precioMin}") -> Devuelve la lista de restaurantes que tengan como mínimo el precio indicado 
@PostMapping("/post") -> Método para añadir un restaurante a la lista 
@PutMapping("/{id}") -> Método para modificar los datos de un restaurante, en caso de que se ponga un id que no esté en la base de datos, se creará un nuevo restaurante 
@DeleteMapping("/{id}") -> Método para borrar un restaurante de la lista indicando un id Los métodos post, put y delete se ha creado un token de seguridad definido en la clase SecurityService
