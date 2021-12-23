package forEPAM;



public final class Pair<V, C> {

    final V var1;
    final C var2;

    public Pair(V var1, C var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public static <V, C> Pair<V, C> of(V var1, C var2) {
        return new Pair<>(var1, var2);
    }

    @Override
    public int hashCode() {
        return var1.hashCode() ^ var2.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        
        Pair obj = (Pair) o;
        return this.var1.equals(obj.var1)
                && this.var2.equals(obj.var2);
    }
}