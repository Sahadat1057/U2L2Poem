public class Poem
{
    private String name;

    public Poem(String yourName)
    {
        name = yourName;
    }

    // this method prints the entire poem
    /*public String printPoem()
    {
       return System.out.println(printFirstHalf());
    } */

    public String printFirstHalf()
    {
        String line1 = ("Hello " + name + "!");
        return line1;

    }

    public String printLine2()
    {
        String line2 = ("I have a poem for you");
        return line2;
    }

    public String printLine3()
    {
        String line3 = ("Roses are red");
        return line3;
    }

    public String printSecondHalf()
    {
        String line4 = ("Violets are blue");
        return line4;


    }
    public String printLine5()
    {
        String line5 = ("AP CSA is awesome!");
        return line5;
    }
    public String printLastLine()
    {
        String line6 = ("And that's the end - see you!");
        return line6;
    }
}

