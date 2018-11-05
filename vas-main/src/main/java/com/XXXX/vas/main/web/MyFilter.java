package com.XXXX.vas.main.web;

import com.XXXX.vas.core.anno.RouteHandler;
import com.XXXX.vas.core.anno.RouteMapping;
import com.XXXX.vas.core.anno.RouteMethod;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

@RouteHandler(order = 1)
public class MyFilter {

    @RouteMapping(value = "*", method = RouteMethod.ROUTE)
    public Handler<RoutingContext> myFilter() {
        return ctx -> {
            System.err.println("i am the filter");
            ctx.next();
        };
    }
}
