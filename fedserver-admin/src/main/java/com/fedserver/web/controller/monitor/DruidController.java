package com.fedserver.web.controller.monitor;

import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fedserver.common.core.controller.BaseController;

/**
 * druid 监控
 * 
 * @author fedserver
 */
@Controller
@RequestMapping("/monitor/data")
@Api(tags = "监控")
public class DruidController extends BaseController
{
    private String prefix = "/druid";

    @RequiresPermissions("monitor:data:view")
    @GetMapping()
    public String index()
    {
        return redirect(prefix + "/index");
    }
}
