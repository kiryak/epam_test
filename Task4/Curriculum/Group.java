package Task4.Curriculum;
public enum Group {
    JavaDeveloper(),
    J2EEDeveloper();

    private int amount;

    Group() {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public enum Type {
        JAVA_TECHNOLOGIES(Group.JavaDeveloper, 8 / 8),
        JDBC(Group.JavaDeveloper, 16 / 8),
        JFC_SWING(Group.JavaDeveloper, 16 / 8),
        STRUTS_FRAMEWORK(Group.J2EEDeveloper, 24 / 8),
        JAVA_SERVLETS(Group.J2EEDeveloper, 16 / 8);

        private Group group;
        private int amount;

        public int getAmount() {
            return amount;
        }

        Type(Group group, int amount) {
            this.group = group;
            this.amount = amount;
        }

        public boolean isInGroup(Group group) {
            return this.group == group;
        }
    }
}
