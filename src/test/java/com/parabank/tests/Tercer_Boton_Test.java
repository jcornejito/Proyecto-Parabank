package com.parabank.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.parabank.pages.Botones_principales_Page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tercer_Boton_Test {
	private WebDriver driver;
	
	
	private  void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\GIT\\Practica_Automation\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();}
	
	
	@When("El usuario da click al tercer icono")
	public void el_usuario_da_click_al_tercer_icono() {
		Setup();
	   Botones_principales_Page result=new Botones_principales_Page(driver);
	   result.click_link_email();
	}

	@Then("El usuario sera rediregido a la pagina de atencion al cliente y El usuario ingresara {string} y {string} y {string} y {string}")
	public void el_usuario_sera_rediregido_al_login_donde_colocara_su_y(String nombre, String email, String telefono,String mensaje) {
		 Botones_principales_Page result=new Botones_principales_Page(driver);
		result.llenado_ficha(nombre, email, telefono, mensaje);
		result.btn_click_register_tercerbutton();
	}
}


