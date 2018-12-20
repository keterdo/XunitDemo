package Data;

import org.testng.annotations.DataProvider;

/**
 * Created by duzhe on 2018/12/20.
 *
 * @Description:
 */
public class GenrateData {

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"","","用户名或密码不能为"},
                {"login","","用户名或密码不能为空"},
                {"","123456","用户名或密码不能为空"},
                {"admin","admin","欢迎管理员"},
                {"login","123456","欢迎login"}
        };
    }
}
