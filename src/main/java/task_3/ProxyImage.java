package task_3;

public class ProxyImage implements MyImage{
    private RealImage realImage;

    public ProxyImage(RealImage realImage){
        this.realImage = realImage;
    }
    @Override
    public void display() {
        realImage.display();
    }
}
