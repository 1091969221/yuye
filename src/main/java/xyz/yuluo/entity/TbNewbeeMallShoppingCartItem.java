package xyz.yuluo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbNewbeeMallShoppingCartItem)实体类
 *
 * @author makejava
 * @since 2021-04-14 19:37:57
 */
public class TbNewbeeMallShoppingCartItem implements Serializable {
    private static final long serialVersionUID = -39019641462952436L;
    /**
     * 购物项主键id
     */
    private Long cartItemId;
    /**
     * 用户主键id
     */
    private Long userId;
    /**
     * 关联商品id
     */
    private Long goodsId;
    /**
     * 数量(最大为5)
     */
    private Integer goodsCount;
    /**
     * 删除标识字段(0-未删除 1-已删除)
     */
    private Integer isDeleted;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最新修改时间
     */
    private Date updateTime;


    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
