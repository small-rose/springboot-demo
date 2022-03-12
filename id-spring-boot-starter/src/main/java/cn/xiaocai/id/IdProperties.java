package cn.xiaocai.id;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IdProperties ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:08
 * @Version ： 1.0
 **/

@ConfigurationProperties(
        prefix = "small-id"
)
public class IdProperties {
    private long id;
    private long sequence;
    private long timeBit = 40L;
    private long idBit = 9L;
    private long timeBackBit = 2L;
    private long sequenceBit = 12L;
    private long timeBackMaxTime = 86400000L;
    private long lastTimestamp = -1L;
    private long timeBackCount = 0L;
    private String idMode;

    public IdProperties() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSequence() {
        return this.sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public long getTimeBit() {
        return this.timeBit;
    }

    public void setTimeBit(long timeBit) {
        this.timeBit = timeBit;
    }

    public long getIdBit() {
        return this.idBit;
    }

    public void setIdBit(long idBit) {
        this.idBit = idBit;
    }

    public long getTimeBackBit() {
        return this.timeBackBit;
    }

    public void setTimeBackBit(long timeBackBit) {
        this.timeBackBit = timeBackBit;
    }

    public long getSequenceBit() {
        return this.sequenceBit;
    }

    public void setSequenceBit(long sequenceBit) {
        this.sequenceBit = sequenceBit;
    }

    public long getTimeBackMaxTime() {
        return this.timeBackMaxTime;
    }

    public void setTimeBackMaxTime(long timeBackMaxTime) {
        this.timeBackMaxTime = timeBackMaxTime;
    }

    public long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public void setLastTimestamp(long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public long getTimeBackCount() {
        return this.timeBackCount;
    }

    public void setTimeBackCount(long timeBackCount) {
        this.timeBackCount = timeBackCount;
    }

    public String getIdMode() {
        return this.idMode;
    }

    public void setIdMode(String idMode) {
        this.idMode = idMode;
    }
}