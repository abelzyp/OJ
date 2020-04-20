package WrittenExam.Alibaba.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public class Container {

    /**
     * 集装箱里面可以装Goods
     */
    private List<Goods> goodsList;

    /**
     * 定义方法存放Goods
     */
    public void putGoods(Goods goods) {
        if (null == goodsList) {
            goodsList = new ArrayList<>();
        }
        goodsList.add(goods);
    }

    /**
     * 获取产品名称
     */
    public List<String> getGoodsList() {
        return goodsList.stream()
                .map(Goods::getGoods)
                .collect(Collectors.toList());
    }
}