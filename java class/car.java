class car {
   private String ModelName;
   private String owner;
   private int regNumber;
    public car(String ModelName,String owner ,int regNumber)
    {
        this.ModelName=ModelName;
        this.owner=owner;
        this.regNumber=regNumber;
    }
    public void startengine()
    {
        System.out.println("car enginee can be started");
    }
    public void accelerate()
    {
        System.out.println("car enginee can be acclerateded");
    }
    public void stop()
    {
        System.out.println("car enginee can be stopped");
    }
    public void showcarInformation()
    {
        System.out.println("the car is owned by"+owner);
        System.out.println("the car model"+ModelName);
        System.out.println("the regNumber is"+regNumber);
    }
    public static void main(String[] var0)
    {
        car mycar=new car("suzuki","abc" ,1234);
        mycar.startengine();
        mycar.accelerate();
        mycar.stop();
        mycar.showcarInformation();
    }
}

