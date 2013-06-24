package com.devdiscoveries.hippo.springmvc.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="springmvcexample:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("springmvcexample:title");
    }

    public String getSummary() {
        return getProperty("springmvcexample:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("springmvcexample:body");    
    }

}
