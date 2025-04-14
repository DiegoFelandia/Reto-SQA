Feature: Agregar productos al carrito

  Scenario: Agregar producto desde la sección Rosas y otro desde el buscador
    Given el usuario abre el sitio de San Ángel
    When navega a la sección "Rosas" desde el menú principal
      And ordena los productos por "Ordenar por precio: bajo a alto"
      And selecciona un producto de la lista con cantidad 2 y lo agrega al carrito
    And busca "lirios" usando el buscador del sitio
      And ordena los resultados por "Ordenar por popularidad"
      And selecciona un producto de la lista con cantidad 5 y lo agrega al carrito
    Then debe ver ambos productos con sus cantidades correctas en el carrito
