package co.sqasa.Questions;

import co.sqa.sanangel.userinterfaces.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCantidadProducto {

    public static Question<Integer> enCarrito(String nombreProducto) {
        return actor -> Integer.parseInt(
                CarritoPage.cantidadDe(nombreProducto)
                        .resolveFor(actor)
                        .getText()
        );
    }
}
