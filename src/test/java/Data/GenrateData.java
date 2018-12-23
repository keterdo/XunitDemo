package Data;

import DemoXunit.Products;
import org.testng.annotations.DataProvider;

/**
 * Created by duzhe on 2018/12/20.
 *
 * @Description:
 */
public class GenrateData {

    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"","","用户名或密码不能为空"},
                {"login","","用户名或密码不能为空"},
                {"","123456","用户名或密码不能为空"},
                {"admin","admin","欢迎管理员"},
//                {"","","用户名或密码不能为空"}
                {"login","123456","欢迎login"}
        };
    }

    //-2 未登录；-1 购买数量<=0；1 购买成功; 0 库存不足
    @DataProvider
    public Object[][] getProducts(){
        return new Object[][]{
                {1,1,0},
                {2,0,-1},
                {2,1,1},
                {3,10,0}
        };
    }

    /**
     * 用户&商品测试数据
     * @return{用户名,密码,预期登录结果,商品ID,购买数量,预期购买结果}
     */
    @DataProvider
    public Object[][] getUsersAndPros(){
        return new Object[][]{
                {"","","用户名或密码不能为空",1,1,-2},
                {"login","123456","欢迎login",2,1,1}
        };
    }

    /**
     * 用户&商品测试数据
     * @return{用户名,密码,预期登录结果,商品ID,购买数量,预期购买结果}
     */
    @DataProvider
    public Object[][] getUsersAndPro3(){
        return new Object[][]{
                {"login","123456","欢迎login",3,1,1},
                {"login","123456","欢迎login",3,1,1}
        };
    }
}
