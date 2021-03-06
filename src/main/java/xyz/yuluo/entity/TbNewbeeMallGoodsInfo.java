package xyz.yuluo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbNewbeeMallGoodsInfo)实体类
 *
 * @author makejava
 * @since 2021-04-14 19:37:54
 */
public class TbNewbeeMallGoodsInfo implements Serializable {
    private static final long serialVersionUID = -98841074431350089L;
    /**
     * 商品表主键id
     */
    private Object goodsId;
    /**
     * 商品名
     */
    private String goodsName;
    /**
     * 商品简介
     */
    private String goodsIntro;
    /**
     * 关联分类id
     */
    private Long goodsCategoryId;
    /**
     * 商品主图
     */
    private String goodsCoverImg;
    /**
     * 商品轮播图
     */
    private String goodsCarousel;
    /**
     * 商品详情
     */
    private String goodsDetailContent;
    /**
     * 商品价格
     */
    private Integer originalPrice;
    /**
     * 商品实际售价
     */
    private Integer sellingPrice;
    /**
     * 商品库存数量
     */
    private Integer stockNum;
    /**
     * 商品标签
     */
    private String tag;
    /**
     * 商品上架状态 0-下架 1-上架
     */
    private Integer goodsSellStatus;
    /**
     * 添加者主键id
     */
    private Integer createUser;
    /**
     * 商品添加时间
     */
    private Date createTime;
    /**
     * 修改者主键id
     */
    private Integer updateUser;
    /**
     * 商品修改时间
     */
    private Date updateTime;


    public Object getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Object goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro;
    }

    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getGoodsCoverImg() {
        return goodsCoverImg;
    }

    public void setGoodsCoverImg(String goodsCoverImg) {
        this.goodsCoverImg = goodsCoverImg;
    }

    public String getGoodsCarousel() {
        return goodsCarousel;
    }

    public void setGoodsCarousel(String goodsCarousel) {
        this.goodsCarousel = goodsCarousel;
    }

    public String getGoodsDetailContent() {
        return goodsDetailContent;
    }

    public void setGoodsDetailContent(String goodsDetailContent) {
        this.goodsDetailContent = goodsDetailContent;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getGoodsSellStatus() {
        return goodsSellStatus;
    }

    public void setGoodsSellStatus(Integer goodsSellStatus) {
        this.goodsSellStatus = goodsSellStatus;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
