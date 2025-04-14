package co.sqasa.Tasks

public class SeleccionarProducto implements Task {

    private final int cantidad;

    public SeleccionarProducto(int cantidad) {
        this.cantidad = cantidad;
    }

    public static SeleccionarProducto conCantidad(int cantidad) {
        return instrumented(SeleccionarProducto.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.cssSelector(".products .product a.woocommerce-LoopProduct-link")),
            Clear.field(By.name("quantity")),
            Enter.theValue(String.valueOf(cantidad)).into(By.name("quantity")),
            Click.on(By.name("add-to-cart"))
        );
    }
}
