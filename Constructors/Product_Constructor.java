package Constructors;

// public class Product_Constructor {
    class Product {
        private String item_number;
        private String name;
        private double price;
        private double Qty;

        // property methods

        public String getitemno() {
            return item_number;
        }

        public String getname() {
            return name;
        }

        public double getprice() {
            return price;
        }

        public double getquantity() {
            return Qty;
        }

        public void setprice(double p) {
            this.price = p;
        }

        public void setquantity(double q) {
            if (q > 0) {
                this.Qty = q;
            } else {
                q = 0;
            }
        }

        // Constructors

        public Product(String item) {
            item_number = item;
        }

        public Product(String item, String n) {
            item_number = item;
            name = n;
        }

        public Product(String item, String n, double p, double q) {
            item_number = item;
            name = n;
            setprice(p);
            setquantity(q);
        }

        public Product(String n, double p) {
            name = n;
            setprice(p);
        }
    }
// }

public class Product_Constructor {
    public static void main(String[] args) {
        Product prod = new Product("A25", "Tshirt", 250, 2);
        String name = prod.getname();
        double price = prod.getprice();
        String itemnumber = prod.getitemno();
        double quantity = prod.getquantity();

        System.out.println("Product name "+name);
        System.out.println("Product number "+itemnumber);
        System.out.println("Product price "+price);
        System.out.println("Product Quantity "+quantity);
    }
}
