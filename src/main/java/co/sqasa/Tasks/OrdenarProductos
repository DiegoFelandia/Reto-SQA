public class OrdenarProductos implements Task {

    private final String criterio;

    public OrdenarProductos(String criterio) {
        this.criterio = criterio;
    }

    public static OrdenarProductos por(String criterio) {
        return instrumented(OrdenarProductos.class, criterio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(criterio)
                .from(By.cssSelector("select.orderby"))
        );
    }
}
