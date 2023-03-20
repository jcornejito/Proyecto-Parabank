package com.parabank.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parabank.pages.Botones_principales_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Primer_BotonTest  {
	public WebDriver driver;
	 Botones_principales_Page result;
	 public void Setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\GIT\\Practica_Automation\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();}
	
	@Given("El usuario esta en la home de Parabank")
	public void el_usuario_esta_en_la_home_de_Parabank() {
	 Botones_principales_Page result=new Botones_principales_Page(driver);
		Setup();
	}

	@When("El usuario da click al primer icono")
	public void el_usuario_da_click_al_primer_icono() {
		Botones_principales_Page result=new Botones_principales_Page(driver);
		result.click_link_home();
	}

	@Then("El usuario sera rediregido a la home de parabank")
	public void el_usuario_sera_rediregido_a_la_home_de_parabank() {
		Botones_principales_Page result=new Botones_principales_Page(driver);
	   Assert.assertEquals(result.GetText_Principal(),"Customer Login");
		
	}

}
