package com.repeatedstrings.Bohr.Proxy;

import com.repeatedstrings.Bohr.Items.BohrishHandler;

/**
 * Created by james on 5/6/17.
 */
public class MyProxy {
    public void preInit() {
        BohrishHandler.init();
        BohrishHandler.register();

    }

    public void init() {
        BohrishHandler.registerRenders();
    }

    public void postInit() {
    }
}
