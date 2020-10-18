package com.fedserver.web.controller.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 报表
 * 
 * @author fedserver
 */
@Controller
@RequestMapping("/demo/report")
@Api(tags = "报表")
public class DemoReportController
{
    private String prefix = "demo/report";

    /**
     * 百度ECharts
     */
    @GetMapping("/echarts")
    public String echarts()
    {
        return prefix + "/echarts";
    }

    /**
     * 图表插件
     */
    @GetMapping("/peity")
    public String peity()
    {
        return prefix + "/peity";
    }

    /**
     * 线状图插件
     */
    @GetMapping("/sparkline")
    public String sparkline()
    {
        return prefix + "/sparkline";
    }

    /**
     * 图表组合
     */
    @GetMapping("/metrics")
    public String metrics()
    {
        return prefix + "/metrics";
    }
}
