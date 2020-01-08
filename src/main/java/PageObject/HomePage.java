package PageObject;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement newwomen;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement newdresses;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement newTshirts;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement meadium;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
		public WebElement getwomen(){
			return women;
			
		}
		public WebElement getdresses(){
			return dresses;
		}
		public WebElement gettshirts(){
			return tshirts;
		
		
		
	}
		
		public WebElement getnewwomen(){
			return newwomen;
	
}
		public WebElement getnewdresses(){
			return newdresses;
}

		public WebElement getnewTshirts(){
			return newTshirts;
		}
		
		public WebElement getsmall(){
			return small;
		}
		
		public WebElement getmeadium(){
			return meadium;
		}
		
		public WebElement getlarge(){
			return large;
		}
}
