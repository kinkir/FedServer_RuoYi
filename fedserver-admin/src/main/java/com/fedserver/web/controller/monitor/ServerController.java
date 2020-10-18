package com.fedserver.web.controller.monitor;

import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fedserver.common.core.controller.BaseController;
import com.fedserver.framework.web.domain.Server;

/**
 * 服务器监控
 * 
 * @author fedserver
 */
@Controller
@RequestMapping("/monitor/server")
@Api(tags = "服务器监控")
public class ServerController extends BaseController
{
    private String prefix = "monitor/server";

    @RequiresPermissions("monitor:server:view")
    @GetMapping()
    public String server(ModelMap mmap) throws Exception
    {
        Server server = new Server();
        server.copyTo();
        mmap.put("server", server);
        return prefix + "/server";
    }
}
