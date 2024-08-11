package entities;

import java.util.List;

public class Oder {
    private String oderId;
    private List<Product> products;

    private Oder(OderBuilder builder){
        this.oderId = builder.oderId;
        this.products = builder.products;
    }

    public  static  class  OderBuilder{
        private final String oderId;
        private final List<Product> products;

        public OderBuilder(String oderId, List<Product> products) {
            this.oderId = oderId;
            this.products = products;
        }

        public  Oder build(){
            return new Oder(this);
        }
    }
}
