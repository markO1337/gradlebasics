package com.markbus.common;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class CommonEntity {

    private final String id;
    private final Map map = new ImmutableMap.Builder<Object, Object>()
            .put(1, "")
            .build();

}
