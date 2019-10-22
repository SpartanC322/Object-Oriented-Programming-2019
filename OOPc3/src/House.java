public class House
{
    private String address;
    private String type;
    private double price;
    private Person owner = new Person();

    public House()
    {
        this.address = "No Address Specified";
        this.type = "No Type Selected";
        this.price = 0;
        this.owner = null;
    }

    public House(String address, String type, double price, Person owner)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "House address='" + address + '\'' + ", type='" + type + '\'' + ", price=" + price + ", owner=" + owner;
    }
}
