package day12;

public enum AccountStatus {

    ACTIVE{
        @Override
        public boolean canTransact(){
            return true;
        }

        @Override
        public String getStatusMessage(){
            return "Account is active";
        }
    },
    INACTIVE{
        @Override
        public boolean canTransact(){
            return false;
        }
        @Override
        public String getStatusMessage(){
            return "Account is inactive";
        }
    },
    SUSPENDED{
        @Override
        public boolean canTransact() {
            return false;
        }

        @Override
        public String getStatusMessage() {
            return "Account is suspended";
        }
    };

    public abstract boolean canTransact();
    public abstract String getStatusMessage();




}
