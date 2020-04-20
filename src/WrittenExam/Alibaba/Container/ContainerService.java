package WrittenExam.Alibaba.Container;

/**
 * 评测题目:
 * ContainerService接口的put方法表示将货物放入一个集装箱。假设集装箱只有一种，但货物有多种，如A和B，请：
 * 1. 完成下面的接口实现，并补充其他相关的类或成员变量
 * 2. 请写一个单元测试验证put方法的正确性
 * 3. 在实现1、2的基础上，考虑代码的可扩展性，未来集装箱对能够装入其中的货物会增加更多的限制
 *
 * @author Zhang Yupeng
 * @since 2020/4/20
 */
public interface ContainerService {
    boolean put(Goods goods, Container container);
}
