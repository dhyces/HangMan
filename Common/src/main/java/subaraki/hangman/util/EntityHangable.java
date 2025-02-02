package subaraki.hangman.util;

import java.util.Objects;

public record EntityHangable(String entitytype, double offset) {
    @Override
    public String entitytype() {
        return entitytype;
    }

    @Override
    public double offset() {
        return offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityHangable that = (EntityHangable) o;
        return Double.compare(that.offset, offset) == 0 && Objects.equals(entitytype, that.entitytype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entitytype, offset);
    }
}
