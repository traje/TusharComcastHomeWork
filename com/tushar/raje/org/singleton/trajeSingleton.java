package com.tushar.raje.org.singleton;

import java.io.Serializable;

public final class trajeSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static class SingletonLoader {
        private static final trajeSingleton INSTANCE = new trajeSingleton();
    }

    private trajeSingleton() {
        if (SingletonLoader.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static trajeSingleton getInstance() {
        return SingletonLoader.INSTANCE;
    }

    @SuppressWarnings("unused")
    private trajeSingleton readResolve() {
        return SingletonLoader.INSTANCE;
    }
}

