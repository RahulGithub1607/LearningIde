package FrameworkDesign.RoughPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestPackage {
    public static void main(String[] args) throws IOException {

        // read config properties
        Properties config =new Properties();
        /*String s = System.getProperty("user.dir");
        System.out.println(s)*/;
        FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//Config.properties");
        // load the file
        config.load(fis);
        //fetch the data from config file by giving property

        config.getProperty("LoginUrl");
        System.out.println(config.getProperty("LoginUrl"));

        //  Read the OR  properties
        Properties OR=new Properties();
        fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//OR.properties");
        OR.load(fis);
        System.out.println(OR.getProperty("Login_button"));

    }
}
