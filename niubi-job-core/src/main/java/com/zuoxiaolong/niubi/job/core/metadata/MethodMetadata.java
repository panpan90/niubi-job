/*
 * Copyright 2002-2016 the original author or authors.
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

package com.zuoxiaolong.niubi.job.core.metadata;

import com.zuoxiaolong.niubi.job.core.annotation.Schedule;

import java.lang.reflect.Method;

/**
 * 一个需要调度的方法元数据
 *
 * @author Xiaolong Zuo
 * @since 16/1/9 00:33
 */
public interface MethodMetadata {

    String DATA_MAP_KEY = "_metadata";

    Class<?> clazz();

    Schedule schedule();

    Method method();

}
