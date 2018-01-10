package com.huatuo.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
/**
 * 权限控制，过滤没有权限的请求
 * @author kim
 *
 */
@Component
public class AccessFilter extends ZuulFilter  {
	
//    private static Logger log = (Logger) LoggerFactory.getLogger(AccessFilter.class);
    
    @Override
    public String filterType() {
    	//前置过滤器 
        return "pre";
    }
    
    @Override
    public int filterOrder() {
    	  //优先级，数字越大，优先级越低
        return 0;
    }
    
    @Override
    public boolean shouldFilter() {
    	 //是否执行该过滤器，true代表需要过滤  
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("accessToken");
        System.out.println("token+++++++++++"+accessToken+"++++++++++++++++++");
        if(accessToken == null) {
        	//过滤该请求，不往下级服务去转发请求，到此结束  
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"code\":\"401\",\"message\":\"accesstoken is empty\"}"); 
            return null;
        }
        return null;
    }
}
