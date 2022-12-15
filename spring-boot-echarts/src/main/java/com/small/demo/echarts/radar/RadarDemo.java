package com.small.demo.echarts.radar;

import org.icepear.echarts.Radar;
import org.icepear.echarts.charts.radar.RadarDataItem;
import org.icepear.echarts.components.coord.radar.RadarIndicator;
import org.icepear.echarts.render.Engine;
import org.springframework.stereotype.Service;


/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RadarDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/12/15 15:15
 * @Version ： 1.0
 **/
@Service
public class RadarDemo {


    public void  radar(){

        Radar radar = new Radar()
                .setTitle("Basic Radar")
                .setLegend()
                .setRadarAxis(new RadarIndicator[] {
                        new RadarIndicator().setName("Sales").setMax(6500),
                        new RadarIndicator().setName("Administration").setMax(16000),
                        new RadarIndicator().setName("Information Technology").setMax(30000),
                        new RadarIndicator().setName("Customer Support").setMax(38000),
                        new RadarIndicator().setName("Development").setMax(52000),
                        new RadarIndicator().setName("Marketing").setMax(25000) })
                .addSeries(new RadarDataItem[] {
                        new RadarDataItem()
                                .setValue(new Number[] { 4200, 3000, 20000, 35000, 50000, 18000 })
                                .setName("Allocated Budget"),
                        new RadarDataItem()
                                .setValue(new Number[] { 5000, 14000, 28000, 26000, 42000, 21000 })
                                .setName("Actual Spending") });

        Engine engine = new Engine();
        // The render method will generate our EChart into a HTML file saved locally in the current directory.
        // The name of the HTML can also be set by the first parameter of the function.
        engine.render("D:\\index.html", radar);
    }
}
