public class BuscarProducto implements Task {

    private final String palabra;

    public BuscarProducto(String palabra) {
        this.palabra = palabra;
    }

    public static BuscarProducto para(String palabra) {
        return instrumented(BuscarProducto.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(palabra)
                 .into(By.name("s"))
                 .thenHit(Keys.ENTER)
        );
    }
}
