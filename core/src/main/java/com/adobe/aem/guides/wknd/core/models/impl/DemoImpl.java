package com.adobe.aem.guides.wknd.core.models.impl;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.Demo;
@Model(adaptables = { SlingHttpServletRequest.class, Resource.class }, adapters = {
    Demo.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

    public class DemoImpl implements Demo {

    @ValueMapValue
    String text;    



    @RequestAttribute(name="firstvariable")
    private String frontendvalue;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getFrontendValue() {
           return frontendvalue;
    }

 
}
