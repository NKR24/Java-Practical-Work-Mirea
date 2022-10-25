package num4;

import java.util.*;
public class Shop
{
    private List <String> pc = new ArrayList();
    public void AddPc(String comp)
    {
        pc.add(comp);
    }
    public String SearchPc(String comp)
    {
        return pc.contains(comp) ? comp : " ";
    }
    public void DeletePc(String comp)
    {
        pc.remove(comp);
    }
}
