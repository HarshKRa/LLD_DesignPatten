import dal.UserDatabase;
import entities.Oder;
import entities.Product;
import entities.ProductFactory;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldApp {

    public static void main(String[] args) throws IllegalAccessException {
        UserDatabase userDatabase = UserDatabase.getInstance();
        System.out.println(userDatabase);

        UserDatabase userDatabase1 = UserDatabase.getInstance();
        System.out.println(userDatabase1);

        UserDatabase userDatabase2 = UserDatabase.getInstance();
        System.out.println(userDatabase2);

        // Every time it is creating only one object to connect the database

        ProductFactory productFactory = new ProductFactory();
        Product elcPro = productFactory.createProduct("electronics");
        Product clotPro = productFactory.createProduct("clothing");
        elcPro.displayInfo();
        clotPro.displayInfo();


        // Build the userAccount

        UserAccount.UserAccountBuilder userBuilder = new UserAccount.UserAccountBuilder("username","pwd");
        UserAccount userAccount = userBuilder.build();
        System.out.println(userAccount);

        // Build the oder

        List<Product> productList = new ArrayList<>();
        productList.add(elcPro);
        productList.add(clotPro);

        Oder.OderBuilder oderBuilder = new Oder.OderBuilder("123455", productList);

        Oder oder = oderBuilder.build();

        System.out.println(oder);


    }
}
