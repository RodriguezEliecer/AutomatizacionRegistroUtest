package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {
    public static final
    Target DIV_COMPUTER =
            Target.the("DIV MOBILE")
                    .located(By.xpath("//*[@id='web-device']/div[1]/div[2]"));

    public static final
    Target INPUT_COMPUTER =
            Target.the("INPUT MOBILE")
                    .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));

    public static final
    Target DIV_VERSION =
            Target.the("DIV Version")
                    .located(By.xpath("//*[@id='web-device']/div[2]/div[2]"));

    public static final
    Target INPUT_VERSION =
            Target.the("INPUT Version")
                    .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));

    public static final
    Target DIV_LANGUAGE =
            Target.the("DIV Language")
                    .located(org.openqa.selenium.By.xpath("//*[@id='web-device']/div[3]/div[2]"));
    public static final
    Target INPUT_LANGUAGE =
            Target.the("INPUT OS")
                    .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final
    Target DIV_MOBILE =
            Target.the("DIV Mobile")
                    .located(org.openqa.selenium.By.xpath("//*[@id='mobile-device']/div[1]/div[2]"));
    public static final
    Target INPUT_MOBILE =
            Target.the("INPUT Mobile")
                    .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final
    Target DIV_MODEL =
            Target.the("DIV OS")
                    .located(org.openqa.selenium.By.xpath("//*[@id='mobile-device']/div[2]/div[2]"));
    public static final
    Target INPUT_MODEL =
            Target.the("INPUT OS")
                    .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final
    Target DIV_OS =
            Target.the("DIV OS")
                    .located(org.openqa.selenium.By.xpath("//*[@id='mobile-device']/div[3]/div[2]"));
    public static final
    Target INPUT_OS =
            Target.the("INPUT OS")
                    .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final
    Target BUTTON_NEXT =
            Target.the("Btn siguiente")
                    .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
