package boot.dubbo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.config.annotation.Service;

//@Service(protocol = {"rest"}, group = "annotationConfig", validation = "true")
@Path("demo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface DemoService {
	/**
	 * 基本测试
	 * 
	 * @param name
	 * @return
	 */
	String sayHello(String name);

}
