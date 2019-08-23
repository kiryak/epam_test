package Task2;

public class Developer {
    private int experience;
    private String education;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Developer{");
        sb.append("experience=").append(experience);
        sb.append(", education='").append(education).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

