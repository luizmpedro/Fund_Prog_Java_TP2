import greenfoot.*;

/**
 * Worm. A sand worm. Very yummy. Especially crabs really like it.
 */
public class Worm extends Actor
{
<<<<<<< HEAD
    
=======
    public void act() {
        randomTurn();
        move(5);
    }
    
    private void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
>>>>>>> potionClass
}