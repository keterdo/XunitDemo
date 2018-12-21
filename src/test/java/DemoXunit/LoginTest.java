package DemoXunit;

import Data.GenrateData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by duzhe on 2018/12/18.
 *
 * @Description:
 */
public class LoginTest {

    Login login = new Login();


    @Test(dataProvider = "getUsers",dataProviderClass= GenrateData.class)
    public void testLogin(String name, String pwd, String expect){

        String actual = login.userLogin(name,pwd);

        Assert.assertEquals(actual, expect);

    }

//    @Test(dependsOnMethods={"testLogin"})
//    public void test2(){
//
//    }

}
