package me.steven.microservice.gateway.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Steven on 2017/1/18.
 */
public class UserPreFilter extends ZuulFilter {

    private static Logger logger = Logger.getLogger(UserPreFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        Object valid = request.getParameter("token");
        if (valid != null) {
            logger.warn("Invalid request");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        }

        return null;
    }

}
