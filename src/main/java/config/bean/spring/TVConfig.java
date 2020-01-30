package config.bean.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class TVConfig {
	
//	@Autowired
//	Thread t;
//	
//	@Component
//	class Thread{}
//	
	@Bean
	public TV getTV() {
		return new SamsungTV();
		//return new LGTV();
	}
	
/*	public Thread getTV() {
		return new SamsungTV();
		//return new LGTV();
	}*/
}
