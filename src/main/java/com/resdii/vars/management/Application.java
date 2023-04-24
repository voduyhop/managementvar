package com.resdii.vars.management;

import com.resdii.ms.common.rest.NooApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class Application extends NooApplication {
	public static void main(String[] args) {
		runApplication(Application.class, args);
	}
}
