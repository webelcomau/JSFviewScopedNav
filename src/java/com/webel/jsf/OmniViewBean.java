package com.webel.jsf;

import java.util.logging.Logger;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped; // 3rd party CDI-compatible

/**
 * Visit <a href="http://showcase.omnifaces.org/cdi/ViewScoped">OmniFaces @ViewScoped</a>.
 * <p>
 * Related forum postings:
 * 
 * - <a href=https://stackoverflow.com/questions/40569971/jsf-mojarra-vs-omnifaces-viewscoped-predestroy-called-but-bean-cant-be-gar">JSF: Mojarra vs. OmniFaces @ViewScoped: @PreDestroy called but bean can't be garbage collected

</a>
* 
* - <a href="https://stackoverflow.com/questions/30410601/how-detect-and-remove-during-a-session-unused-viewscoped-beans-that-cant-be/40552152">How detect and remove (during a session) unused @ViewScoped beans that can't be garbage collected</a>
 * 
 * 
 * @author darrenkelly
 */
@Named
@ViewScoped
public class OmniViewBean extends AbstractViewBean {

    private static final Logger logger = Logger.getLogger(OmniViewBean.class.getName());
    
    @Override
    protected Logger myLogger() {
        return logger;
    }
    
    /**
     * Creates a new instance.
     */
    public OmniViewBean() {
    }
    
}
