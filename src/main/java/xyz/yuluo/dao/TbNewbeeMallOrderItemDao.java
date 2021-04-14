package xyz.yuluo.dao;

import org.springframework.stereotype.Repository;
import xyz.yuluo.entity.TbNewbeeMallOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbNewbeeMallOrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-14 19:37:57
 */
@Repository
public interface TbNewbeeMallOrderItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderItemId 主键
     * @return 实例对象
     */
    TbNewbeeMallOrderItem queryById(Long orderItemId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbNewbeeMallOrderItem> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbNewbeeMallOrderItem 实例对象
     * @return 对象列表
     */
    List<TbNewbeeMallOrderItem> queryAll(TbNewbeeMallOrderItem tbNewbeeMallOrderItem);

    /**
     * 新增数据
     *
     * @param tbNewbeeMallOrderItem 实例对象
     * @return 影响行数
     */
    int insert(TbNewbeeMallOrderItem tbNewbeeMallOrderItem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallOrderItem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbNewbeeMallOrderItem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallOrderItem> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbNewbeeMallOrderItem> entities);

    /**
     * 修改数据
     *
     * @param tbNewbeeMallOrderItem 实例对象
     * @return 影响行数
     */
    int update(TbNewbeeMallOrderItem tbNewbeeMallOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param orderItemId 主键
     * @return 影响行数
     */
    int deleteById(Long orderItemId);

}

