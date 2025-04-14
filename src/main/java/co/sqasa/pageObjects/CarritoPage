package co.sqa.sanangel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {
    public static Target cantidadDe(String nombreProducto) {
        return Target.the("cantidad de producto " + nombreProducto)
                     .located(By.xpath("//tr[td[contains(text(),'" + nombreProducto + "')]]//input[@type='number']"));
    }
}
