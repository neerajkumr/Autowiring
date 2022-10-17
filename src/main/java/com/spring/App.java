package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app=new ClassPathXmlApplicationContext("AppConf.xml");
    	University u=(University) app.getBean("univ");
    	u.display();
    	
    	
    
    }
}
