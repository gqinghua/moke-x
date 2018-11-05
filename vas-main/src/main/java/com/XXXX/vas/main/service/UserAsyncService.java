package com.XXXX.vas.main.service;

import com.XXXX.vas.main.entity.User;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;

@ProxyGen
public interface UserAsyncService {

    void listUsers(User user, Handler<AsyncResult<List<User>>> resultHandler);
}
