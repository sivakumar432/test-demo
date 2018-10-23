package demotest.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.felix.scr.annotations.Component;
import org.osgi.service.component.annotations.Component;
//import org.apache.felix.scr.annotations.Service;

@Component(service=OSGITestInterface.class)
//@Service
public class OSGITestInterfaceImpl implements OSGITestInterface {

  Logger logger = LoggerFactory.getLogger(OSGITestInterfaceImpl.class);

  @Override
 public String getOSGIName() {
  return "Test Service";
 }

  @Override
 public String getOSGIDesc() {
  return "AEM OSGI Service";
 }

  @Override
 public String getOSGIuse() {
  return "OSGI Service data";
 }
        @Override
 public String getOSGIData() {  
  String name = this.getOSGIName();
  String desc = this.getOSGIDesc();
  String use = this.getOSGIuse();
  return name + desc + use;
 }


}