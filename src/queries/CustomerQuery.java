package queries;

public class CustomerQuery {
    public static final String  ADD_CUSTOMER = "insert into public.customer(name,surname, coffee_id) " +
            "values(?,?,?)";
    public static final String  SHOW_CUSTOMER = "select * from public.customer" +
            "values(?,?,?)";

}
