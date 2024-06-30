package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    public Properties properties;
    private final String propertyFilePath= "C:/Users/gbrav/IdeaProjects/MvnCucumber-NopCommerce/Configuration/config.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getURL(){
        String url = properties.getProperty("baseURL");
        if(url != null){
            return url;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    public String getValidUsername(){
        String email = properties.getProperty("validEmail");
        if(email != null){
            return email;
        } else {
            throw new RuntimeException("Email not specified in the Configuration.properties file.");
        }
    }

    public String getValidPassword(){
        String psw = properties.getProperty("validPSW");
        if(psw != null){
            return psw;
        } else {
            throw new RuntimeException("Password not specified in the Configuration.properties file.");
        }
    }

    public String getInvalidUsername(){
        String email = properties.getProperty("invalidEmail");
        if(email != null){
            return email;
        } else {
            throw new RuntimeException("invalid Email not specified in the Configuration.properties file.");
        }
    }

    public String getInvalidPassword(){
        String psw = properties.getProperty("invalidPSW");
        if(psw != null){
            return psw;
        } else {
            throw new RuntimeException("invalid Password not specified in the Configuration.properties file.");
        }
    }
}
