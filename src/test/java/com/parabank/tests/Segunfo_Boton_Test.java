package com.parabank.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parabank.pages.Botones_principales_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Segunfo_Boton_Test {
private WebDriver driver;
private  void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\GIT\\Practica_Automation\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();}

/*@Given("El usuario esta en la home de Parabank")
public void el_usuario_esta_en_la_home_de_Parabank() {
 Botones_principales_Page result=new Botones_principales_Page(driver);
	Setup();
}*/
	@When("El usuario da click al segundo icono")
	public void el_usuario_da_click_al_segundo_icono() {
		Setup();
	   Botones_principales_Page result=new Botones_principales_Page(driver);
	   result.click_link_register_user();
	}

	@Then("El usuario sera rediregido al login donde colocara su {string} y {string}")
	public void el_usuario_sera_rediregido_al_login_donde_colocara_su_y(String nombre,String password) {
		 Botones_principales_Page result=new Botones_principales_Page(driver);
		 result.register_user(nombre, password);
		 result.btn_click_register();
	}
}
