package xyz.yuluo.dao;

import org.springframework.stereotype.Repository;
import xyz.yuluo.entity.TbNewbeeMallGoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbNewbeeMallGoodsCategory)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-14 19:37:54
 */
@Repository
public interface TbNewbeeMallGoodsCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param categoryId 主键
     * @return 实例对象
     */
    TbNewbeeMallGoodsCategory queryById(Long categoryId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbNewbeeMallGoodsCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbNewbeeMallGoodsCategory 实例对象
     * @return 对象列表
     */
    List<TbNewbeeMallGoodsCategory> queryAll(TbNewbeeMallGoodsCategory tbNewbeeMallGoodsCategory);

    /**
     * 新增数据
     *
     * @param tbNewbeeMallGoodsCategory 实例对象
     * @return 影响行数
     */
    int insert(TbNewbeeMallGoodsCategory tbNewbeeMallGoodsCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallGoodsCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbNewbeeMallGoodsCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallGoodsCategory> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbNewbeeMallGoodsCategory> entities);

    /**
     * 修改数据
     *
     * @param tbNewbeeMallGoodsCategory 实例对象
     * @return 影响行数
     */
    int update(TbNewbeeMallGoodsCategory tbNewbeeMallGoodsCategory);

    /**
     * 通过主键删除数据
     *
     * @param categoryId 主键
     * @return 影响行数
     */
    int deleteById(Long categoryId);

}

