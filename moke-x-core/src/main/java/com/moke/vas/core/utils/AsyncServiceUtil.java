package com.moke.vas.core.utils;

import com.moke.vas.core.vertx.VertxUtil;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ServiceProxyBuilder;
import org.apache.naming.factory.webservices.ServiceProxy;

public final class AsyncServiceUtil {

    public static <T> T getAsyncServiceInstance(Class<T> asClazz, Vertx vertx) {
        String address = asClazz.getName();
        return new ServiceProxyBuilder(vertx).setAddress(address).build(asClazz);
//        return new ServiceProxy()
//        return 0;
    }

    /**the address here should be same with the address when verticle start to register **/

    public static <T> T getAsyncServiceInstance(Class<T> asClazz) {
        String address = asClazz.getName();
        return new ServiceProxyBuilder(VertxUtil.getVertxInstance()).setAddress(address).build(asClazz);
    }
}
