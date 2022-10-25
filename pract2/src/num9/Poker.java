package num9;

import java.util.*;
public class Poker
{
    final private List <String> cards = new ArrayList <> ();
    Random random = new Random();
    Poker()
    {
        generateCards();
    }
    public void generateCards()
    {
        cards.addAll(
                Arrays.asList(
                        // Spades
                        "\uD83C\uDCA1",
                        "\uD83C\uDCA2",
                        "\uD83C\uDCA3",
                        "\uD83C\uDCA4",
                        "\uD83C\uDCA5",
                        "\uD83C\uDCA6",
                        "\uD83C\uDCA7",
                        "\uD83C\uDCA8",
                        "\uD83C\uDCA9",
                        "\uD83C\uDCAA",
                        "\uD83C\uDCAB",
                        "\uD83C\uDCAD",
                        "\uD83C\uDCAE",

                        // Hearts
                        "\uD83C\uDCB1",
                        "\uD83C\uDCB2",
                        "\uD83C\uDCB3",
                        "\uD83C\uDCB4",
                        "\uD83C\uDCB5",
                        "\uD83C\uDCB6",
                        "\uD83C\uDCB7",
                        "\uD83C\uDCB8",
                        "\uD83C\uDCB9",
                        "\uD83C\uDCBA",
                        "\uD83C\uDCBB",
                        "\uD83C\uDCBD",
                        "\uD83C\uDCBE",

                        // Diamonds
                        "\uD83C\uDCC1",
                        "\uD83C\uDCC2",
                        "\uD83C\uDCC3",
                        "\uD83C\uDCC4",
                        "\uD83C\uDCC5",
                        "\uD83C\uDCC6",
                        "\uD83C\uDCC7",
                        "\uD83C\uDCC8",
                        "\uD83C\uDCC9",
                        "\uD83C\uDCCA",
                        "\uD83C\uDCCB",
                        "\uD83C\uDCCD",
                        "\uD83C\uDCCE",

                        // Clubs
                        "\uD83C\uDCD1",
                        "\uD83C\uDCD2",
                        "\uD83C\uDCD3",
                        "\uD83C\uDCD4",
                        "\uD83C\uDCD5",
                        "\uD83C\uDCD6",
                        "\uD83C\uDCD7",
                        "\uD83C\uDCD8",
                        "\uD83C\uDCD9",
                        "\uD83C\uDCDA",
                        "\uD83C\uDCDB",
                        "\uD83C\uDCDD",
                        "\uD83C\uDCDE"

                )
        );
    }

    public String getCard()
    {
        int randomCard = random.nextInt(0, cards.size() - 1);
        String card = cards.get(randomCard);
        cards.remove(randomCard);
        return card;

    }
    public String getDeck()
    {
        if (cards.size() < 5) generateCards();

        StringBuilder deck = new StringBuilder();
        for (int i = 0; i < 5; i++)
            deck.append(getCard());
        return deck.toString();
    }
}
