package xyz.yuluo.dao;

import org.springframework.stereotype.Repository;
import xyz.yuluo.entity.TbNewbeeMallCarousel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbNewbeeMallCarousel)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-14 19:37:53
 */
@Repository
public interface TbNewbeeMallCarouselDao {

    /**
     * 通过ID查询单条数据
     *
     * @param carouselId 主键
     * @return 实例对象
     */
    TbNewbeeMallCarousel queryById(Integer carouselId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbNewbeeMallCarousel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbNewbeeMallCarousel 实例对象
     * @return 对象列表
     */
    List<TbNewbeeMallCarousel> queryAll(TbNewbeeMallCarousel tbNewbeeMallCarousel);

    /**
     * 新增数据
     *
     * @param tbNewbeeMallCarousel 实例对象
     * @return 影响行数
     */
    int insert(TbNewbeeMallCarousel tbNewbeeMallCarousel);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallCarousel> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbNewbeeMallCarousel> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallCarousel> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbNewbeeMallCarousel> entities);

    /**
     * 修改数据
     *
     * @param tbNewbeeMallCarousel 实例对象
     * @return 影响行数
     */
    int update(TbNewbeeMallCarousel tbNewbeeMallCarousel);

    /**
     * 通过主键删除数据
     *
     * @param carouselId 主键
     * @return 影响行数
     */
    int deleteById(Integer carouselId);

}

