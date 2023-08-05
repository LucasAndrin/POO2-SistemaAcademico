package models.discipline;

import models.Phase;
import models.discipline.Discipline;

public class OfferedDiscipline extends Discipline {

    private Phase phase;

    public OfferedDiscipline(String name, String description, Phase phase) {
        super(name, description);
        setPhase(phase);
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OfferedDiscipline{");
        sb.append("phase=").append(phase);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
