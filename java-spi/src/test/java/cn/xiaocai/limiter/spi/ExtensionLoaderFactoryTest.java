/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.xiaocai.limiter.spi;

import cn.xiaocai.limiter.spi.fixture.HelloWorldTestSPI;
import cn.xiaocai.limiter.spi.fixture.HmilyTestSPI;
import cn.xiaocai.limiter.spi.fixture.NoHelloTestSPI;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public final class ExtensionLoaderFactoryTest {
    
    @Test
    public void testSPI() {
        HmilyTestSPI myTest = ExtensionLoaderFactory.load(HmilyTestSPI.class,"myTest");
        System.out.println("myTest --> "+myTest);
        
        HmilyTestSPI hmilyTestSPI = ExtensionLoaderFactory.load(HmilyTestSPI.class);
        System.out.println("hmilyTestSPI --> "+hmilyTestSPI);
        //assertThat(hmilyTestSPI.getClass().getName(), is(NoHelloTestSPI.class.getName()));
        
        HmilyTestSPI test2 = ExtensionLoaderFactory.load(HmilyTestSPI.class);
        System.out.println("test2 --> "+test2);
        //assertThat(test2.getClass().getName(), is(NoHelloTestSPI.class.getName()));

        
        HmilyTestSPI hello1 = ExtensionLoaderFactory.load(HmilyTestSPI.class, "hello");
        System.out.println("hello1 --> "+hello1);
        assertThat(hello1.getClass().getName(), is(HelloWorldTestSPI.class.getName()));
        
        HmilyTestSPI hello2 = ExtensionLoaderFactory.load(HmilyTestSPI.class, "hello");
        System.out.println("hello2 --> "+hello2);
        assertThat(hello1.getClass().getName(), is(hello2.getClass().getName()));
        System.out.println(hello2.sayHello());
        assertEquals(hello1, hello2);
        
        HmilyTestSPI no1 = ExtensionLoaderFactory.load(HmilyTestSPI.class, "no");
        System.out.println("no1 --> "+no1);
        assertThat(no1.getClass().getName(), is(NoHelloTestSPI.class.getName()));
        
        HmilyTestSPI no2 = ExtensionLoaderFactory.load(HmilyTestSPI.class, "no");
        System.out.println("no2 --> "+no2);
        assertNotEquals(no1, no2);
    }
}
