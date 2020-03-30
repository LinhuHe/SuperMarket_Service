package cqdx.finall.supertmarket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
/*public class WebMvcConfig extends WebMvcConfigurationSupport
{
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/userPic/**").addResourceLocations("file:F/IDEA/mycode/supertmarket/picture/");

        super.addResourceHandlers(registry);
    }
}*/
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/userPic/**").addResourceLocations("file:F:/IDEA/mycode/supertmarket/picture/");
        System.out.println("success");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry r)
    {
        r.addViewController("/what").setViewName("/hello");
    }
}

