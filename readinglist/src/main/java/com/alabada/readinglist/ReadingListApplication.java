package com.alabada.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 该文件，两个作用：配置和启动引导。
 * 首先，这是主要的Spring配置类；
 *
 */

@SpringBootApplication // 开启组件扫描和自动配置。实际上，该注解将三个有用的注解组合在一起了。@Configuration,@ComponentScan,@EnableAutoConfiguration
public class ReadingListApplication {

	/**
	 * 要运行Spring Boot应用程序有几种方式:
	 * 其中包含传统的WAR文件部署。
	 * 但这里的main()方法让你可以在命令行里把该应用程序当作一个可执行JAR文件来运行。
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args); // 负责启动引导应用程序
	}
}
