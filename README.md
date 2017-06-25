## dubbox 基于spring的注解

- provider的注册：applicationContext.xml

```
<dubbo:annotation package="boot.dubbo" />

```

- provider对应的服务：注解需要在 provider的serviceImple中，public class上加入：

```
@Service(protocol = { "dubbo" })
public class DemoServiceImpl implements DemoService {

}
```

---------------------------------------------------------

使用：<br>
 > 1、安装Maven<br>
 > 2、下载dubbox，在${dubbox-home}执行mvn clean install -Dmaven.test.skip=true <br> (执行该命令会从中央仓库下载依赖，若一次安装不成功，多执行几次，一般都是网络问题或依赖问题造成的)，最终肯定会成功安装到本地仓库中<br>
 > 3、使用Eclipse/IDEA导入boot-dubbo基本上的结构你就可以看懂了，下述也有简单的描述<br>
 

 ---------------------------------------
 
 
## 测试dubbox+spring-boot:<br>
 * boot-dubbo-api
 * boot-dubbo-simple-provider
 * boot-dubbo-simple-consumer

这个三件套是标准dubbo的配置，用spring boot实现的。

 * boot-dubbo-consumer-test 
 
它是dubbo的客户端(consumer)，在这里我做了一些其他实现方面的尝试；它通过调用api等于invoke到serice的服务上，从而实现了rpc的调用和服务治理。<br>

 * 这个项目我想以一个第三方的项目使用dubbox
 * 这个项目跟spring boot没有一点关系。



说明：<br>
 * service:一般我们的service瓶颈在IO或者数据库上，部署无需太多
 * web:一般的压力在web上，如果很多用户并发，session以及转换都在web上，web建议多部署几台

--------------------------------------
注释：<br>
 * 在实际项目的架构中，Service和Infrastrature(DAO)之间应该还需要一层，就是ProxyDao那么这一层应该在Infrastrature这个当中


 ----

##Spring-Boot With Dubbox ##

该项目整合了最新的Spring Boot和功能强大的RPC框架Dubbox<br>
两者都有优点，也都有缺点<br>
最新版本的Spring Boot包含了Metrics模块<br>

### Dubbox官方地址：<br>
[Dubbox](https://github.com/dangdangdotcom/dubbox)：https://github.com/dangdangdotcom/dubbox<br>


### Spring Boot: <br>
 
> 1、微内核<br>
> 2、配置简单<br>
> 3、模块化<br>
> 4、开箱即用<br>
> 5、完全兼容Spring<br>
> 6、设计理念极其先进，很多思想来自OSGi，但是在现有技术的实现<br>


缺点：<br>

 > 二次改造定制难<br>
 > 缺少成熟的SOA或者RPC框架<br>


----------


Dubbox:<br>
-------
 > 1、完全兼容Dubbo<br>
 > 2、功能强大<br>
 > 3、性能强悍<br>
 > 4、运行稳定<br>
 > 5、可扩展性较好, Api和Spi分离<br>

缺点:

> 1、官方停止维护已经两年之久了<br>
 > 2、依赖较为陈旧<br>
 > 3、运行时较重，应该微内核和模块化这个框架<br>
 > 4、配置较为复杂，学习成本较高<br>


