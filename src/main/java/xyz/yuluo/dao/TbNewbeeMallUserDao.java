package xyz.yuluo.dao;

import org.springframework.stereotype.Repository;
import xyz.yuluo.entity.TbNewbeeMallUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbNewbeeMallUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-14 19:37:58
 */
@Repository
public interface TbNewbeeMallUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TbNewbeeMallUser queryById(Long userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbNewbeeMallUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbNewbeeMallUser 实例对象
     * @return 对象列表
     */
    List<TbNewbeeMallUser> queryAll(TbNewbeeMallUser tbNewbeeMallUser);

    /**
     * 新增数据
     *
     * @param tbNewbeeMallUser 实例对象
     * @return 影响行数
     */
    int insert(TbNewbeeMallUser tbNewbeeMallUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbNewbeeMallUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbNewbeeMallUser> entities);

    /**
     * 修改数据
     *
     * @param tbNewbeeMallUser 实例对象
     * @return 影响行数
     */
    int update(TbNewbeeMallUser tbNewbeeMallUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Long userId);

}

