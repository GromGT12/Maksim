package home_work_28.Task1;

public class CharacteristicsOfUsers {
private String ProfessionalQualities;
private int experience;

    public String getProfessionalQualities() {
        return ProfessionalQualities;
    }

    public void setProfessionalQualities(String professionalQualities) {
        ProfessionalQualities = professionalQualities;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "CharacteristicsOfUsers{" +
                "ProfessionalQualities='" + ProfessionalQualities + '\'' +
                ", experience=" + experience +
                '}';
    }
}
