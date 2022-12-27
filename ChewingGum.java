public class ChewingGum extends Food
{
    private String flavour = null;
    public ChewingGum()
    {
        super("ChewingGum");
    }
    public ChewingGum(String flavour)
    {
        super("ChewingGum");
        this.flavour = flavour;
    }

    public String getflavour()  //Getter
    {
        return flavour;
    }
    public void setflavour(String flavour)  //Setter
    {
        this.flavour = flavour;
    }

    @Override
    public void consume()
    {
        System.out.println(this + " eaten");
    }

    public String toString() {
        return super.toString() + " вкуса '" + flavour + "'";
    }
}

