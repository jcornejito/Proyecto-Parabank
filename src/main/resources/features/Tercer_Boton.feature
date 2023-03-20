#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Tercer Boton de Parabank
  Template creado para dar click en el tercer icono

  Background: Usuario esta en la pagina de Parabank
    Given El usuario esta en la home de Parabank

  @tag1
  Scenario Outline: Tercer Boton
    When El usuario da click al tercer icono
    Then El usuario sera rediregido a la pagina de atencion al cliente y El usuario ingresara <nombre> y <email> y <telefono> y <mensaje>

    Examples: 
      | nombre    | email               | telefono    | mensaje   |
      | "jhonell" | "pruebas@gmail.com" | "999728834" | "lunes20" |
