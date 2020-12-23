package Lab10;

public interface AbstractChairFactory {
    UniversalChair createUniversalChair();
    MagicChair createMagicChair();
    VictorianChair createVictorianChair(int age);
}
