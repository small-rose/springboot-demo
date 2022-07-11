package cn.xiaocai.demo.jfreechart.timeseries;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.*;
import org.jfree.data.xy.XYDataset;
import org.junit.Test;

import java.awt.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestTimeSeriesChart ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 13:47
 * @Version ： 1.0
 **/
public class TestTimeSeriesChart {

    private static XYDataset createDataset() {
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        Day day = new Day(21, 9, 2008);
        Hour hour22 = new Hour(22, day);
        Hour hour23 = new Hour(23, day);

        //TimeSeries timeSeries1 = new TimeSeries("缴费通知接口", Minute.class);
//        timeSeries1.add(new Minute(25, hour23), 2.80);
//        timeSeries1.add(new Minute(22, hour23), 2.59);
//        timeSeries1.add(new Minute(32, hour22), 2.38);
//        timeSeries1.add(new Minute(14, hour22), 2.35);
//        timeSeries1.add(new Minute(18, hour23), 2.34);
//


        //dataset.addSeries(timeSeries1);
        return dataset;
    }

    public static void createTimeSeriesChart() {
        JFreeChart timeSeriesChart = ChartFactory.createTimeSeriesChart(
                "缴费通知接口耗时曲线", "播放时间", "收视率百分点", createDataset(), true,
                true, false);
        timeSeriesChart.setBackgroundPaint(Color.YELLOW);
        XYPlot plot = timeSeriesChart.getXYPlot();
        setXYPolt(plot);

        ChartFrame frame = new ChartFrame("TestPieChart", timeSeriesChart);
        frame.pack();
        frame.setVisible(true);
    }

    public static void setXYPolt(XYPlot plot) {
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        // plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        XYItemRenderer r = plot.getRenderer();
        if (r instanceof XYLineAndShapeRenderer) {
            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
            //renderer.setBaseShapesVisible(true);
            //renderer.setBaseShapesFilled(false);
        }
    }


    @Test
    public void testTimeSeriesChart(){
        createTimeSeriesChart();
    }
}
