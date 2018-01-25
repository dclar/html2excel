package org.dclar.h2e;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"org.dclar.h2e.tag", "org.dclar.h2e.beanProcessor", "org.dclar.h2e.generate", "org.dclar.h2e.processor"})
public class SpringConfig {
}
