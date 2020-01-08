package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.HomePage;

public class HomePageTest {
	
	BasePage bp;
	HomePage hp;
	
	public HomePageTest(){
		hp=new HomePage();
		bp=new BasePage();
	}
@Test
public void verifywomen1232(){
	Assert.assertTrue(hp.getwomen().isDisplayed(), "Failed");
	hp.getwomen().click();
	
}
@Test
public void verifydresses(){
	Assert.assertTrue(hp.getdresses().isDisplayed(), "Failed");
	hp.getdresses().click();
	
}
@Test
public void verifytshirts(){
	Assert.assertTrue(hp.gettshirts().isDisplayed(), "Failed");
	hp.gettshirts().click();
	
}

@Test
public void verifynewwomen(){
	Assert.assertTrue(bp.elementFound(hp.getnewwomen()));
	

}


@Test
public void verifynewdresses(){
	Assert.assertTrue(bp.elementFound(hp.getnewdresses()));
	
	
}

@Test
public void verifynewTshirts(){
	Assert.assertTrue(bp.elementFound(hp.getnewTshirts()));

}

@Test
public void verifysmall(){
	Assert.assertTrue(bp.elementFound(hp.getsmall()));

}

@Test
public void verifymeadium(){
	Assert.assertTrue(bp.elementFound(hp.getmeadium()));

}

@Test
public void verifylarge(){
	Assert.assertTrue(bp.elementFound(hp.getlarge()));

}
}
