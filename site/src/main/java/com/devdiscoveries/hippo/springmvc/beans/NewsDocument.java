package com.devdiscoveries.hippo.springmvc.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="springmvcexample:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("springmvcexample:title");
    }
    
    public String getSummary() {
        return getProperty("springmvcexample:summary");
    }
    
    public Calendar getDate() {
        return getProperty("springmvcexample:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("springmvcexample:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("springmvcexample:image", HippoGalleryImageSetBean.class);
    }


}
