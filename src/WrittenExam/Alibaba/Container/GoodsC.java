package WrittenExam.Alibaba.Container;

/**
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public class GoodsC implements Goods {

    /**
     * 货物名称
     */
    private String name;

    public GoodsC(String name) {
        this.name = name;
    }

    @Override
    public String getGoods() {
        return name;
    }

    @Override
    public String toString() {
        return "GoodsC是:" + name;
    }
}