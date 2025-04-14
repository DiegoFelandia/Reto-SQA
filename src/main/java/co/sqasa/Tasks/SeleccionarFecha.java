package co.sqasa.Tasks

public class SeleccionarFechaDeEnvio implements Task {

    private final String fecha;

    public SeleccionarFechaDeEnvio(String fecha) {
        this.fecha = fecha;
    }

    public static SeleccionarFechaDeEnvio como(String fecha) {
        return instrumented(SeleccionarFechaDeEnvio.class, fecha);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.xpath("//label[contains(text(),'" + fecha + "')]"))
        );
    }
}
