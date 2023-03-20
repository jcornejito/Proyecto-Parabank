package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Botones_principales_Page {
	private WebDriver driver;
	public Botones_principales_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	private By link_home=By.linkText("home");
	private By link_register=By.linkText("about");
	private By link_email=By.linkText("contact");
	private By obtener_text=By.xpath("//*[@id=\"rightPanel\"]/h1");
	private By txtname=By.id("name");
	private By txtemail=By.id("email");
	private By txtfono=By.id("phone");
	private By txtmsg=By.id("message");
	private By obtener_text_principal=By.xpath("//*[@id=\"leftPanel\"]/h2");
	private By login_name=By.name("username");
	private By login_password=By.name("password");
	private By btn_click_login=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	private By btn_click_customer_care=By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input");
	public void click_link_home() {
		driver.findElement(link_home).click();
	}
	
	
	public void click_link_register_user() {
		driver.findElement(link_register).click();
	}
	public void click_link_email() {
		driver.findElement(link_email).click();
	}
	
	public String  GetText() {
		return driver.findElement(obtener_text).getText();
	}
	public String  GetText_Principal() {
	return driver.findElement(obtener_text_principal).getText();
}
	
	public void llenado_ficha(String nombre,String email,String telefono,String mensaje) {
		
		driver.findElement(txtname).sendKeys(nombre);
		driver.findElement(txtemail).sendKeys(email);
		driver.findElement(txtfono).sendKeys(telefono);
		driver.findElement(txtmsg).sendKeys(mensaje);
	
	}
	public void register_user(String user, String password) {
		driver.findElement(login_name).sendKeys(user);
		driver.findElement(login_password).sendKeys(password);
		
	}
	public void btn_click_register() {
		driver.findElement(btn_click_login).click();
	}
	public void btn_click_register_tercerbutton() {
		driver.findElement(btn_click_customer_care).click();
	}
	
 
}
