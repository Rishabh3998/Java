package JavaOOPSInOneVideo.EncapsulationIntro;

public class EncapsulationClass {
    Encapsulation en = new Encapsulation();
    // Here doWork will not be accessible because it is private and accessible only in defined classes
    // To access doWork we have to make this method visible in package i.e. define it with no keyword
    // like public, private and protected just define with void name () {}
}
