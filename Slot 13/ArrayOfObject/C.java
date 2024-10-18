class C extends A {
    private String additionalInfo;

    public C(int id, String name, String additionalInfo) {
        super(id, name);
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Additional Info: " + additionalInfo;
    }
}