package Demo;

public class Customer {
    public void hello(){
        //Address
    }
    public boolean validateAddress(String customerAddress){
        class Address{
            String address;
            Address(String address){
                this.address = address;
            }
            public boolean validate(){
                    return true;
            }
        }
        Address address = new Address(customerAddress);
        return address.validate();
    }
}
