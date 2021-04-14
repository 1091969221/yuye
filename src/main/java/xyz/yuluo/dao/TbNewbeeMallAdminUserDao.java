package xyz.yuluo.dao;

import org.springframework.stereotype.Repository;
import xyz.yuluo.entity.TbNewbeeMallAdminUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbNewbeeMallAdminUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-14 19:37:48
 */
@Repository
public interface TbNewbeeMallAdminUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adminUserId 主键
     * @return 实例对象
     */
    TbNewbeeMallAdminUser queryById(Integer adminUserId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbNewbeeMallAdminUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbNewbeeMallAdminUser 实例对象
     * @return 对象列表
     */
    List<TbNewbeeMallAdminUser> queryAll(TbNewbeeMallAdminUser tbNewbeeMallAdminUser);

    /**
     * 新增数据
     *
     * @param tbNewbeeMallAdminUser 实例对象
     * @return 影响行数
     */
    int insert(TbNewbeeMallAdminUser tbNewbeeMallAdminUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallAdminUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbNewbeeMallAdminUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbNewbeeMallAdminUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbNewbeeMallAdminUser> entities);

    /**
     * 修改数据
     *
     * @param tbNewbeeMallAdminUser 实例对象
     * @return 影响行数
     */
    int update(TbNewbeeMallAdminUser tbNewbeeMallAdminUser);

    /**
     * 通过主键删除数据
     *
     * @param adminUserId 主键
     * @return 影响行数
     */
    int deleteById(Integer adminUserId);

}

