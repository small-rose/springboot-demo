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

package cn.xaiocai.limiter.distributed.serializer.kryo;

import cn.xaiocai.limiter.distributed.serializer.RateLimitSerializer;
import cn.xaiocai.limiter.exception.RateLimitSerializerException;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


/**
 * The type Kryo serializer.
 *
 * @author xiaoyu
 */
// @RateLimitSPI(value = "kryo")
public class KryoSerializer implements RateLimitSerializer {
    
    @Override
    public byte[] serialize(final Object obj) throws RateLimitSerializerException {
        byte[] bytes;
        Kryo kryo = null;
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); Output output = new Output(outputStream)) {
            //获取kryo对象
            kryo = KryoPoolFactory.getInstance().get();
            kryo.writeObject(output, obj);
            bytes = output.toBytes();
            output.flush();
        } catch (IOException ex) {
            throw new RateLimitSerializerException("kryo serialize error" + ex.getMessage());
        } finally {
            KryoPoolFactory.getInstance().returnKryo(kryo);
        }
        return bytes;
    }
    
    @Override
    public <T> T deSerialize(final byte[] param, final Class<T> clazz) throws RateLimitSerializerException {
        T object;
        Kryo kryo = null;
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(param)) {
            kryo = KryoPoolFactory.getInstance().get();
            Input input = new Input(inputStream);
            object = kryo.readObject(input, clazz);
            input.close();
        } catch (IOException e) {
            throw new RateLimitSerializerException("kryo deSerialize error" + e.getMessage());
        } finally {
            KryoPoolFactory.getInstance().returnKryo(kryo);
        }
        return object;
    }
}
