package arbre;

public class ArbreBinaire implements Container{

    public ArbreBinaire filsGauche;
    public ArbreBinaire filsDroit;
    private String etiquette;

    public ArbreBinaire(String etiquette) {

        this.etiquette = etiquette;
    }

    public ArbreBinaire(ArbreBinaire filsDroit, String etiquette) {
        this.filsDroit = filsDroit;
        this.etiquette = etiquette;
    }

    public ArbreBinaire(ArbreBinaire filsDroit, ArbreBinaire filsGauche, String etiquette) {
        this.etiquette = etiquette;
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
    }

    public ArbreBinaire getFilsGauche() {
        return filsGauche;
    }

    public void setFilsGauche(ArbreBinaire filsGauche) {
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire getFilsDroit() {
        return filsDroit;
    }

    public void setFilsDroit(ArbreBinaire filsDroit) {
        this.filsDroit = filsDroit;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    @Override
    public Iterator getIterator() {
        return new ArbreIterator();
    }

    public class ArbreIterator implements Iterator {

        @Override
        public boolean hasNext() {
            if(hasNextD() || hasNextG()){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public boolean hasNextD() {
            if (!filsDroit.getEtiquette().isEmpty()) {
                return true;
            }else{
                return false;
            }
        }

        @Override
        public boolean hasNextG() {
            if(!filsGauche.getEtiquette().isEmpty()){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public ArbreBinaire nextD() {
            if(hasNextD()){
                System.out.println(getFilsDroit().etiquette);
                return getFilsDroit();
            }
            return null;
        }

        @Override
        public ArbreBinaire nextG() {
            if(hasNextG()){
                System.out.println(getFilsGauche().etiquette);
                return getFilsGauche();
            }
            return null;
        }
    }
}
