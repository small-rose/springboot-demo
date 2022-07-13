package cn.xiaocai.demo.kingbase.web.model.kingbase;

import java.math.BigDecimal;
import java.util.Date;

public class KbAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.id
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.name
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.pass
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private String pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.add_date
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private Date addDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.last_login
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private Date lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.balance
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private BigDecimal balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.description
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.head_image
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    private byte[] headImage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.id
     *
     * @return the value of t_account.id
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.id
     *
     * @param id the value for t_account.id
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.name
     *
     * @return the value of t_account.name
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.name
     *
     * @param name the value for t_account.name
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.pass
     *
     * @return the value of t_account.pass
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public String getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.pass
     *
     * @param pass the value for t_account.pass
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.add_date
     *
     * @return the value of t_account.add_date
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.add_date
     *
     * @param addDate the value for t_account.add_date
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.last_login
     *
     * @return the value of t_account.last_login
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.last_login
     *
     * @param lastLogin the value for t_account.last_login
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.balance
     *
     * @return the value of t_account.balance
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.balance
     *
     * @param balance the value for t_account.balance
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.description
     *
     * @return the value of t_account.description
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.description
     *
     * @param description the value for t_account.description
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.head_image
     *
     * @return the value of t_account.head_image
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public byte[] getHeadImage() {
        return headImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.head_image
     *
     * @param headImage the value for t_account.head_image
     *
     * @mbg.generated Wed Jul 13 07:53:08 CST 2022
     */
    public void setHeadImage(byte[] headImage) {
        this.headImage = headImage;
    }
}