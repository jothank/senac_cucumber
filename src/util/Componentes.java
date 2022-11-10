package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Componentes {
    private WebDriver driver;

    public void inicializar() {
        String chromeDriver = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");

    }

    public void testarTextField() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validarTextField() {
        Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testarTextArea() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec tincidunt purus ullamcorper vehicula lobortis. Donec scelerisque lobortis risus sed tincidunt. Etiam dignissim consequat porta. Duis elit turpis, aliquet quis pellentesque sit amet, consectetur sed ex. Curabitur id fermentum leo. Praesent molestie placerat tellus. Duis ut rhoncus lectus, nec blandit elit. Nulla condimentum aliquam elit vel faucibus. Quisque a condimentum arcu, et vehicula diam. Sed elit erat, vulputate et sollicitudin a, vehicula vitae leo. Integer malesuada ac velit id hendrerit. Proin at felis dui. Donec accumsan tristique feugiat. Etiam commodo molestie dapibus.");
    }

    public void validarTextArea() {
        Assert.assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec tincidunt purus ullamcorper vehicula lobortis. Donec scelerisque lobortis risus sed tincidunt. Etiam dignissim consequat porta. Duis elit turpis, aliquet quis pellentesque sit amet, consectetur sed ex. Curabitur id fermentum leo. Praesent molestie placerat tellus. Duis ut rhoncus lectus, nec blandit elit. Nulla condimentum aliquam elit vel faucibus. Quisque a condimentum arcu, et vehicula diam. Sed elit erat, vulputate et sollicitudin a, vehicula vitae leo. Integer malesuada ac velit id hendrerit. Proin at felis dui. Donec accumsan tristique feugiat. Etiam commodo molestie dapibus.", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void fecharNavegador() {
        driver.quit();
    }

}
