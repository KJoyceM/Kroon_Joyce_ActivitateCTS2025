package Builder;

public class AbonamentInternet {
    private boolean areFibraOptica;
    private boolean are5G;
    private boolean areNelimitat;
    private float pret;

    public boolean isAreFibraOptica() {
        return areFibraOptica;
    }

    public boolean isAre5G() {
        return are5G;
    }

    public boolean isAreNelimitat() {
        return areNelimitat;
    }

    public float getPret() {
        return pret;
    }

    private AbonamentInternet(AbonamentInternetBuilder builder) {
        this.pret = builder.pret;
        this.areNelimitat = builder.areNelimitat;
        this.are5G = builder.are5G;
        this.areFibraOptica = builder.areFibraOptica;
        }

        public static AbonamentInternetBuilder builder(){
        return new AbonamentInternetBuilder();
        }

    public static class AbonamentInternetBuilder implements Builder {
        private boolean areFibraOptica;
        private boolean are5G;
        private boolean areNelimitat;
        private float pret;

        public AbonamentInternetBuilder setAreFibraOptica(boolean areFibraOptica) {
            this.areFibraOptica = areFibraOptica;
            return this;
        }

        public AbonamentInternetBuilder setAre5G(boolean are5G) {
            this.are5G = are5G;
            return this;
        }

        public AbonamentInternetBuilder setAreNelimitat(boolean areNelimitat) {
            this.areNelimitat = areNelimitat;
            return this;
        }

        public AbonamentInternetBuilder setPret(float pret) {
            this.pret = pret;
            return this;
        }

        public AbonamentInternet build() {
            return new AbonamentInternet(this);
        }
    }

    @Override
    public String toString() {
        return "AbonamentInternet{" +
                "areFibraOptica=" + areFibraOptica +
                ", are5G=" + are5G +
                ", areNelimitat=" + areNelimitat +
                ", pret=" + pret +
                '}';
    }
}
