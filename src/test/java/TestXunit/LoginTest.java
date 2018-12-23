package TestXunit;

import DemoXunit.Login;
import LoginData.LoginParams;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by duzhe on 2018/12/23.
 *
 * @Description:
 */
public class LoginTest {

    @Test(dataProvider = "getUsers", dataProviderClass = LoginParams.class)
    public void testLogin(String name1, String pwd1, String expect1){
        Login login = new Login();
        String ac = login.userLogin(name1,pwd1);
        Assert.assertEquals(ac,expect1);
    }

}
