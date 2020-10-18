package com.fedserver.web.controller.tool;

import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fedserver.common.core.controller.BaseController;

/**
 * swagger 接口
 * 
 * @author fedserver
 */
@Controller
@RequestMapping("/tool/swagger")
@Api(tags = "swagger 接口")
public class SwaggerController extends BaseController
{
    @RequiresPermissions("tool:swagger:view")
    @GetMapping()
    public String index()
    {
        return redirect("/swagger-ui.html");
    }
}
