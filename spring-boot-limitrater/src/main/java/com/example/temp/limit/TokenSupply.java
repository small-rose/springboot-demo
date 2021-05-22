package com.example.temp.limit;

import java.util.concurrent.ExecutorService;

public interface TokenSupply {

    void supplement(ExecutorService executorService);
}
