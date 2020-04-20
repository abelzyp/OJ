package WrittenExam.Alibaba.Container;

/**
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public class Solution {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        //定义一个集装箱和两个Goods
        Container container = new Container();
        Goods goodsA = new GoodsA("货物A");
        Goods goodsB = new GoodsB("货物B");

        //使用刚才定义的ContainerService类进行操作
        ContainerService containerService = new ContainerServiceImpl();
        containerService.put(goodsA, container);
        containerService.put(goodsB, container);

        //测试集装箱中装了啥
        System.out.println(container.getGoodsList());
        System.out.println("==========");

        // 针对题目的第三点,考虑代码的可扩展性，未来集装箱对能够装入其中的货物会增加更多的限制
        // 后续能够装入集装箱的货物,必须要继承Goods接口(这个接口代表一类货物标准)才可以放入集装箱
        //演示如下
        Goods goodsC = new GoodsC("货物C");
        containerService.put(goodsC, container);
        System.out.println(container.getGoodsList());
    }
}