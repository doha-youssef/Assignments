package television;
public class TV 
{
    int channel;
    int volumeLevel;
    boolean on;
    public TV(){}
    public void turnOn()
    {
        on=true;
    }
    public void turnOff()
    {
        on=false;
    }
    public void setChannel(int newChannel)
    {
        if(on && (newChannel  >= 1 && newChannel <= 120))
            channel=newChannel;
    }
    public void setVolume(int newVolume)
    {
        if(on && (newVolume  >= 1 && newVolume <= 7))
        volumeLevel=newVolume;
    }
    public void channelUp()
    {
        if(channel < 120 && on)
            channel++;
    }
    public void channelDown()
    {
        if(channel > 1 && on)
            channel--;
    }
    public void volumeUp()
    {
        if(volumeLevel < 7 && on)
            volumeLevel++;
    }
    public void volumeDown()
    {
        if(volumeLevel > 1 && on)
            volumeLevel--;
    }
}

    public void volumeDown()
    {
        volumeLevel--;
    }
}
