package com.wanghao.springcloudzuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wanghao
 */
@Component
public class BaseZuulFilter extends ZuulFilter {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    // 单例多线程 开始时间绑定在线程上
    private ThreadLocal<Long> startTimeThreadLocal = new ThreadLocal<>();

    @Override
    public String filterType() {
        //在请求被处理之后，会进入该过滤器
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //请求开始计时
        long startTime = System.currentTimeMillis();
        startTimeThreadLocal.set(startTime);
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        String requestUri  = String.valueOf(context.get("requestURI"));

        //请求结束时间
        Long startTime = startTimeThreadLocal.get();
        Long endTime  = System.currentTimeMillis();
        logger.info("zuul日志记录：RequestUri:{},耗时{}ms", requestUri, endTime - startTime);
        return null;
    }
}
