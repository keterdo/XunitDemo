package DemoXunit;

/**
 * Created by duzhe on 2018/12/18.
 *
 * @Description:
 */
public class Shopping {

    Products pro = null;

    /**
     * 通过ID查找商品价格
     * @param proId 商品ID
     * @return 商品价格 ； -1 没有此商品；
     */
    public int getPrice(int proId){

        if (proId < 0 ){ //1

            return -1;
        }else{
            Products p= Products.getPro(proId);
            return p.getPrice();
        }

    }


    /**
     * 判断库存数量，购买商品
     * @param proId
     * @param count 购买数量
     * @return 0 库存不足； 1 购买成功；
     */
    public int buy(int proId, int count){

        pro = getPro(proId);
        int proCount = pro.getCount();

        if(proCount >= count ){
            pro.setCount(proCount - count );
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * 通过ID获取商品信息
     * @param proId
     * @return 商品信息
     */
    public Products getPro(int proId){

        if(proId <= 0){

            return null;
        }else{
            return Products.getPro(proId);
        }

    }


    /**
     *
     * @param proId
     * @param count
     * @return
     */
    public int buys(int proId, int count){
        //欲购买数量是否大于0
        if(count <= 0){
            return -1;
        }

        pro = getPro(proId);
        int proCount = pro.getCount();

        //库存充盈，可以购买
        if(proCount >= count ){
            //购买成功，减少对应库存数，且库存最低为0
            if((proCount - count) >= 0) {
                pro.setCount(proCount - count);
            }else{
                pro.setCount(0);
            }

            return 1;
        }else{
            return 0;
        }
    }

}
