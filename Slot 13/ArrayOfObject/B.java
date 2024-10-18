class B extends A {
    private String extraInfo;

    public B(int id, String name, String extraInfo) {
        super(id, name);
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Extra Info: " + extraInfo;
    }
}