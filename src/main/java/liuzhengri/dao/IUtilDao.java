package liuzhengri.dao;

public interface IUtilDao {
    /**
     * 查询 主键
     * @param id
     * @param T
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T select(Long id, Class T) throws Exception;

    /**
     * 保存
     * @param obj
     * @param <T>
     * @return
     */
    <T> T save(T obj);
}
