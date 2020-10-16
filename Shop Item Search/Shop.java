import java.util.*;
public class Shop{
    private String shopName,shopAddress;
    private String[] products;
    public Shop(String a,String b,String[] c)
    {
        setShopName(a);
        setShopAddress(b);
        setProducts(c);
    }
    public void setShopName(String a)
    {
        shopName=a;
    }
    public void setShopAddress(String b)
    {
        shopAddress=b;
    }
    public void setProducts(String[] c)
    {
        products=c;
    }
    public String getShopName()
    {
        return(shopName);
    }
    public String getShopAddress()
    {
        return(shopAddress);
    }
    public String[] getProducts()
    {
        return(products);
    }
    public boolean checkProductAvailability(String productname)
    {
        String[] a=new String[products.length];
        for(int i=0;i<products.length;i++)
        {
            a[i]=products[i].toLowerCase();
        }
        productname=productname.toLowerCase();
        boolean flag=false;
        for(int i=0;i<products.length;i++)
        {
            if(a[i].equals(productname))
            {
                flag=true;
                break;
            }
        }
        return (flag);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shopname:");
        String name=sc.next();
        System.out.println("Enter the address:");
        String add=sc.next();
        System.out.println("Enter number of products:");
        int n=sc.nextInt();
        if(n>0)
        {
            String[] products=new String[n];
            for(int i=0;i<n;i++)
            {
                products[i]=sc.next();
            }
            System.out.println("Enter the product to be searched:");
            String check=sc.next();
            Shop s=new Shop(name,add,products);
            boolean b=s.checkProductAvailability(check);
            if(b)
            {
                System.out.println("Product is available at "+s.getShopName()+", "+s.getShopAddress());
            }
            else
            {
                System.out.println("Product is not available at "+s.getShopName()+", "+s.getShopAddress());
            }
        }
    }
}