public class PrintProduct {

    public void PrintTotalProductSales(Product product) {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales(Product product) {

        System.out.printf("AVERAGE PRODUCT SALES: %.2f%n",
                product.GetAverageProductSold());
    }

    public void PrintMostPopularProduct(Product product) {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    public void PrintReport(Product product) {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************************");

        PrintTotalProductSales(product);
        PrintAverageProductSales(product);
        PrintMostPopularProduct(product);
    }
}
