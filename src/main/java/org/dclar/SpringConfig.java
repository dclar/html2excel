package org.dclar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"org.dclar.tag*", "org.dclar.beanProcessor*", "org.dclar.generate*", "org.dclar.processor*"})
public class SpringConfig {
}
