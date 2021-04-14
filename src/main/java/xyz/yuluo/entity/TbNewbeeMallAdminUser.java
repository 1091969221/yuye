package xyz.yuluo.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TbNewbeeMallAdminUser)实体类
 *
 * @author makejava
 * @since 2021-04-14 19:37:47
 */

public class TbNewbeeMallAdminUser implements Serializable {
    private static final long serialVersionUID = 443984865731303305L;
    /**
     * 管理员id
     */
    private Integer adminUserId;
    /**
     * 管理员登陆名称
     */
    private String loginUserName;
    /**
     * 管理员登陆密码
     */
    private String loginPassword;
    /**
     * 管理员显示昵称
     */
    private String nickName;
    /**
     * 是否锁定 0未锁定 1已锁定无法登陆
     */
    private Integer locked;


    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

}
