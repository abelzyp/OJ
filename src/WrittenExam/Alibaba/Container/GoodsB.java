package WrittenExam.Alibaba.Container;

/**
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public class GoodsB implements Goods {

    /**
     * 货物名称
     */
    private String name;

    public GoodsB(String name) {
        this.name = name;
    }

    @Override
    public String getGoods() {
        return name;
    }

    @Override
    public String toString() {
        return "GoodsB是:" + name;
    }
}