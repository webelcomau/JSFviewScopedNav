package com.webel.jsf;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Base for all view bean examples.
 * 
 * @author darrenkelly
 */
abstract public class AbstractViewBean implements Serializable {

    private static final Logger logger = Logger.getLogger(AbstractViewBean.class.getName());
    
    abstract protected Logger myLogger();
    
    protected void echo(String s) {
        myLogger().log(Level.INFO, "{0}: {1}", new Object[]{this.getClass().getSimpleName(), s});
    }
    
    /**
     * Creates a new instance.
     */
    public AbstractViewBean() {
    }
    
    
    public void reset() {
        //entities = null;
        echo("reset()");
    }
        
    private String newName = "[NAME]";

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @PostConstruct
    public void postConstruct() {
        echo("postConstruct");
    }
    
    @PreDestroy
    public void preDestroy() {
        echo("preDestroy");
    }
    
    public String actionDone() {
        echo("actionDone");
        return "done?faces-redirect=true";
    }
    
    public String actionNull() {
        echo("actionNull");
        return null; // ! Stay in view scope.
    }
    
}
