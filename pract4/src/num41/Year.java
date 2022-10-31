package num41;//Времена года

import java.util.Scanner;

public class Year
{
    public enum Season
    {
        Winter(-15), Spring(10), Summer(20)
            {
                @Override
                public String getDescription()
                {
                    return "Теплый сезон";
                }
            },
        Autumn(10);
        private int avgTemp;
        Season(int avgTemp)
        {
            this.avgTemp=avgTemp;
        }
        public int getAvgTemp()
        {
            return avgTemp;
        }

        public String getDescription()
        {
            return "Холодный сезон";
        }
    }

    public static void main(String[] args)
    {
        Season season1 = Season.Summer;
        System.out.println("Мой любимый сезон - " + season1);
        print(Season.Autumn);
        printAllValues();
    }

    public static void print(Season season)
    {
        switch (season)
        {
            case Winter -> System.out.println("Я люблю зиму");
            case Spring -> System.out.println("Я люблю весну");
            case Summer -> System.out.println("Я люблю лето");
            case Autumn -> System.out.println("Я люблю осень");
        }
    }

    public static void printAllValues()
    {
        for(Season s : Season.values())
        {
            System.out.println(s + " " + s.getAvgTemp() +" "+ s.getDescription());
        }
    }
}

