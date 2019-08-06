package by.epam.pretraining.task5.exercise2;

import java.util.Scanner;


public class Payment {
    private String name;
    private int price;
    private Product[] productList;

    public Payment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPayment(int k) {
        this.price = 0;
        System.out.println("Number of products: " + k);
        Scanner scanner = new Scanner(System.in);
        productList = new Product[k];
        try {
            for (int i = 0; i < k; i++) {
                System.out.println("Enter product's name: ");
                while (!scanner.hasNextLine()) {
                    scanner.next();
                    System.out.println("Enter string");
                }
                String productName = scanner.next();
                System.out.println("Enter price: ");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("Enter integer");
                }
                int price = scanner.nextInt();
                productList[i] = new Product(name, price);
                this.price = this.price + productList[i].getProductPrice();
                System.out.println("Total cost: " + this.price);
            }
        } catch (
                NegativeArraySizeException e) {
            System.out.println("Array dimension cannot be negative");
        } catch (
                NumberFormatException e) {
            System.out.println("Wrong format");
        } catch (
                NullPointerException e) {
            System.out.println("Array not created");
        }

    }

    public class Product {
        private String productName;
        private int productPrice;

        public Product(String productName, int productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }
    }
}
