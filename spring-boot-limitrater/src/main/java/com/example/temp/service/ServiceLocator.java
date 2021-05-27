package com.example.temp.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author zzy
 */
@Component
public class ServiceLocator implements BeanFactoryAware {

	private static ServiceLocator serviceLocator = null;
	private static BeanFactory beanFactory = null;

	public static BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public static Object getService(String name) {
		return beanFactory.getBean(name);
	}

	public static ServiceLocator getInstance() {
		if (serviceLocator == null) {
			serviceLocator = (ServiceLocator) beanFactory
					.getBean("serviceLocator");
		}
		return serviceLocator;
	}

	@Override
    public void setBeanFactory(BeanFactory factory) throws BeansException {
		beanFactory = factory;
	}
}