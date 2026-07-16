class Comp{
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String get(int cost)
    {
        if(cost>=10)
        return "Pen";
    else
        return "Nothing";
    }
}

class Methods {
    public static void main(String[] args) {
        Comp c = new Comp();
        c.playMusic();
        String str=c.get(20);
        System.out.println(str);
    }
    
}
