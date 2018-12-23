package DemoXunit;

import org.testng.annotations.Test;

/**
 * Created by duzhe on 2018/12/23.
 *
 * @Description:
 */
public class ParamDataTest {

    /**
     * .xml文件中的参数化配置测试
     * @param param1
     * @param param2
     */
    @Test(parameters = {"aa","bb"})
    public void testParams(String param1, String param2){  //@Optional("test1")String param1, @Optional("test2")String param

        System.out.println(param1+param2);
    }

}
