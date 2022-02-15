@Todo
Feature: Prueba Tecnova Automatizador por Guillermo Chacon

##  @TestBase @Regrecion

    Scenario Outline: Caso de prueba 2 Realizar un flujo end to end que realice lo siguiente
    Given Ir a la url de trello y Loguearse en la aplicación <correo> y <contraseña>
    When Crear Tablero
    When Crear Listas Por Hacer En Proceso Finalizado
    And Generar una tarjeta nueva en la lista por hacer
    Then Mover la tarjeta previamente creada a En proceso
    And cerrar

    Examples:
      | correo | contraseña |
      | "badtastemovie@gmail.com"| "Prueba-123456" |

  Scenario Outline: Iniciar Sesion Trello
    Given usuario en pagina trello preciona boton inicio de sesion
    When ingresar <correo> y <contraseña> presionar boton iniciar sesion
    Then ingresa a pagina principal
    Examples:
      | correo | contraseña |
      | "badtastemovie@gmail.co"| "Prueba-123456" |
      | "badtastemovie@gmail.com"| "Prueba-12345" |
      | "badtastemodee@gmail.com"| "Prueba-123456" |
      | "badtastemovie@gmail.com"| "Prueba-123456" |

