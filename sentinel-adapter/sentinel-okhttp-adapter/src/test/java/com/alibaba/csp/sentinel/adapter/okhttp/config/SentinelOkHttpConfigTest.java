/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.adapter.okhttp.config;

import com.alibaba.csp.sentinel.adapter.okhttp.SentinelOkHttpConfig;
import com.alibaba.csp.sentinel.adapter.okhttp.extractor.DefaultOkHttpResourceExtractor;
import com.alibaba.csp.sentinel.adapter.okhttp.fallback.DefaultOkHttpFallback;

import org.junit.Test;

/**
 * @author zhaoyuguang
 */
public class SentinelOkHttpConfigTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConfigSetCleaner() {
        SentinelOkHttpConfig config = new SentinelOkHttpConfig(null, new DefaultOkHttpFallback());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConfigSetFallback() {
        SentinelOkHttpConfig config = new SentinelOkHttpConfig(new DefaultOkHttpResourceExtractor(), null);
    }
}
