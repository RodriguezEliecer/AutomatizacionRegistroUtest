package models;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class UserData {
    private  String strFirstName; private String strLastName; private String strEmail;
    private String strBirthMonth; private String strBirthDay;private String strBirthYear;
    private String strCity; private String strZIP;private String strCountry;
    private String strDevComputer; private String strDevVersion;private String strDevLanguage;
    private String strDevMobile; private String strDevModel;private String strDevOs;
    private String strPassword; private String strConfirmPassword;
    private String strCheckEndTitle;



    public UserData(String strFirstName, String strLastName, String strEmail,
                    String strBirthMonth, String strBirthDay, String strBirthYear,
                    String strCity, String strZIP, String strCountry,
                    String strDevComputer, String strDevVersion, String strDevLanguage,
                    String strDevMobile, String strDevModel, String strDevOs,
                    String strPassword, String strConfirmPassword, String strCheckEndTitle
                    ){
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strCity = strCity;
        this.strZIP = strZIP;
        this.strCountry = strCountry;
        this.strDevComputer = strDevComputer;
        this.strDevVersion = strDevVersion;
        this.strDevLanguage = strDevLanguage;
        this.strDevMobile = strDevMobile;
        this.strDevModel = strDevModel;
        this.strDevOs = strDevOs;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.strCheckEndTitle = strCheckEndTitle;
    }


    public String getStrFirstName() {
        return strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public String getStrBirthMonth() { return strBirthMonth; }

    public String getStrBirthDay() { return strBirthDay;}

    public String getStrBirthYear() { return strBirthYear; }

    public String getStrCity() {return strCity;}

    public String getStrZIP() {return strZIP;}

    public String getStrCountry() {return strCountry;}

    public String getStrDevComputer() {return strDevComputer;}

    public String getStrDevVersion() {return strDevVersion;}

    public String getStrDevLanguage() {return strDevLanguage;}

    public String getStrDevMobile() {return strDevMobile;}

    public String getStrDevModel() {return strDevModel;}

    public String getStrDevOs() {return strDevOs;}

    public String getStrPassword() {return strPassword;}

    public String getStrConfirmPassword() {return strConfirmPassword;}

    public String getStrCheckEndTitle() {return strCheckEndTitle;}

    @DataTableType
    public static UserData authorEntryTransformer(Map<String, String> entry) {
        return  new UserData(
                entry.get("strFirstName"),
                entry.get("strLastName"),
                entry.get("strEmail"),
                entry.get("strBirthMonth"),
                entry.get("strBirthDay"),
                entry.get("strBirthYear"),
                entry.get("strCity"),
                entry.get("strZIP"),
                entry.get("strCountry"),
                entry.get("strDevComputer"),
                entry.get("strDevVersion"),
                entry.get("strDevLanguage"),
                entry.get("strDevMobile"),
                entry.get("strDevModel"),
                entry.get("strDevOs"),
                entry.get("strPassword"),
                entry.get("strConfirmPassword"),
                entry.get("strCheckEndTitle")
        );
    }
}
