package tests;


import jdk.jfr.Description;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;


public class DemoQA_AllTests {

  final static Logger logger = Logger.getLogger(DemoQA_AllTests.class);


  @Test @Description("Main Page")
    public void Test001()  {

    logger.info("****** R*O*N*I*N* The test cases are STARTED  R*O*N*I*N* *******");
    logger.info("*************************************************************************");
    DemoQA_ElementsPage_Test demoQA_elementsPage_test=new DemoQA_ElementsPage_Test();
    demoQA_elementsPage_test.Test001();


  }
  @Test @Description("Text Box Page")
    public void Test002(){

    DemoQA_TextBoxPage_Test demoQA_textBoxPage_test=new DemoQA_TextBoxPage_Test();
    demoQA_textBoxPage_test.Test001();

  }
  @Test @Description("CheckBox Test")
    public void Test003(){

    DemoQA_CheckBox_Test demoQACheckBoxTest=new DemoQA_CheckBox_Test();
    demoQACheckBoxTest.Test001();
  }

  @Test @Description("Radio Button Test")
    public void Test004(){

     DemoQA_RadioB_Test radioB_test=new DemoQA_RadioB_Test();
     radioB_test.Test001();
  }

  @Test @Description("Web Tables Page Test")
  public void Test005(){
    DemoQA_WebTables_Test webTables_test=new DemoQA_WebTables_Test();
    webTables_test.Test001();
  }

  @Test @Description("Button Tests")
  public void Test006(){
    DemoQA_Button_Test button_test=new DemoQA_Button_Test();
    button_test.Test000();
    button_test.Test001();
    button_test.Test002();
    button_test.Test003();

  }

  @Test @Description("Dynamic Pro. - 1")
  public void Test007(){
    DemoQA_Dynamic_Test dynamic_test=new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test0001();
    dynamic_test.Test0002();

  }

  @Test @Description("Dynamic Pro.- 2")
  public void Test008(){
    DemoQA_Dynamic_Test dynamic_test=new DemoQA_Dynamic_Test();
    dynamic_test.Test000();
    dynamic_test.Test003();

  }

  @Test @Description("Broken Link")
  public void Test009() throws IOException {
    DemoQA_BrokenLink_Test brokenLinkTest=new DemoQA_BrokenLink_Test();
    brokenLinkTest.Test001();
    brokenLinkTest.Test002();
    brokenLinkTest.Test003();

    logger.info("****** R*O*N*I*N* The test cases are COMPLETED R*O*N*I*N* *******");

  }

  @Test @Description("Download File")
  public void Test010(){

    DemoQA_UpD_Test upD_test=new DemoQA_UpD_Test();
    upD_test.Test000();
    upD_test.Test001();
  }





}
