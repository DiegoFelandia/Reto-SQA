package co.sqasa.Tasks;

public class SeleccionarFranjaHoraria implements Task {

    private final String franja;

    public SeleccionarFranjaHoraria(String franja) {
        this.franja = franja;
    }

    public static SeleccionarFranjaHoraria como(String franja) {
        return instrumented(SeleccionarFranjaHoraria.class, franja);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.xpath("//label[contains(text(),'" + franja + "')]"))
        );
    }
}
