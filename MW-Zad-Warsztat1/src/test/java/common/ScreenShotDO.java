package common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShotDO extends ConnectionBase{
    public static void ScreenShotTest () throws IOException {

    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(source, new File("./printScreen/"
                +System.currentTimeMillis()+".jpg"));
        // jest w folderze od repo w folderze printScreen ->\MW-Zad-Warsztat1\printScreen\
        System.out.println("the Screenshot is taken");

    }
}
