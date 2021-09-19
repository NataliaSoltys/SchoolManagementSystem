package people;

public enum TeacherSpecialities {
    ART(1),
    PHYSIC_EDUCATION(2),
    GEOGRAPHY(3),
    BIOLOGY(4),
    PHYSICS(5),
    POLISH_LANGUAGE(6),
    ENGLISH_LANGUAGE(7),
    MATHS(8);

    private final int importance;

    TeacherSpecialities(int importance) {
        this.importance = importance;
    }
}
