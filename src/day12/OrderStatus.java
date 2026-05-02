package day12;

import java.util.EnumSet;

public enum OrderStatus {
    PLACED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.of(CONFIRMED,CANCELLED);
        }
    },CONFIRMED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.of(SHIPPED,CANCELLED);
        }
    },SHIPPED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.of(DELIVERED);
        }
    },DELIVERED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.of(REFUNDED);
        }
    },CANCELLED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.noneOf(OrderStatus.class);
        }
    },REFUNDED{
        @Override
        public EnumSet<OrderStatus> getNextValidStatuses(){
            return EnumSet.noneOf(OrderStatus.class);
        }
    };

    public abstract EnumSet<OrderStatus> getNextValidStatuses();

    public boolean canTransitionTo(OrderStatus next){
        return getNextValidStatuses().contains(next);
    }

}
