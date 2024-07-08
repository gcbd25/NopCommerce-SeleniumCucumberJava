package utilities.locator;

import org.openqa.selenium.By;

public class locatorsProductPage {
    public By btnImport = By.xpath("//button[@name='importexcel']");
    public By btnSelectFile = By.xpath("//input[@id='importexcelfile']");
    public By btnImportFromExcel = By.xpath("//button[normalize-space()='Import from Excel']");
}
