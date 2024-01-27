package queries;

public class CoffeeQuery {

    public static final String  ADD_COFFEE = "insert into public.coffee(name,price)" +
            "values(?,?)";
    public static final String  SHOW_COFFEE = "select * from public.coffee";

}
