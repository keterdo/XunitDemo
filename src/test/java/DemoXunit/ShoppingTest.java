package DemoXunit;

import Data.GenrateData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by duzhe on 2018/12/21.
 *
 * @Description:
 */
public class ShoppingTest {

    Login login = new Login();
    Shopping shopping = new Shopping();


    /**
     * 独立的登录测试
     * @param name
     * @param pwd
     * @param expect
     */
    @Test(dataProvider = "getUsers",dataProviderClass= GenrateData.class)
    public void testLogin(String name, String pwd, String expect){

        String actual = login.userLogin(name,pwd);

        Assert.assertEquals(actual, expect);

    }

    /**
     * 独立的购物测试
     * @param proId
     * @param count
     * @param expect
     */
    @Test(dataProvider = "getProducts", dataProviderClass = GenrateData.class, dependsOnMethods = {"LoginTest.testLogin"})
    public void testShopping(int proId, int count, int expect){
        int results = shopping.buys(proId,count);
        Assert.assertEquals(results,expect);
    }

    /**
     * 登录加购物流程测试
     * @param name
     * @param pwd
     * @param loginExpect
     * @param proId
     * @param count
     * @param shoppingExpect
     */
    @Test(dataProvider = "getUsersAndPros", dataProviderClass = GenrateData.class)  //parallel = true
    public void testShoppings(String name, String pwd, String loginExpect, int proId, int count, int shoppingExpect){
        String actual = login.userLogin(name,pwd);
        Assert.assertEquals(actual, loginExpect);
        int results = shopping.buys(proId,count);
        Assert.assertEquals(results,shoppingExpect);
    }

    /**
     * .xml文件中的参数化配置测试
     * @param param1
     * @param param2
     */
    @Test(parameters = {"aa","bb"})
    public void testS(String param1, String param2){//@Optional("test1")String param1, @Optional("test2")String param
        System.out.println(param1+param2);
    }



}
