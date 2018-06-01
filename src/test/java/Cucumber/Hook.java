package Cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.DriverFactory;

public class Hook {
    DriverFactory driverFactory=new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.navigate("http://www.argos.co.uk");
        driverFactory.maxWindow();
       // driverFactory.applyImpWait();

    }

   // @After
 //   public void tearDown(){
     //   driverFactory.closeBrowser();
 //   }

}

