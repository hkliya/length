public class Mile {
    private int value;

    public Mile(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mile mile = (Mile) o;

        return value == mile.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
