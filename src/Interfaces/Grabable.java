package Interfaces;

import Classes.Human;

public interface Grabable {
    void beTaken(Human human);
    void beReleased(Human human);
}
