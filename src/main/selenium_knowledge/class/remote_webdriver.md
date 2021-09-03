### Definition:
This is the derived/child/implementing **class** of the WebDriver interface. See details in the RemoteWebDriver.java class.
For example:

```
public class RemoteWebDriver implements WebDriver,...{
...
public String getTitle() {
        Response response = this.execute("getTitle");
        Object value = response.getValue();
        return value == null ? "" : value.toString();
    }
    
public String getCurrentUrl() {
        Response response = this.execute("getCurrentUrl");
        if (response != null && response.getValue() != null) {
            return response.getValue().toString();
        } else {
            throw new WebDriverException("Remote browser did not respond to getCurrentUrl");
        }
    }
}
```
