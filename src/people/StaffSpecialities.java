package people;

public enum StaffSpecialities {
    CLEANER(1),
    HANDYMAN(2),
    BODYGUARD(3),
    SECRETARY(4),
    NURSE(5);

    private int responsibility;

    StaffSpecialities(int importance) {
        this.responsibility = importance;
    }
}
