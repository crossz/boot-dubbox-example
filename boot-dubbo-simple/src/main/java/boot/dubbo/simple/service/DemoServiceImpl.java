package boot.dubbo.simple.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import boot.dubbo.api.DemoService;

@Service(protocol = { "dubbo" })
public class DemoServiceImpl implements DemoService {
	private Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);
	public DemoServiceImpl() {
		log.debug("测试注解启动加载。。。");
	}
	
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
