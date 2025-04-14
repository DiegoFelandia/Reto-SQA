package co.sqasa.StepDef;

import co.sqa.sanangel.questions.VerificarCantidadProducto;
import co.sqa.sanangel.tasks.AgregarProducto;
import co.sqa.sanangel.userinterfaces.SanAngelHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestStepDefinition {

@Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario abre el sitio de San Ángel")
    public void elUsuarioAbreElSitioDeSanAngel() {
        theActorCalled("Diego").wasAbleTo(
                Open.browserOn().the(SanAngelHomePage.class)
        );
    }

@Cuando("navega a la sección {string} desde el menú principal")
public void navegarAlMenu(String opcion) {
    theActorInTheSpotlight().attemptsTo(NavegarAlMenu.conOpcion(opcion));
}

@Cuando("ordena los productos por {string}")
public void ordenarPor(String criterio) {
    theActorInTheSpotlight().attemptsTo(OrdenarProductos.por(criterio));
}

@Cuando("busca {string} usando el buscador del sitio")
public void buscar(String texto) {
    theActorInTheSpotlight().attemptsTo(BuscarProducto.para(texto));
}

@Cuando("selecciona un producto de la lista con cantidad {int} y lo agrega al carrito")
public void seleccionarYAgregar(int cantidad) {
    theActorInTheSpotlight().attemptsTo(SeleccionarProducto.conCantidad(cantidad));
}

  @Cuando("selecciona {string} como fecha de envío")
public void seleccionarFecha(String fecha) {
    theActorInTheSpotlight().attemptsTo(SeleccionarFechaDeEnvio.como(fecha));
}

@Cuando("selecciona la franja horaria {string}")
public void seleccionarFranja(String franja) {
    theActorInTheSpotlight().attemptsTo(SeleccionarFranjaHoraria.como(franja));
}

@Cuando("añade la adición {string} al producto")
public void agregarAdicion(String adicion) {
    theActorInTheSpotlight().attemptsTo(AgregarAdicion.conNombre(adicion));
}

    @Entonces("debe ver ambos productos con sus cantidades correctas en el carrito")
    public void debeVerAmbosProductosEnElCarrito() {
        theActorInTheSpotlight().should(
                seeThat(VerificarCantidadProducto.enCarrito("camisa"), equalTo(2))
        );

        theActorInTheSpotlight().should(
                seeThat(VerificarCantidadProducto.enCarrito("pantalón"), equalTo(5))
        );
    }
}
  

}
