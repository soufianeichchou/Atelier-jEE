package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("From SQL BD");
        return (7);
    }
}
