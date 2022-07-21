## Jackson使用DEMO

### Bean、XML、Json互转

目前常见的json解析工具有jackson、fastjson、gson；

  jackson是spring mvc内置的json转换工具；
  fastjson是阿里的开源JSON解析库，由于fastjson经常会出现漏洞，所以很多人都不再用了；

Jaskson相关注解

|注解 |	说明|
|----|---|
|@JsonProperties	|把属性的名称序列化时转换为另外一个名称 ；@JsonProperty(“DepName”) |
|@JsonFormat	|把属性的格式序列化时转换成指定的格式；@JsonFormat(pattern = “yyyy-MM-dd”)|
|@JsonPropertyOrder	|指定属性在序列化时 json 中的顺序；@JsonPropertyOrder({ “age”, “name” })|
|@JsonIgnore	|排除指定属性不被json序列化|
|@JacksonXmlProperty	|指定XML命名空间的名称；@JacksonXmlProperty(localName = “DepName”)|
|@JacksonXmlRootElement	|指定XML根元素命名空间的名称；@JacksonXmlRootElement(localName = “RootName”)|
|@JacksonXmlElementWrapper	|可用于指定List等集合类，外围标签名；@JacksonXmlElementWrapper(localName = “EmpMessage”)|

 