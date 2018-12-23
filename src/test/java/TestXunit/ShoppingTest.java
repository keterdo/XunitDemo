package TestXunit;

import DemoXunit.Login;
import DemoXunit.Shopping;
import LoginData.DataParams;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by duzhe on 2018/12/23.
 *
 * @Description:
 */
public class ShoppingTest {


    Login login = new Login();
    Shopping shopping = new Shopping();

//    @BeforeClass
//    public void beforeMethod(){
//
//        login.userLogin("zhangsan","123456");
//    }

    @Test(dataProvider = "getProPrice",dataProviderClass = DataParams.class, dependsOnMethods = "LoginTest.testLogin")
    public void testGetPrice(int proId, int expect){
        int price = shopping.getPrice(proId);
        Assert.assertEquals(price,expect);
    }

//    @AfterClass
//    public void AfterMethod(){
//        login.userLogin("","");
//    }
}
