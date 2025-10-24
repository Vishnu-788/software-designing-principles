package patterns.structural_patterns;
interface Image {
    public void display();
}

class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    @Override
    public void display(){
        System.out.println(fileName);
    }

    public void loadFromDisk() {
        System.out.println("Loading from disk...");
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);

        }
        realImage.display();
    }

}

public class ProxyPattern {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("Photo.jpg");
        image.display();
        image.display();
    }

}
