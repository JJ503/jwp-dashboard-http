package org.apache.coyote.http11.session;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Session {

    private final String id;
    private final Map<String, Object> values = new ConcurrentHashMap<>();

    public Session(final String id) {
        this.id = id;
    }

    public void addAttribute(final String name, final Object value) {
        values.put(name, value);
    }

    public String getId() {
        return id;
    }

    public Object getAttribute(final String name) {
        return values.get(name);
    }
}
