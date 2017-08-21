package javaAPI.java.web;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebugSpringConfig implements BeanPostProcessor {
  org.jboss.logging.Logger log = LoggerFactory.logger(DebugSpringConfig.class);
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    log.info("postProcessBeforeInitialization: bean("+beanName+")");
	return beanName;
  }
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    // log.info("postProcessAfterInitialization: bean("+beanName+")");
    return bean;
  }
}