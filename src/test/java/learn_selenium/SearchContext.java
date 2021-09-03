package learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
/*
https://stackoverflow.com/questions/17011374/are-public-and-public-final-redundant-for-interface-fields
All methods in an interface are implicitly public and abstract (but not final).

All fields in an interface are implicitly public, static and final.

The JLS states this. It also states that these modifiers can be left out.
 */
public interface SearchContext {
    public WebElement findElement(By arg);
}
