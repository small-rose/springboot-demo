package com.xiaocai.demo.excel.clazz;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/17 20:44
 * @version: v1.0
 */

@Data
public class TransDtl implements Serializable {

    @JSONField( name = "交易日期")
    private String bugDate;
    @JSONField ( name = "交易账号")
    private String bugNum;
    @JSONField ( name = "交易流水号")
    private String bugnum;
    @JSONField ( name = "交易类型")
    private String bugType;
    @JSONField ( name = "交易时间")
    private String bugTime;
    @JSONField ( name = "交易金额")
    private String bugMoney;
    @JSONField ( name = "交易机构号")
    private String bugJGNum;
    @JSONField ( name = "交易机构名")
    private String jGname;
    @JSONField ( name = "附言")
    private String fuyan;
    @JSONField ( name = "付款人")
    private String fukuanren;
    @JSONField ( name = "付款账号")
    private String fukuanNum;
    @JSONField ( name = "付款账户机构名")
    private String fukuanJG;
    @JSONField ( name = "付款账户机构号")
    private String fukuanJGNum;
    @JSONField ( name = "交易码")
    private String jiaoyima;
    @JSONField ( name = "交易货币")
    private String jiaoyihuobi;
    @JSONField ( name = "借贷标识")
    private String jiedaibiaoshi;
    @JSONField ( name = "冲正标识")
    private String chongzhengbiaoshi;
    @JSONField ( name = "交易柜员")
    private String jiaoyiGY;
    @JSONField ( name = "交易后余额")
    private String jiaoyiYE;
    @JSONField ( name = "备注")
    private String jiaoyiBZ;
    @JSONField ( name = "用途")
    private String jiaoyiYT;
    @JSONField ( name = "摘要")
    private String jiaoyiZY;
    @JSONField ( name = "收款人")
    private String shoukuanren;
    @JSONField ( name = "收款账号")
    private String shoukuanNum;
    @JSONField ( name = "收款所属机构名")
    private String shoukuanJG;
    @JSONField ( name = "收款账户机构号")
    private String shoukuanJGNum;


    @Override
    public String toString() {
        return "TransDtl{" +
                "bugDate=" + bugDate +
                ", bugNum=" + bugNum +
                ", bugnum=" + bugnum +
                ", bugType='" + bugType + '\'' +
                ", bugTime='" + bugTime + '\'' +
                ", bugMoney=" + bugMoney +
                ", bugJGNum=" + bugJGNum +
                ", jGname='" + jGname + '\'' +
                ", fuyan='" + fuyan + '\'' +
                ", fukuanren='" + fukuanren + '\'' +
                ", fukuanNum='" + fukuanNum + '\'' +
                ", fukuanJG='" + fukuanJG + '\'' +
                ", fukuanJGNum=" + fukuanJGNum +
                ", jiaoyima=" + jiaoyima +
                ", jiaoyihuobi='" + jiaoyihuobi + '\'' +
                ", jiedaibiaoshi=" + jiedaibiaoshi +
                ", chongzhengbiaoshi=" + chongzhengbiaoshi +
                ", jiaoyiGY=" + jiaoyiGY +
                ", jiaoyiYE=" + jiaoyiYE +
                ", jiaoyiBZ='" + jiaoyiBZ + '\'' +
                ", jiaoyiYT='" + jiaoyiYT + '\'' +
                ", jiaoyiZY='" + jiaoyiZY + '\'' +
                ", shoukuanren='" + shoukuanren + '\'' +
                ", shoukuanNum=" + shoukuanNum +
                ", shoukuanJG='" + shoukuanJG + '\'' +
                ", shoukuanJGNum=" + shoukuanJGNum +
                '}';
    }
}
