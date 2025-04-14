package co.sqa.sanangel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static Target producto(String nombre) {
        return Target.the("producto " + nombre)
                     .located(By.xpath("//h2[contains(text(), '" + nombre + "')]"));
    }

    public static final Target CANTIDAD = Target.the("campo de cantidad")
                                                .located(By.id("quantity"));

    public static final Target AGREGAR_AL_CARRITO = Target.the("botón agregar")
                                                           .located(By.name("add-to-cart"));
}
