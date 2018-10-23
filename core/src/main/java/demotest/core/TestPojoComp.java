package demotest.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUsePojo;

public class TestPojoComp extends WCMUsePojo {
 Logger logger = LoggerFactory.getLogger(TestPojoComp.class);
 protected String detail;

  @Override
   public void activate() {   

  OSGITestInterface service = getSlingScriptHelper().getService(OSGITestInterface.class);
     detail = service.getOSGIData();
   }

    public String getDetails() {
     return this.detail;
   }

}
