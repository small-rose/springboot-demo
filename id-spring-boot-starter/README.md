

# 雪花算法

个性化实现

- 支持 id 模式
- 支付 redis 模式
 
组成：
 
- 时间位数=40,
- ID位数=9,
- 回拨位数=2,
- 序列位数=12

```YAML

small-id:
  # 当id生成模式id-mode=num,使用指定生成器id
  #  id: 2
  # 生成器唯一ID的生成模式：=num:通过id指定;=redis:通过redis注册自动获取
  id-mode: redis

```