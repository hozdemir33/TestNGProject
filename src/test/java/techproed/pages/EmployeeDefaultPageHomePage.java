package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class EmployeeDefaultPageHomePage {
    public EmployeeDefaultPageHomePage(){PageFactory.initElements(Driver.getDriver(),this);}
//    Find the object of Employee Default Page

    @FindBy(id = "entity-menu")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomers;

}
