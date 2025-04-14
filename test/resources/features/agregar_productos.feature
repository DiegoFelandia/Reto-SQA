Feature: Agregar productos al carrito

  Scenario: Agregar producto desde Rosas y otro desde el buscador con fecha y adiciones
    Given el usuario abre el sitio de San Ángel
    When navega a la sección "Rosas" desde el menú principal
      And ordena los productos por "Ordenar por precio: bajo a alto"
      And selecciona un producto de la lista con cantidad 2
      And selecciona "Mañana 15 abril" como fecha de envío
      And selecciona la franja horaria "2:00 p.m. - 7:00 p.m"
      And añade la adición "Vino" al producto
      And lo agrega al carrito
    And busca "lirios" usando el buscador del sitio
      And ordena los resultados por "Ordenar por popularidad"
      And selecciona un producto de la lista con cantidad 5
      And selecciona "Mañana 15 abril" como fecha de envío
      And selecciona la franja horaria "2:00 p.m. - 7:00 p.m"
      And lo agrega al carrito
    Then debe ver ambos productos con sus cantidades correctas en el carrito
