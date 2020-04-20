package WrittenExam.Alibaba.Container;

/**
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public class ContainerServiceImpl implements ContainerService {

    /**
     * 把Goods放入集装箱
     */
    @Override
    public boolean put(Goods goods, Container container) {
        if (goods != null) {
            container.putGoods(goods);
            return true;
        }
        return false;
    }
}