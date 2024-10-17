package homework_26.stock_methods;

import homework_26.detail.Detail;

public class StockImpl implements Stock{

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail upDateDetail(Detail detail) {
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        return null;
    }

    @Override
    public double totalWeight() {
        return 0;
    }

    @Override
    public double averageWeight() {
        return 0;
    }

}
